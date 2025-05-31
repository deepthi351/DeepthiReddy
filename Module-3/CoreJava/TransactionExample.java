import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class TransactionExample {
    private static final String URL = "jdbc:sqlite:test.db";
    public static void transferMoney(int fromId, int toId, double amount) {
        String debitSql = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditSql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL)) {
            conn.setAutoCommit(false);
            try (PreparedStatement debitStmt = conn.prepareStatement(debitSql);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSql)) {
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromId);
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toId);
                int debitRows = debitStmt.executeUpdate();
                int creditRows = creditStmt.executeUpdate();
                if (debitRows == 1 && creditRows == 1) {
                    conn.commit();
                    System.out.println("Transfer successful");
                } else {
                    conn.rollback();
                    System.out.println("Transfer failed, rolled back");
                }
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Exception occurred, rolled back: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        transferMoney(1, 2, 100.0);
    }
}

public class PatternMatchingSwitch {
    public static void checkObjectType(Object obj) {
        if (obj == null) {
            System.out.println("Null value");
            return;
        }
        if (obj instanceof Integer) {
            System.out.println("Integer with value " + obj);
        } else if (obj instanceof String) {
            System.out.println("String with value \"" + obj + "\"");
        } else if (obj instanceof Double) {
            System.out.println("Double with value " + obj);
        } else {
            System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }
    public static void main(String[] args) {
        checkObjectType(42);
        checkObjectType("Hello");
        checkObjectType(3.14);
        checkObjectType(true);
        checkObjectType(null);
    }
}

public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int castedInt = (int) myDouble;
        int myInt = 42;
        double castedDouble = (double) myInt;
        System.out.println("Original double: " + myDouble);
        System.out.println("Casted to int: " + castedInt);
        System.out.println("Original int: " + myInt);
        System.out.println("Casted to double: " + castedDouble);
    }
}

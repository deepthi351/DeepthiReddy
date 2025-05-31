import java.lang.reflect.*;
public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.lang.String");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }
        Method substring = clazz.getMethod("substring", int.class);
        String str = "Hello Reflection";
        String result = (String) substring.invoke(str, 6);
        System.out.println("Invoked substring: " + result);
    }
}

public class Overloading {
    static void add(int a, int b) {
        System.out.println("Addition of two numbers:" + a + b);
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
    static void mul(int a, int b) {
        System.out.println("Multiplication of two numbers:" + a * b);
    }
    static String add(String a, String b) {
        return a + b;
    }
}

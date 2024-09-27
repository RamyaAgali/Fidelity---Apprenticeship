public class Calculator {
    public int Addition(int a, int b) {

        return a + b;
    }
    public int Subtraction(int a, int b) {
        return a - b;
    }
    public int Multiplication(int a, int b) {
        return a * b;
    }
    double[] remainder;
    public double Division(int a, int b) {
        if( b == 0){
            throw new ArithmeticException("Division by Zero is not allowed");
        }
        System.out.println(a/b);
        System.out.println("Remainder: "+ a%b);
        return (double) a / b;
    }

}

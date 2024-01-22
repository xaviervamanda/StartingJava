public class App {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        // exemplos de uso da classe TypeNumber
        TypeNumber number = new TypeNumber(10);
        System.out.println(number.typeNumber(10));

        TypeNumber number1 = new TypeNumber(-10);
        System.out.println(number1.typeNumber(-10));

        // exemplos de uso da classe Fibonacci
        Fibonacci fibo = new Fibonacci(20);
        System.out.println(fibo.makeFibonacci(20));
    }
}

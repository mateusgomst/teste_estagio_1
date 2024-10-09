import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        Scanner ler = new Scanner(System.in);

        int entrada;
        entrada = ler.nextInt();

        System.out.println(fib.VerificarNumEmFibonacci(entrada));

        ler.close();
    }
}

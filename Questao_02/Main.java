import java.util.Scanner;

public class Main {
    public static boolean isInFibonacciSequence(int n) {
        int a = 0;
        int b = 1;

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        if (b == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (isInFibonacciSequence(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static String inverteString(String original) {
        char[] invertedChars = new char[original.length()];
        for (int i = 0; i < original.length(); i++) {
            invertedChars[i] = original.charAt(original.length() - 1 - i);
        }
        return new String(invertedChars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();

        String invertida = inverteString(original);
        System.out.println("A string invertida é: " + invertida);
    }
}
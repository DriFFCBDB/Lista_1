import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Digite um numero: ");

        Scanner scanner1 = new Scanner(System.in);
        numero = scanner1.nextInt();
        scanner1.close();

        System.out.println("O numero informado foi: " + numero);
    }
}
//Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        double num1 = 0d, num2 = 0d, soma = 0d;

        System.out.println("Digite o primeiro numero:\n");
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextDouble();

        System.out.println("Digite o segundo numero:\n");
        num2 = scanner1.nextDouble();
        scanner1.close();

        soma = num1 + num2;

        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
    }
}
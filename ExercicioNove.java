import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        double temperaturaF = 0;

        System.out.println("Digite a temperatura em Fahrenheit:\n");

        Scanner scanner1 = new Scanner(System.in);
        temperaturaF = scanner1.nextDouble();
        scanner1.close();

        System.out.println("A temperatura em Celsius de " + temperaturaF + " Fahrenheit é de " + (int) (5 * ((temperaturaF - 32) / 9)) + " C.");
    }
}
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        double valorMetro, valorCentimetro = 0;

        System.out.println("Digite o valor em metros:\n");
        Scanner scanner1 = new Scanner(System.in);
        valorMetro = scanner1.nextDouble();

        valorCentimetro = valorMetro * 100;

        System.out.println("O valor em centimetros é : " + valorCentimetro);
    }
}
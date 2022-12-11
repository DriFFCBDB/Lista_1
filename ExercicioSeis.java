import java.util.Scanner;
import java.lang.Math;

public class ExercicioSeis {
    public static void main(String[] args) {
        double raioCirculo, areaCirculo = 0;

        System.out.println("Digite o raio do circulo:\n");
        Scanner scanner1 = new Scanner(System.in);
        raioCirculo = scanner1.nextDouble();

        scanner1.close();

        areaCirculo = (double) (Math.PI * (Math.pow(raioCirculo, 2)));

        System.out.println("A area do circulo é\n" + areaCirculo + "m²");
    }
}

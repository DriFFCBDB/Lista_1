import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        double ladoQuadrado, areaQuadrado = 0;

        System.out.println("Digite o lado do quadrado:\n");
        Scanner scanner1 = new Scanner(System.in);
        ladoQuadrado = scanner1.nextDouble();

        scanner1.close();

        areaQuadrado = (ladoQuadrado * 2);

        System.out.println("O dobro da area do quadrado é: " + areaQuadrado * 2 + "m²");
    }
}
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, mediaNotas = 0;

        System.out.println("Digite a primeiro nota:\n");
        Scanner scanner1 = new Scanner(System.in);
        nota1 = scanner1.nextDouble();

        System.out.println("Digite a segunda nota:\n");
        nota2 = scanner1.nextDouble();

        System.out.println("Digite a terceira nota:\n");
        nota3 = scanner1.nextDouble();

        System.out.println("Digite a quarta nota:\n");
        nota4 = scanner1.nextDouble();


        mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media das notas é : " + mediaNotas);
    }
}
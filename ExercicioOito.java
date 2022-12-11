
import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        double horaReal, salario = 0;
        int horasTrabalhadasPMes;


        System.out.println("Digite quanto voce ganha por hora(R$):\n");
        Scanner scanner1 = new Scanner(System.in);
        horaReal = scanner1.nextDouble();

        System.out.println("Digite quantas horas voce trabalha por mes:\n");
        horasTrabalhadasPMes = scanner1.nextInt();

        scanner1.close();

        salario = horaReal * horasTrabalhadasPMes;

        System.out.println("O total do seu salario no mes é\n" + "R$" + salario);
    }
}
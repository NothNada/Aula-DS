import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        float salario = 0.0f, reajuste = 0.0f;
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva o salario: ");
        salario = scan.nextFloat();

        System.out.print("Escreva o a porcentagem do reajuste: ");
        reajuste = scan.nextFloat();

        reajuste /= 100;
        reajuste ++;

        System.out.printf("O seu novo salario é de %.2f \n",reajuste*salario);

        scan.close();
    }
}

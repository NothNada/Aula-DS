import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String nome = "";
        float salarioFixo = 0.0f, vendas = 0.0f;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.print("Digite seu salario fixo: R$");
        salarioFixo = scan.nextFloat();

        System.out.print("Digite quanto as vendas lucraram no mes: R$");
        vendas = scan.nextFloat();

        System.out.printf("%s No final do mes vc ganhara %.2f \n",nome,(salarioFixo  + (0.15*vendas)));

        scan.close();
    }
}

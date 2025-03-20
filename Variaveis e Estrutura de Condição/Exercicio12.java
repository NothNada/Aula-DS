import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salario = 0.0f, vendas = 0.0f, vendaporcarro = 0.0f;
        int carros = 0;

        System.out.print("digite o seu salario: R$ ");
        salario = scan.nextFloat();

        System.out.print("digite o valor total das vendas: R$ ");
        vendas = scan.nextFloat();

        System.out.print("digite a comissao por carro vendido: R$ ");
        vendaporcarro = scan.nextFloat();

        System.out.print("digite quantos carros vc vendeu: ");
        carros = scan.nextInt();

        System.out.printf("Seu salario final e %.2f \n",(vendas*1.05)+(carros*vendaporcarro)+salario);

        scan.close();
    }
}

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float custo_sla = 0.0f;

        System.out.print("Qual o custo de fabrica do carro: R$ ");
        custo_sla = scan.nextFloat();

        System.out.printf("O custo final e %.2f\n",custo_sla * 1.78f);

        scan.close();
    }
}

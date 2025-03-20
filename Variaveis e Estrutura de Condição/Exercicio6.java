import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        float kmporl = 0.0f, kms = 0.0f, precoporl = 0.0f;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os Km/L: ");
        kmporl = scan.nextFloat();

        System.out.print("Digite os Km: ");
        kms = scan.nextFloat();

        System.out.print("Digite o preco por L: R$");
        precoporl = scan.nextFloat();

        System.out.printf("A viagem custara R$ %.2f\n",(kms/kmporl)*precoporl);

        scan.close();
    }
}

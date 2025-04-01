import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] maiores = { 0, 0 };
        int i = 0;
        Scanner scan = new Scanner(System.in);

        while (i < 10) {
            i++;
            System.out.printf("Digite o %d numero: ", i);
            int num = scan.nextInt();

            if (num > maiores[0]) {
                maiores[1] = maiores[0];
                maiores[0] = num;
            } else if (num > maiores[1]) {
                maiores[1] = num;
            }
        }
        scan.close();

        System.out.printf("Maior numero: %d \n", maiores[0]);
        System.out.printf("Segundo maior numero: %d \n", maiores[1]);
    }
}

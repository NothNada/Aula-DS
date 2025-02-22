import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int anos = 0, meses = 0, dias = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos anos vc já viveu: ");
        anos = scan.nextInt();

        System.out.print("Quantos meses vc já viveu: ");
        meses = scan.nextInt();

        System.out.print("Quantos dias vc já viveu: ");
        dias = scan.nextInt();

        System.out.printf("Vc viveu %d dias\n",(anos * 365)+(meses*30)+dias);

        scan.close();
    }
}

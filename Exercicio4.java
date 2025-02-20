import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float largura = 0.0f , altura = 0.0f;

        System.out.print("Digite a altura do retangulo:");
        altura = scan.nextFloat();

        System.out.print("Digite a largura do retangulo:");
        largura = scan.nextFloat();

        System.out.printf("a area do retangulo e %.2f\n",(largura*altura));

        scan.close();
    }
}

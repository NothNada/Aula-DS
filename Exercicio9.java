import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        float total_eleitores = 0, votos_brancos = 0, votos_nulos = 0, votos = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o total de eleitores:");
        total_eleitores = scan.nextFloat();

        System.out.print("Digite o total de votos brancos:");
        votos_brancos = scan.nextFloat();

        System.out.print("Digite o total de votos nulos:");
        votos_nulos = scan.nextFloat();

        System.out.print("Digite o total de votos confirmados:");
        votos = scan.nextFloat();

        System.out.printf("A porcentagem de votos brancos: %.2f",(votos_brancos/total_eleitores)*100);
        System.out.print("%\n");
        System.out.printf("A porcentagem de votos nulos: %.2f",(votos_nulos/total_eleitores)*100);
        System.out.print("%\n");
        System.out.printf("A porcentagem de votos confirmados: %.2f",(votos/total_eleitores)*100);
        System.out.print("%\n");

        scan.close();
    }
}

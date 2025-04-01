import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        int i = 0, fim = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva um numero:");
        fim = scan.nextInt();

        System.out.println("Impar - Par");
        while(!(i==fim)){
            System.out.print(++i);
            System.out.print(" - ");
            System.out.println(++i);
        }

        scan.close();
    }
}
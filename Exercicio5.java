import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String a="",b="",c="";
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero:");
        a = scan.nextLine();

        System.out.print("Digite um numero:");
        b = scan.nextLine();

        System.out.println("Valor de a:"+a);
        System.out.println("valor de b:"+b);

        c = a;
        a = b;
        b = c;

        System.out.println("Valor de a:"+a);
        System.out.println("valor de b:"+b);


        scan.close();
    }
}

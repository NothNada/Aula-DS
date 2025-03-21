import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = 0,b = 0;

        System.out.print("Escreva o primeiro valor:");
        a = scan.nextInt();

        while(b == 0){
            System.out.print("Escreva o segundo valor:");
            b = scan.nextInt();
            if(b == 0){
                System.out.println("VALOR INVALIDO");
            }
        }

        System.out.printf("Divisão %d / %d = %.2f \n",a,b,(float)a/b);
        

        scan.close();
    }
}
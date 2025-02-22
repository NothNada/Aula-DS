import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        boolean foi = true;

        while(foi){
            try{
                System.out.print("Digite um numero inteiro:");
                a = scan.nextInt();

                System.out.printf("O antecessor de %d e %d",a,a-1);
                foi = true;
            }catch(Exception e){
                System.out.println("Erro faca as coisas direito");
                scan.next();
            }
        }

        scan.close();
    }
}

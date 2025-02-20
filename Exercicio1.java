import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner scan = new Scanner(System.in);
        boolean foi = true;

        while(foi){
            try {
                System.out.print("Digite um numero(inteiro):");
                a = scan.nextInt();
                System.out.print("Digite um numero(inteiro):");
                b = scan.nextInt();
                
                System.out.printf("A soma de %d com %d é %d\n",a,b,(a+b));
                System.out.printf("A subtracao de %d com %d é %d\n",a,b,(a-b));
                System.out.printf("A multiplicacao de %d com %d e %d\n",a,b,(a*b));
                System.out.printf("A divisao de %d com %d é %d\n",a,b,(a/b));
    
                foi = false;
            } catch (Exception e) {
                System.out.println("Por favor faca as coisas direito seu Filho Da Puta");
            }
        }

        scan.close();
    }
}
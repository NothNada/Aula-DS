import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        float a = 0.0f, b = 0.0f;
        Scanner scan = new Scanner(System.in);
        boolean foi = true;

        while(foi){
            try {
                System.out.print("Digite um numero: ");
                a = scan.nextInt();
                System.out.print("Digite um numero: ");
                b = scan.nextInt();

                if (b == 0) {
                    System.out.println("Erro: Divisao por zero nao e permitida. Tente novamente.");
                    continue;
                }
                
                System.out.printf("A soma de %.2f com %.2f é %.2f\n",a,b,(a+b));
                System.out.printf("A subtracao de %.2f com %.2f é %.2f\n",a,b,(a-b));
                System.out.printf("A multiplicacao de %.2f com %.2f e %.2f\n",a,b,(a*b));
                System.out.printf("A divisao de %.2f com %.2f é %.2f\n",a,b,(a/b));
    
                foi = false;
            } catch (Exception e) {
                System.out.println("Por favor faca as coisas direito");
                scan.next();
            }
        }

        scan.close();
    }
}
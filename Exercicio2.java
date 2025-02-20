import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        float a = 0, b = 0;
        Scanner scan = new Scanner(System.in);
        boolean foi = true;

        while(foi){
            System.out.print("Digite os Km:");
            a = scan.nextFloat();
            System.out.print("Digite os Litros gastos:");
            b = scan.nextFloat();
                
            System.out.printf("O carro usa 1L para percorres %.2f Km\n",(a/b));
    
            foi = false;
        }

        scan.close();
    }
}
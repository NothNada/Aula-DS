import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("O numero para descobrir o fatorial:");
        int a = scan.nextInt();

        System.out.printf("O fatorial de %d e : ",a);
        System.out.println(Fatorial(a));

        scan.close();
    }

    public static String Fatorial(int n){
        String texto = "";
        int T = n;
        texto += String.valueOf(n) + " x ";
        for(int i=1;i!=n;i++){
            if(n-i != 1){
                texto += String.valueOf(n-i) + " x ";
            }
            
            T *= (n-i);
        }
        texto += "1 = " + String.valueOf(T);

        return texto;
    }
}

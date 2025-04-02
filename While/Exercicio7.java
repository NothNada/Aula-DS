import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = 0;
        System.out.println("Digite um numero entre 1 e 20");
        do{
            System.out.print("Escreva o tamanho do lado:");
            l = scan.nextInt();
            
        }while(l<=20 && l>=1);

        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        scan.close();
    }
}

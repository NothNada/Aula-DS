import java.util.Scanner;

public class Exercicio11 {
    private static int antes = 0, depois = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Escreva o termo:");
        int a = scan.nextInt();

        for(int i=0;i<a;i++){
            System.out.println(proximo());
        }

        scan.close();
    }

    public static int proximo(){
        int novo = 0;
        novo = antes + depois;
        antes = depois;
        depois = novo;
        return novo;
    }
}

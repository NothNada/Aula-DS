import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int maior = 0, i = 0, cache = 0;
        Scanner scan = new Scanner(System.in);
        while(!(i==10)){
            i++;
            System.out.printf("Escreva o numero %d :",i);
            cache = scan.nextInt();
            if(maior < cache){
                maior = cache;
            }
        }
        scan.close();

        System.out.print("Maior numero ");
        System.out.println(maior);
    }
}

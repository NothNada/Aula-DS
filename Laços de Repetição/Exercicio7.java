import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int a = 0;
        Scanner scan = new Scanner(System.in);

        while(a == 0){
            System.out.print("1 -- ");
            a = scan.nextInt();
        }

        for(int i=1;i<a+1;i++){
            System.out.println(i);
        }

        scan.close();
    }
}

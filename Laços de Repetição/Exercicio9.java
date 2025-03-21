import java.util.Scanner;

public class Exercicio9 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int a = GetNumber(1, 10, "Tabuada do ");
        
        for(int i=1;i<11;i++){
            System.err.printf("%d x %d = %d \n",a,i,a*i);
        }
    }

    public static int GetNumber(int min, int max, String texto){
        int value = 0;
        do{
            System.out.print(texto);
            value = scan.nextInt();
        }while( value < min || value > max);

        return value;
    }
}

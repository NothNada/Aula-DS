import java.util.Scanner;

public class Exercicio3 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continuar = true;
        int a = 0, b = 0;

        while(continuar){
            a = GetNumber(1, 10, "Digite a primeira nota:");
            b = GetNumber(1, 10, "Digite a segunda nota:");
            System.out.printf("A media simples é %.2f \n",(float)(a+b)/2);

            continuar = GetResposta();
        }


        scan.close();
    }

    public static boolean GetResposta(){
        System.out.print("NOVO CALCULO (S/N)?");
        char resposta = scan.next().charAt(0);
        if(Character.toLowerCase(resposta) == 's'){
            return true;
        }

        return false;
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

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float litros = 0.0f;
        char tipo = ' ';

        System.out.println("[G] Gasolina");
        System.out.println("[A] Alcool");
        tipo = scan.nextLine().charAt(0);

        System.out.print("Quantos Litros: ");
        litros = scan.nextFloat();

        if(Character.toLowerCase(tipo) == 'g'){
            litros *= 3.30f;
            if(litros <= 20.0f){
                litros -= (0.04f * litros);
            }else{
                litros -= (0.06f * litros);
            }
        }else if(Character.toLowerCase(tipo) == 'a'){
            litros *= 2.90f;
            if(litros <= 20.0f){
                litros -= (0.03f * litros);
            }else{
                litros -= (0.05f * litros);
            }
        }

        System.out.printf("Vc pagara R$ %.2f\n",litros);

        scan.close();
    }
}

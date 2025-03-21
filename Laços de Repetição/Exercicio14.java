import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        String c = "";

        System.out.println("Escreva 's' para parar.");

        do{
            System.out.print("Escreva um numero:");
            c = scan.next();
            if(!Character.isLetter(c.charAt(0))){
                if(Integer.valueOf(c) < 0 || Integer.valueOf(c) > 1000){
                    System.out.println("Digite um numero entre 0 e 1000");
                }else{
                    lista.add(Integer.valueOf(c));
                }
            }
        }while(Character.toLowerCase(c.charAt(0)) != 's');

        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }


        scan.close();
    }
}

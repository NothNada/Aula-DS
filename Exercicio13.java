import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        String nome = null;
        float altura = 0.0f, peso = 0.0f;
        int sexo = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("[1] - Masculino");
        System.out.println("[2] - Feminino");
        sexo = scan.nextInt();

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.print("Digite sua altura: ");
        altura = scan.nextFloat();

        peso = (sexo == 1)?((72.7f * altura) - 58.0f):((62.1f * altura) - 44.7f);
        /*
        if(sexo == 1){
            peso = (72.7f * altura) - 58.0f;
        }else if(sexo == 2){
            peso = (62.1f * altura) - 44.7f;
        }
        */
        


        System.out.printf("%s seu peso ideal e %.2f\n",nome,peso);

        scan.close();
    }
}

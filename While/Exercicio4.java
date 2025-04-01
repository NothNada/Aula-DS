import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int notas = 0, alunos = 0, i = 0;

        System.out.print("Quantos alunos:");
        alunos = scan.nextInt();

        while(!(i==alunos)){
            i++;
            System.out.printf("Digite a Nota do aluno %d :",i);
            notas += scan.nextInt();
            
        }

        System.out.print("Media final:");
        System.out.println(notas/alunos);
        
        scan.close();
    }
}

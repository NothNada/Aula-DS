public class Exercicio12 {
    private static int antes = 0, depois = 1;

    public static void main(String[] args) {
        int a = 0;
        while(a<500){
            a = proximo();
            System.out.println(a);
        }
        System.out.print(" - Superou 500");

    }

    public static int proximo(){
        int novo = 0;
        novo = antes + depois;
        antes = depois;
        depois = novo;
        return novo;
    }
}

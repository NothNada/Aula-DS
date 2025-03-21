public class Exercicio10 {
    public static void main(String[] args) {
        float PopulacaoA = 80000.f;
        final float TaxaA = 0.03f;

        int anos = 0;

        boolean fim = true;

        float PopulacaoB = 200000.f;
        final float TaxaB = 0.015f;

        while(fim){
            anos ++;
            PopulacaoA += PopulacaoA * TaxaA;
            PopulacaoB += PopulacaoB * TaxaB;
            if(PopulacaoA > PopulacaoB){
                fim = false;
            }
        }

        System.out.printf("A populacao A supera a B em %d anos\n",anos);


    }
}

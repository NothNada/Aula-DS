package models;

public class ModeloCarro extends Carro {
    private int ano1;
    private int ano2;
    private int ano3;

    public void setAnos(int ano1, int ano2, int ano3) {
        this.ano1 = ano1;
        this.ano2 = ano2;
        this.ano3 = ano3;
    }

    public int getAnoMenorPreco() {
        double menorPreco = calcularMenorPreco();
        if (menorPreco == precoAno1) {
            return ano1;
        } else if (menorPreco == precoAno2) {
            return ano2;
        } else {
            return ano3;
        }
    }

    public int getAnoMaiorPreco() {
        double maiorPreco = calcularMaiorPreco();
        if (maiorPreco == precoAno1) {
            return ano1;
        } else if (maiorPreco == precoAno2) {
            return ano2;
        } else {
            return ano3;
        }
    }

    @Override
    public void exibeInformacaoCarro() {
        super.exibeInformacaoCarro();
        System.out.println("O modelo do menor preço é o do ano " + getAnoMenorPreco() + " com preço R$" + calcularMenorPreco());
        System.out.println("O modelo do maior preço é o do ano " + getAnoMaiorPreco() + " com preço R$" + calcularMaiorPreco());
    }
}

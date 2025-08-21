public class Carro {
    private String nomeModelo;
    protected double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calcularMenorPreco() {
        double menorPreco = precoAno1;
        
        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }
        
        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoAno1;
        
        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        
        return maiorPreco;
    }

    public void exibirInformacaoCarro() {
        System.out.println("Nome do carro: " + nomeModelo);
        System.out.println("Preço ano 1: " + precoAno1);
        System.out.println("Preço ano 2: " + precoAno2);
        System.out.println("Preço ano 3: " + precoAno3);
        System.out.println("Menor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }
}

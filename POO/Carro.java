public class Carro {
    String modelo = "Civic G-10 type-r";
    String marca = "Honda";
    int ano = 2017;
    int velocidade = 0;
    int velocidade_max = 300;

    Carro(String modelo, String marca, int ano, int velocidade, int velocidade_max){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
        this.velocidade_max = velocidade_max;
    }

    Carro(){
        System.out.println("Carregando carro padrão!");
    }

    public boolean acelerar(int aceleracao){
        this.velocidade += aceleracao;

        if(this.velocidade > this.velocidade_max){
            this.velocidade = velocidade_max;
            System.out.println("Velocidade maxima atingida!");
            return false;
        }

        return true;
    }

    public boolean freiar(int freio){
        this.velocidade -= freio;

        if(this.velocidade < 0){
            this.velocidade = 0;
            System.out.println("Carro parado!");
            return false;
        }

        return true;
    }

    public void informacao(int qual){
        switch (qual) {
            case 1:
                marca();
                break;
            case 2:
                modeloAno();
                break;
            case 3:
                velocidade();
                break;
        
            default:
                marca();
                modeloAno();
                velocidade();
                break;
        }
    }

    public void informacao(){
        marca();
        modeloAno();
        velocidade();
    }

    private void marca(){
        System.out.println("Marca:"+this.marca);
    }

    private void modeloAno(){
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Ano:"+this.ano);
    }

    private void velocidade(){
        System.out.println("Velocidade:"+this.velocidade);
        System.out.println("Velocidade Maxima:"+this.velocidade_max);
    }

}

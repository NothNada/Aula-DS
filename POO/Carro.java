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

    public void informacao(){
        System.out.println("Marca:"+this.marca);
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Ano:"+this.ano);
        System.out.println("Velocidade:"+this.velocidade);
        System.out.println("Velocidade Maxima:"+this.velocidade_max);
    }


}

import models.ModeloCarro;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        
        meuCarro.setNomeModelo("Agile");
        meuCarro.setAnos(2013, 2012, 2011);
        meuCarro.setPrecos(30000, 29000, 28000);
        
        meuCarro.exibeInformacaoCarro();
    }
}

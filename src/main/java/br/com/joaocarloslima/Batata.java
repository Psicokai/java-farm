package br.com.joaocarloslima;

public class Batata extends Produto {

    @Override
    public String getImagem() {
        return "images/batata" + tamanho + ".png";
    }
    
}

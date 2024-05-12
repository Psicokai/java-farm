package br.com.joaocarloslima;

public class Cenoura extends Produto {

    @Override
    public String getImagem() {
        return "images/cenoura" + tamanho + ".png";
    }

}

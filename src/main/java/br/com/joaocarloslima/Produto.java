package br.com.joaocarloslima;

public abstract class Produto {

    int tamanho = 1;
    private int tempoDeVida = 1;
    private int tempoDeCrescimento = 3;

    public void crescer(){
        tempoDeVida++;
        if (tempoDeVida % tempoDeCrescimento == 0){
            tamanho++;
            if (tamanho > 4) tamanho = 4;
        }
    }

    public boolean podeColher(){
        return tamanho == 4;
    }


    public abstract String getImagem();

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + tamanho;
        result = prime * result + tempoDeVida;
        result = prime * result + tempoDeCrescimento;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (tamanho != other.tamanho)
            return false;
        if (tempoDeVida != other.tempoDeVida)
            return false;
        if (tempoDeCrescimento != other.tempoDeCrescimento)
            return false;
        return true;
    }

    

    
}

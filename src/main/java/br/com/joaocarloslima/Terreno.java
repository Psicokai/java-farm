package br.com.joaocarloslima;

public class Terreno {

    private Produto produto;

    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Produto produto) {
        this.produto = produto;
    }

    public void colher(Celeiro celeiro) {
        if (produto != null && produto.podeColher()) {
            celeiro.armazenar(produto);
            produto = null;
        }
    }

    public boolean estaOcupado() {
        return produto != null;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

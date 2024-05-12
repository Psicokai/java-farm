package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Terreno> terrenos = new ArrayList<>();
    private Celeiro celeiro = new Celeiro();

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public Fazenda(){
        for(int x = 0; x<13; x++){
            for(int y = 0; y<13; y++){
                terrenos.add(new Terreno(x, y));
            }
        }
    }

    public void plantar(Produto produto, int x, int y){
        if(!celeiro.tem(produto.getClass())) {
            throw new RuntimeException("Produto não disponível: " + produto.getClass().getName());
        }
        if(getTerreno(x, y).estaOcupado()) throw new RuntimeException("Terreno ocupado.");
        getTerreno(x, y).plantar(produto);
        celeiro.consumir(produto.getClass()); // Consumir apenas uma unidade do produto do celeiro
    }
    

    public void colher(int x, int y){
        getTerreno(x, y).colher(celeiro);
    }

    public Terreno getTerreno(int x, int y){
        return terrenos.get(x*13 + y);
    }
}




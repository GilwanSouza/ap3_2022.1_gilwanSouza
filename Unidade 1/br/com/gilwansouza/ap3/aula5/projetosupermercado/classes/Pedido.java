package br.com.gilwansouza.ap3.aula5.projetosupermercado.classes;

import java.util.List;
import java.util.ArrayList;

public class Pedido {

    private List <Item> itens = new ArrayList<>();

    public Pedido(String string) {
    }

    public void Compra(Item item) {
        itens.add(item);
    }

    public void Remove(Item item) {
        itens.remove(item);
    }

    public Item Altera(Item item) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).equals(item)) {
                itens.set(i, item);
            }
        }
        return item;
    }

    public void itens(){
        for (Item item: itens) {
            System.out.println(item);
        }
    }
}

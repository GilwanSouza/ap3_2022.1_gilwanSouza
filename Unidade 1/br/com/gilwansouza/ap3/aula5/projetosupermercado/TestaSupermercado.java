package br.com.gilwansouza.ap3.aula5.projetosupermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.gilwansouza.ap3.aula5.projetosupermercado.classes.Item;
import br.com.gilwansouza.ap3.aula5.projetosupermercado.classes.Pedido;
import br.com.gilwansouza.ap3.aula5.projetosupermercado.classes.Produto;

public class TestaSupermercado {

    public static <Compra> void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item_comprado;
        double valor;
        int quantidade;
        
        List<Compra> asCompras = new ArrayList<>();

        Compra Compra = null;

        while (asCompras.size() < 5) {
            Item itemSupermercado = new Item("\nDiga qual item está sendo comprado");
            item_comprado = input.nextLine();

            Pedido valorProduto = new Pedido("\n Diga qual item está sendo comprado");
            valor = input.nextDouble();

            Produto qtd = new Produto("\n Diga qual item está sendo comprado");
            quantidade = input.nextInt();

            asCompras.add(Compra);
        }

        asCompras.forEach(System.out::println);

        input.close();
    }
}
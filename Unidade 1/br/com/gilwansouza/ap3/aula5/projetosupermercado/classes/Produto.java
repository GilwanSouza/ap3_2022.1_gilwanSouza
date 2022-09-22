package br.com.gilwansouza.ap3.aula5.projetosupermercado.classes;

public class Produto {

    private double preco;
    private int quantidade_estoque;

    public Produto(String string) {
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }
    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
    @Override
    public String toString() {
        return 
        "Produto"                     + 
        "\npreço = "                  + 
        preco                         +
        "\nQuantidade no estoque = "  + 
        quantidade_estoque            + "\n";
    }
}

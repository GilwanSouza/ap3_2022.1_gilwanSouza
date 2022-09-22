package br.com.gilwansouza.ap3.aula5.projetosupermercado.classes;

public class Item {

    private Produto produto;
    private int quantidade;

    public Item(String string) {
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Item"                 +
        "\nProduto = "                + produto           +
        "\nQuantidade no estoque = "  + quantidade        + "\n";
    }
}

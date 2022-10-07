package br.com.gilwansouza.ap3.aula6;

public class Livro {
    private String titulo;
    private int qtdPag;
    private int pagLidas;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, int qtdPag, int pagLidas) {
        this.titulo = titulo;
        this.qtdPag = qtdPag;
        this.pagLidas = pagLidas;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getQtdPaginas() {
        return qtdPag;
    }
    public void setQtdPaginas(int qtdPag) {
        this.qtdPag = qtdPag;
    }
    public int getPagLidas() {
        return pagLidas;
    }
    public void setPaginasLidas(int pagLidas) {
        this.pagLidas = pagLidas;
    }

    public void verificarProgresso(){
        double porcentagem =  (this.pagLidas * 100) / this.qtdPag;
        System.out.println("\n Você já leu " + porcentagem + " por cento do livro \n");
    } 
}

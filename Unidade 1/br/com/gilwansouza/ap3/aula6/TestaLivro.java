package br.com.gilwansouza.ap3.aula6;

public class TestaLivro {
    public static void main(String[] args) throws Exception {
        Livro guiaDeCaçaBob = new Livro("O guia de caça de Bob Singer");
        guiaDeCaçaBob.setQtdPaginas(285);

        System.out.println(
            "O livro "   + guiaDeCaçaBob.getTitulo()      +
            " possui "   + guiaDeCaçaBob.getQtdPaginas()  +
            " páginas"
            );

        guiaDeCaçaBob.setPaginasLidas(85);
        guiaDeCaçaBob.verificarProgresso();

        guiaDeCaçaBob.setPaginasLidas(160);
        guiaDeCaçaBob.verificarProgresso();

        Livro meuLivro = new Livro("Build Your API with Spring", 285, 85);

        System.out.println(
            "O livro "   + meuLivro.getTitulo()      +
            " possui "   + meuLivro.getQtdPaginas()  +
            " páginas"
            );

    }
}
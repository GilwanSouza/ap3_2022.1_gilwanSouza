package br.com.gilwansouza.ap3;

import java.util.Scanner;

public class Questao1 {

    // Ler um valor da entrada padrão e escrever:
    // É MAIOR QUE 10! se o valor lido for maior que 10
    // Caso contrário escrever NÃO É MAIOR QUE 10.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorLido;

        System.out.printf("Digite um valor: ");
        valorLido = entrada.nextInt();

        if (valorLido >= 10)
            System.out.printf("\n É maior ou igual a 10!");
        else
            System.out.printf("\n Não é maior que 10!");

        entrada.close();
    }
}
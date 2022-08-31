package br.com.gilwansouza.ap3;

import java.util.Scanner;

public class Questao3 {

    // Ler um valor da entrada padrão e escrever:
    // É MAIOR QUE 10! se o valor lido for maior que 10
    // Caso contrário escrever NÃO É MAIOR QUE 10.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorLido[] = new int[10];

        // Ler os números
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor:");
            valorLido[i] = entrada.nextInt();
        }

        // Escrever os números
        for (int i = 0; i < valorLido.length; i++) {
            System.out.println("valorLido[" + i + "]" + valorLido[i]);
        }
        // Escrever a média
        int soma = 0;
        for (int i = 0; i < valorLido.length; i++) {
            soma += valorLido[i];
        }

        System.out.println("Soma=" + soma);

        entrada.close();
    }
}
/*
Faça um programa em Java que leia da entrada padrão a idade de 4096 pessoas 
e exiba quantas pessoas são maiores de idade.
*/

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        int contagemPessoas = 0;

        for (int i = 0; i < 4096; i++) {
            System.out.println("\n Digite as idades das pessoas: ");
            idade = input.nextInt();

            if (idade >= 18) {
                contagemPessoas = contagemPessoas + 1;
            }
        }

        System.out.println("\n A quantidade de pessoas maiores de idade é de: " + contagemPessoas + "\n");

        input.close();

    }
}
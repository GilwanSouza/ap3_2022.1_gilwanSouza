/*
 * Faça um programa em Java que gere um número aleatório inteiro entre 0 e 100 e solicite um número ao usuário. 
 * O objetivo é que o usuário acerte o número gerado. Se o número digitado for menor que o gerado, diga “MAIOR”, 
 * se for maior diga “MENOR”, e solicite um número ao usuário novamente. Repita este processo até que o usuário acerte o número gerado. 
 * Após isso, informe quantas tentativas o usuário fez até acertar.
 */

import java.util.Random;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        int contadorTentativas = 0;

        Scanner scanner = new Scanner(System.in);
        int valorLido;
        boolean fimJogo = true;
        Random aleatorio = new Random();

        int numeroAleatorio_0_a_100 = aleatorio.nextInt(100);

        while (fimJogo) {

            System.out.println("\n Acabei de escolher um número de 0 à 100, agora me diga qual acha que é: ");
            valorLido = scanner.nextInt();

            contadorTentativas++;

            if (valorLido < numeroAleatorio_0_a_100) {
                System.out.println(" Poxa o valor que você digitou é MENOR que o escolhido");

            } else if (valorLido > numeroAleatorio_0_a_100) {
                System.out.println(" Poxa o valor que você digitou é MAIOR que o escolhido");

            } else {
                fimJogo = false;
                System.out.println(contadorTentativas);
                System.out.println(" UAU! Você acertou o número");
                scanner.close();
            }

            System.out.println(" Você tentou " + contadorTentativas + "vezes");

        }
    }
}

/* 
 * Escreva um programa em Java para ler o nome e a idade de uma pessoa. Exiba quantos dias de vida ela possui. 
 * Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de
 *  vida Um exemplo de saída: "MARIA, VOCÊ JÁ VIVEU 6935 DIAS!"
*/
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        int ano = 365;

        System.out.println("\n Digite o seu nome: ");
        nome = input.nextLine();

        System.out.println("\n Digite sua idade:");
        idade = input.nextInt();

        System.out.println("Nossa " + nome + ", você já viveu " + idade * ano + " dias!");

        input.close();
    }
}
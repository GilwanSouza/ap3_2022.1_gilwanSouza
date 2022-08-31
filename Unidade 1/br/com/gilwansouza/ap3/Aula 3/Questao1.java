import java.util.Scanner;
/*Sabendo que latão é constituído de 70% de cobre e 30% de zinco, faça um programa em Java que indique
a quantidade de cada um desses componentes para se obter uma certa quantidade de latão (a quantidade deve ser requerida do usuário).
        cobre = 0.7;
        zinco = 0.3;
*/

public class Questao1 {

    public static void main(String[] args) {
        Scanner valorDesejado = new Scanner(System.in);
        Double qtdLatao;

        System.out.println("\n Digite a quantidade de latão desejada: ");
        qtdLatao = valorDesejado.nextDouble();

        System.out.println("Quantidade de zinco necessaria é de " + qtdLatao * 0.3);

        System.out.println("Quantidade de cobre necessaria é de " + qtdLatao * 0.7);

        valorDesejado.close();
    }
}
import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner vel = new Scanner(System.in);

        int velMax = 60;
        int velocidade = 0;

        System.out.println("Digite a velocidade do veiculo: ");
        velocidade = vel.nextInt();

        int velResult = velocidade - velMax;

        if (velResult > 0 && velResult <= 10) {
            System.out.println("O motorista deve pagar uma multa de R$50");

        } else if (velResult >= 11 && velResult <= 30) {
            System.out.println("O motorista deve pagar uma multa de R$100");

        } else if (velResult > 30) {
            System.out.println("O motorista deve pagar uma multa de R$200");

        } else {
            System.out.println("O motorista não precisa pagar nenhuma multa");
        }
        vel.close();
    }
}
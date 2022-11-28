import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Escreve {
    public static void main(String[] args) {

        Random num = new Random();

        try {
            FileWriter arquivo = new FileWriter("numAleatorios.txt", true);
            PrintWriter impressora = new PrintWriter(arquivo);
            
            for (int i = 0; i < 200; i++) {
                impressora.println(numero.nextInt(1000));
                impressora.flush();
            }
            impressora.close();

        } catch(Exception e ) {
            e.printStackTrace();
        }
    }
}
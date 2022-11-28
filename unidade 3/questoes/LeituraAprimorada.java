import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraAprimorada {
    public static void main(String[] args) {

        int contador = 0;

        try {
            FileReader arquivo = new FileReader("pessoas.csv");
            BufferedReader leitor = new BufferedReader(arquivo);

            while (leitor.ready()) {
                String linhaLida = leitor.readLine();

                if (linhaLida.split(",")[4].equalsIgnoreCase("policial")) {
                    contador++;
                }
            }

            System.out.println("\nExiste " + contador + " policiais cadastrados!");

            leitor.close();
            arquivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
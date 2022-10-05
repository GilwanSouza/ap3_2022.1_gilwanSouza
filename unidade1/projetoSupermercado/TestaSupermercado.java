import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaSupermercado {

    public static <Compra> void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item_comprado;
        double valor;
        int quantidade;
        
        List<Compra> asCompras = new ArrayList<>();

        Compra Compra = null;

        while (asCompras.size() < 5) {
            Item itemSupermercado = new Item("\nDiga qual item está sendo comprado");
            item_comprado = input.nextLine();
            //Ta errado. falta colocar o que o usuário digitou dentro do itemSupermercado

            Pedido valorProduto = new Pedido("\n Diga qual item está sendo comprado");
            valor = input.nextDouble();

            Produto qtd = new Produto("\n Diga qual item está sendo comprado");
            quantidade = input.nextInt();

            asCompras.add(Compra);
        }

        asCompras.forEach(System.out::println); //bacana!

        input.close();
    }
}
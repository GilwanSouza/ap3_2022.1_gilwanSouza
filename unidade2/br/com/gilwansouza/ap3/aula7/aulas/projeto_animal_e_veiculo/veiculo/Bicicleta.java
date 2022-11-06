public class Bicicleta extends Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Pedala!");
        super.acelerar();
    }
}
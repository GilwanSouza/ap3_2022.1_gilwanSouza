public class Carro extends Veiculo {

    private String placa = "Placa Padrão";

    @Override
    public void acelerar() {
        System.out.println("Acelerando um Carro!");
        super.acelerar();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro"       +
        "Placa = "   + placa + "\n" + super.toString();
    }
}
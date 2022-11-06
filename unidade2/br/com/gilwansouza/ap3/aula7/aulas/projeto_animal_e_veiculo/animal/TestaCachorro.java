//Piscou, perdeu!
public class TestaCachorro {
    public static void main(String[] args) {
        
        //Coisas do Animal
        Animal cachoroBruto = new Animal();
        cachoroBruto.getPeso();
        cachoroBruto.getGrupo();
        System.out.println(cachoroBruto);

        //Coisas do Cachorro
        Cachorro cachorroDelas = new Cachorro();
        cachorroDelas.getRaca();
        cachorroDelas.getPorte();
        System.out.println(cachorroDelas);

        //Coisas do Gato
        Gato gatoObeso = new Gato();
        gatoObeso.getRaca();
        gatoObeso.getPorte();
        System.out.println(gatoObeso);
    }
}
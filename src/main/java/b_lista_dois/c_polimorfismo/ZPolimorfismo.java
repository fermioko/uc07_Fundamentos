package b_lista_dois.c_polimorfismo;

public class ZPolimorfismo {
    public static void main(String[] args) {

        Animal a = new Animal();
        System.out.println("Animal = " + a.fazerSom());

        Cachorro c = new Cachorro();
        System.out.println("Cachorro = " + c.fazerSom());

        Gato g = new Gato();
        System.out.println("Gato = " + g.fazerSom());

    }
}

//(Polimorfismo) -
// Crie uma classe Animal com o método fazerSom().
// Depois, crie classes derivadas Cachorro e Gato,
// cada uma implementando o método de forma diferente,
// usando polimorfismo.


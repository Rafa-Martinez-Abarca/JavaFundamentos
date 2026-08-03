public class Main {

    public static void main(String[] args) {

        Animales[] animal = new Animales[4];

        animal[0] = new Perro("Roko", 2, "Labrador");
        animal[1] = new Delfin("Deltox", 6);
        animal[2] = new Agila("Alitas", 4);
        animal[3] = new Pato("Donald", 7);

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i]);
            animal[i].hacerSonido();
            animal[i].comer();
        }

        Pato pato = new Pato("Roland", 3);

        pato.volar();
        pato.nadar();

        Volador volarin = new Agila("Selt", 3);
        volarin.volar();
    }
}

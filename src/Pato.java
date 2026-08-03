public class Pato extends Animales implements Volador, Nadando  {

    public Pato(String nombre, int edad){
        super(nombre, edad);
    }
    

    @Override

    public void hacerSonido(){
        System.out.println(" kua kua ");
    }

    @Override
    public void nadar(){
        System.out.println(" El pato nada. ");
    }

    @Override
    public void volar(){
        System.out.println(" El pato puede volar ");
    }
}

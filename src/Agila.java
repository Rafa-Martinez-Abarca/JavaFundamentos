public class Agila extends Animales implements Volador{

    public Agila(String nombre, int edad){
        super(nombre, edad);
    }
    
    @Override
    public void  hacerSonido(){
        System.out.println(" buuu ");
    }

    @Override

    public void volar(){
        System.out.println(" El agila vulea. ");
    }
}

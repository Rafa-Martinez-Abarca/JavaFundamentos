public class Delfin extends Animales implements Nadando {

    public Delfin(String nombre, int edad){
        super(nombre, edad);
    }
   
    @Override
        public void hacerSonido(){
        System.out.println(" PRRRR ");
    }

    @Override
    public void nadar(){
        System.out.println(" El delfín esta nadando. ");
    
}
}

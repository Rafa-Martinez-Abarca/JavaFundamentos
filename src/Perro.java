public class Perro extends Animales {

    String raza;

    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }

    public void moverCola(){
        System.out.println(" El perro mueve la cola ");
    }
    @Override
    public void hacerSonido(){
        
        System.out.println(" Guau gua ");
    }

    @Override
    public String toString(){
        return super.toString() + " Raza " + raza;
    }
    
}

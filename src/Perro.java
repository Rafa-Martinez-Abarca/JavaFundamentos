public class Perro extends Animales{

    String raza;

    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza; 
    }

    public String getRaza(){
        return raza;
    }

    @Override

    public void hacerSonido(){
        System.out.println(" Guau guau");
    }

@Override 

public String toString(){
   return super.toString() + "Raza: " + raza;
}


    
}

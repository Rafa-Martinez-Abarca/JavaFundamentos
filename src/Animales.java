public class Animales {

    String nombre;
    int edad;
    

    public Animales(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getnombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void hacerSonido(){
       System.out.println("El animal hace un sonido ");
    }

    @Override

    public String toString(){
        return "El nombre del animal es: " + nombre + " la edad es: " + edad + " años, ";
    }
    
}

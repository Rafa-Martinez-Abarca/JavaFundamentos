public abstract class Animales {

    String nombre;
    int edad;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void hacerSonido();

    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    @Override
    public String toString() {
        return "El nombre es: " + nombre +
               ", tiene: " + edad + " años.";
    }
}
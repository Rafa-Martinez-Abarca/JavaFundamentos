public class Gato extends Animales {
 String colorOjos;

    public Gato(String nombre, int edad, String colorOjos){
        super(nombre, edad);
        this.colorOjos = colorOjos;
    }

    public String getColorOjos(){
        return colorOjos;
    }

    @Override

    public void hacerSonido(){

       
        System.out.println("Miau miau ");
    }

   
  @Override
    public String toString(){
        return super.toString() + " El color de ojos es: " + colorOjos;
    }







    }


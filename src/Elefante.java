public class Elefante extends Animales{
   
   double peso;


    public Elefante(String nombre, int edad, double peso){
        super(nombre, edad);
        this.peso = peso;
    }
@Override
public void hacerSonido(){

   
    System.out.println(" prrrrr  ");
}
    
  @Override
    public String toString(){
        return super.toString() + " Pesa:  " + peso + " Kg.";
    }


}

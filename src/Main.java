
//import java.util.Scanner;

public class Main {
    

     
    public static void main(String[] args) {
     
Animales[] animales = new Animales[3];

animales[0] = new Perro("Roky", 4, " Labardor");
animales[1] =  new Gato("Misifu, ", 5, " Azules. ");
animales[2] = new Elefante("Dumbo, ", 2, 105.8);

for(int i = 0; i < animales.length; i++){

animales[i].hacerSonido();

System.out.println(animales[i]);

}


}



}






         
        


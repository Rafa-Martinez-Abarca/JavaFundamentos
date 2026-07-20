
import java.util.Scanner;

public class Main {
    

     
    public static void main(String[] args) {

        String contrasenia = "Java";
         int intentos = 10;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la contraseña ");
        String contrasenia_ingresada = sc.nextLine();

        while(!contrasenia.equals(contrasenia_ingresada) && intentos > 0){
            
            
                System.out.println("Esccriba de nuevo la contreseña ");
                contrasenia_ingresada = sc.nextLine();
                intentos--;
                
        

        }

        String mensaje =(contrasenia.equals(contrasenia_ingresada))?
         "Su contrasena es correcta" : "Usuario bloqueadol"; 
            
       
         System.out.println(mensaje);
   
    }
 }

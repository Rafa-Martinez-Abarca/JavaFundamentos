
import java.util.Scanner;

public class Main {
    

     
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         String contrasenia = "Java123";
         
         int nuevoNuemero;
         String pregunta = "s";
         int numIntentos = 3;
         String insertacontr;
         do{
            


            System.out.println("Introduce la contraseña ");
            insertacontr = sc.nextLine();
            
           if(contrasenia.equals(insertacontr)){

            System.out.println("contraseña correcta ");

       } else {

              numIntentos--;
                
                System.out.println("Tienes " + numIntentos + " intentos.");
          
            
           }
            
         } while (!contrasenia.equals(insertacontr) && numIntentos >= 1 );

            
                if(contrasenia.equals(insertacontr)){

                    System.out.println("Bienvenido. ");

                    do {
                        System.out.println("que numero quieres multipicar? ");
                        nuevoNuemero = sc.nextInt();
                        for(int i = 1; i <= 10; i++){
                            System.out.println(
                            nuevoNuemero + " * " + i + " = " + (nuevoNuemero * i));
                        }

                        System.out.println("Quieres volver a imprimir otra tabla? s/n ");
                        sc.nextLine();
                        pregunta = sc.nextLine();

                        
                    } while (pregunta.equals("s"));
                    
                    System.out.println("Hasta pronto ");
                
                
                
                } else {

                     System.out.println("Usuario bloqueado. ");
                }
                    
            
                 
            
               
            }

             
            }
           

        
    



import java.util.Scanner;

public class Main {
    

     
    public static void main(String[] args) {
        
 Scanner sc = new Scanner(System.in);

int[] numeros = new int[5];
for(int i = 0; i < numeros.length; i++){
System.out.println("Que numero quieres? ");

numeros[i] = sc.nextInt();
}

int num;
boolean encontrado = false;

System.out.println("Que numero te gustaria buscar? ");
num = sc.nextInt();

for ( int i = 0; i < numeros.length; i++){




if( numeros[i] == num){

    encontrado = true;

} 

}
    if(encontrado){
        System.out.println("Existe ");
    }else {
        System.out.println("No existe ");
    }

     sc.close();
}

}
         
        


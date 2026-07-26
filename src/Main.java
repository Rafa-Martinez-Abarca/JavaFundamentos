
import java.util.Scanner;

public class Main {
    

     
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

int[] numeros = new int[10];

for(int i = 0; i < numeros.length; i++){
    System.out.println("Que numeros quieres añadir? ");
    numeros[i] = sc.nextInt();
}

// Ejecicio mayo y menor
int numMayor = numeros[0];
int numMenor = numeros[0];


for(int i = 0; i < numeros.length; i++){

    if(numeros[i] > numMayor){
        numMayor = numeros[i];
    } else if(numeros[i] < numMenor){
        numMenor = numeros[i];
    }
}
    System.out.println("El numero mayor es: " + numMayor);
    System.out.println("El numero menor es: " + numMenor);
    
// Suma y media

int suma = 0;
double media;

for(int i = 0; i < numeros.length; i++){

    suma += numeros[i];
    
}
System.out.println("La suma de todos los valores es: " + suma);

media = suma / numeros.length;

System.out.println("la media del array es: " + media );

int numPares = 0;
int numImpares = 0;
for(int i = 0; i < numeros.length; i++){
     if (numeros[i] % 2 == 0) {
        numPares++;
     } else {
        numImpares++;
     }
    
}

    System.out.println("Hay " + numPares + " pares");
    System.out.println("Hay " + numImpares + " imapres");


    // Buscar un numero
    boolean existe = false;
    int buscarNum;
    System.out.println("Que numero quieres buscar? ");

    buscarNum = sc.nextInt();

    for(int i = 0; i < numeros.length; i++){
        if (numeros[i] == buscarNum){
            existe = true;
        }
    }

    if (existe) {
        System.out.println("El numero que buscas si esta dentro del array. ");
    } else {
        System.out.println("El numero que buscas no esta dentro del array. ");
    }
    

 sc.close();
}

}
         
        


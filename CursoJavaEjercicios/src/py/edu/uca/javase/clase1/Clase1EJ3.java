package py.edu.uca.javase.clase1;

import java.util.Scanner;

public class Clase1EJ3 {

	public static void main(String[] args) {
    
	  int[] numeros = new int[5];
	  float promedio = 0;
	  Scanner in = new Scanner(System.in);
    for (int i = 0; i < numeros.length; i++) {
 
		System.out.println("Ingrese el valor de " + i + ":"  );  
    	numeros[i] = in.nextInt();	
    	promedio = (promedio + numeros[i]) / numeros.length; 
	   
    }
    in.close();
     System.out.println("El promedio entre los valores es: " + promedio);
     
	}

}

package py.edu.uca.javase.clase1;

import java.lang.Math;
import java.util.Scanner;

public class Clase1EJ2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Imprimir Valores
		System.out.println("Ingrese un numero:" );
		float numero;
	    numero = in.nextInt();
	    
	    
	    //args[0] le pasamos al ejecutar en argumentos del programa 
	    double var = Double.parseDouble(args[0]);
	    
	    //Usar la clase Math
        System.out.println("El resultado es " + Math.cos(var));
	}

}

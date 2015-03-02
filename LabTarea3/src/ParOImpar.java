import java.util.Scanner;

public class ParOImpar {
	
	//IPC1 - A 
	//Tarea 3 - Laboratorio - Fecha Limite 05/03/2015 (11:59 pm)
	//Miguel Angel Monrroy Guzmán
	//201020782
	
	public static void main(String [] args){
		int valor = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un número y el programa le dira si el número es Par o Impar.\n");
		System.out.println("Ingrese un número:");
		valor = entrada.nextInt();
		if(valor%2==0){
			System.out.println("El número ingresado (" + valor + ") es Par.");
		}else{
			System.out.println("El número ingresado (" + valor + ") es Impar.");
		}
	}
}

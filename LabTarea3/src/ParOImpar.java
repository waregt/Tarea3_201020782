import java.util.Scanner;

public class ParOImpar {
	
	//IPC1 - A 
	//Tarea 3 - Laboratorio - Fecha Limite 05/03/2015 (11:59 pm)
	//Miguel Angel Monrroy Guzm�n
	//201020782
	
	public static void main(String [] args){
		int valor = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un n�mero y el programa le dira si el n�mero es Par o Impar.\n");
		System.out.println("Ingrese un n�mero:");
		valor = entrada.nextInt();
		if(valor%2==0){
			System.out.println("El n�mero ingresado (" + valor + ") es Par.");
		}else{
			System.out.println("El n�mero ingresado (" + valor + ") es Impar.");
		}
	}
}

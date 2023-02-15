package principales;

import java.util.InputMismatchException;
import java.util.Scanner;

import funciones.Funciones;

public class Ppal1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Introduce el precio:");
			double precio = teclado.nextDouble();
			
			// como hemos un número queda un intro en el buffer de teclado, lo eliminamos
			teclado.nextLine();
			System.out.println("Marca: ");
			String marca = teclado.nextLine();
			
			double descuento= Funciones.calculaDescuento(marca);
			System.out.printf("Precio de la moto: %.2f\nDescuento aplicado: %.2f\n"
					+ "Precio final: %.2f\n", precio, precio* descuento, 
					precio- precio* descuento);
		}catch (InputMismatchException e) {
			System.out.println("Precio mal introducido. Vuelva a ejecutar el programa.");
		}
		

	}

}

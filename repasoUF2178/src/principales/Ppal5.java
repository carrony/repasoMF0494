package principales;

import java.util.Scanner;

import funciones.Funciones;
import funciones.MatricesDistintasException;

public class Ppal5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas filas quieres? ");
		int filas = teclado.nextInt();
		System.out.println("¿Cuantas columnas quieres? ");
		int columnas = teclado.nextInt();
		
		System.out.println("Introduce la matriz 1");
		int matriz1[][]= new int[filas][columnas];
		Funciones.pedir_matriz(matriz1);
		
		System.out.println("Tu matriz es ");
		Funciones.mostrar_matriz(matriz1);
		
		System.out.println("Introduce la matriz 2");
		int matriz2[][]= new int[filas][columnas];
		Funciones.pedir_matriz(matriz2);
		
		System.out.println("Tu matriz 2 es ");
		Funciones.mostrar_matriz(matriz2);
		
		try {
			int suma [][] = Funciones.sumar(matriz1, matriz2);
			System.out.println("La matriz suma es ");
			Funciones.mostrar_matriz(suma);
			
		} catch (MatricesDistintasException e) {
			System.out.println("Las matrices no son compatibles para "
					+ "la suma");
		}

	}

}

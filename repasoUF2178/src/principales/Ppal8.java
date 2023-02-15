package principales;

import java.util.Scanner;

import funciones.Funciones;

public class Ppal8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas filas quieres? ");
		int filas = teclado.nextInt();
		System.out.println("¿Cuantas columnas quieres? ");
		int columnas = teclado.nextInt();
		
		System.out.println("Introdyuce la matriz");
		int matriz[][]= new int[filas][columnas];
		Funciones.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es ");
		Funciones.mostrar_matriz(matriz);
		
		int resultado [] = Funciones.devolverVector(matriz);
		System.out.println("El vector resultante es ");
		Funciones.mostrar_vector(resultado);

	}

}

package principales;

import java.util.Scanner;

import funciones.Funciones;

public class Principal2 {
	
	public static final double SALARIO=40000;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa que calcula el salario");
		System.out.println("introduce la antigüedad: ");
		int antiguedad = teclado.nextInt();
		
		double aumento= Funciones.calculaAumento(antiguedad);
		
		System.out.printf("El sueldo de un trabajador de %d años "
				+ "de antiguedad es de %.2f", antiguedad,
				SALARIO*(1+aumento));
		
		

	}

}

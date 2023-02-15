package funciones;

import java.util.Scanner;

public class Funciones {

	public static double calculaDescuento(String marca) {
		if (marca.equalsIgnoreCase("Honda")) {
			return 0.05;
		} else if (marca.equalsIgnoreCase("Yamaha")) {
			return 0.08;
		}else if (marca.equalsIgnoreCase("Suzuki")) {
			return 0.1;
		}
		return 0.02;
	}
	
	
	public static double calculaAumento(int antiguedad) {
		if (antiguedad>10) {
			return 0.1;
		} else if (antiguedad>5) {
			return 0.07;
		} else if (antiguedad>3) {
			return 0.05;
		} else if (antiguedad>=0) {
			return 0.03;
		} 
		return 0;
	}
	
	public static void pedir_vector(int vector []) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento "+i);
			vector[i] = teclado.nextInt();
		}
	}
	
	public static void mostrar_vector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}
	
	public static void pedir_matriz(int vector [][]) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
			System.out.printf("Introduce el elemento (%d,%d)",i,j);
			vector[i][j] = teclado.nextInt();
			}
		}
	}
	
	public static void mostrar_matriz(int m [][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * Función que devuevle un vector 
	 * @param m
	 * @return
	 */
	public static int [] devolverVector(int m[][]) {
		int vector[] = new int[m.length*m[0].length];
		int pos=0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				//vector[i*m[0].length+j]=m[i][j];
				vector[pos]=m[i][j];
				pos++;
			}
		}
		return vector;
	}
	
	
	public static int [][] sumar(int m[][], int m2[][]) 
			throws MatricesDistintasException {
		if (m.length!=m2.length || m[0].length!=m2[0].length) {
			throw new MatricesDistintasException();
		}
		int m3[][]=new int[m.length][m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m3[i][j]=m[i][j]+m2[i][j];
			}
		}
		return m3;
	}
}

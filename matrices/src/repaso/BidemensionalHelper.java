package repaso;

import java.util.Random;

public class BidemensionalHelper {
	public int aleatorio(int min, int max) {
		
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		
		return randomNum;
	}
	
	public int[][] llanarArreglo(int numeroFila, int numeroColumna) {
		int[][] arreglo=new int[numeroFila][numeroColumna];
		
		for (int i = 0; i < numeroFila; i++) {
			for (int j = 0; j < numeroColumna; j++) {
				arreglo[i][j]= aleatorio(1,20);
			}
		}
		return arreglo;
	}
	
	public void mostrasNotasAlumnos(String[] nameAlumnos, int[][] notas, int numberAlumnos, int numberQuiz) {
		for (int i = 0; i < numberAlumnos; i++) {
			for (int j = 0; j < numberQuiz; j++) {
				System.out.println(nameAlumnos[i] + " -- Evaluacion - index:[" + j + "] : " + notas[i][j]);
			}
		}
	}
	
}

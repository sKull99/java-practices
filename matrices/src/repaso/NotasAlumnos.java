package repaso;

public class NotasAlumnos {
	public static void main(String[] args) {
		int numberAlumnos=4, numberQuiz=4;
		
		int[][] notas;
		
		String[] nameAlumnos={"Pedro", "Maria", "Juana", "Carlos"};
		
		BidemensionalHelper obHelper=new BidemensionalHelper();
		notas = obHelper.llanarArreglo(numberAlumnos, numberQuiz);
		
		obHelper.mostrasNotasAlumnos(nameAlumnos, notas, numberAlumnos, numberQuiz);
		
		/*for (int i = 0; i < numberAlumnos; i++) {
			for (int j = 0; j < numberQuiz; j++) {
				System.out.println(nameAlumnos[i] + " -- Evaluacion - index:[" + j + "] : " + notas[i][j]);
			}
		}*/
	}
}

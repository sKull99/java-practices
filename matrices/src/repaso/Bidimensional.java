package repaso;

public class Bidimensional {
	public static void main(String[] args) {
		int[][] ejemplo=new int[2][3];
	
		//System.out.println(ejemplo.length);
		
		//BidemensionalHelper object=new BidemensionalHelper();
		//ejemplo=object.aleatorio(min, max);
		
		/* Cargamos array */
		/*for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				ejemplo[i][j]=(i*j);
			}
		}*/
		
		/* Imprimi valores de array */
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Valor: "+ ejemplo[i][j] +" --- "+" Posision: "+ i +" -- "+ j);
			}
		}
		
		/*System.out.println("\n");
		// foreach
		for (int[] x : ejemplo) {
			for (int y : x) {
				System.out.println(y);
			}
		}*/
	}
}

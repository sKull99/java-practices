package system;
/*
 * Por favor realice un algoritmo que simule el comportamiento de un elevador de puertas automáticas de un 
 * edificio de 15 pisos, tomando en cuenta que para ser llamado se debe "presionar" el botón de subida o bajada
 * ( ambos valores deberán ingresarse por consola ). Antes de llamar al elevador se le debe indicar al programa
 * en que piso está posicionado ud. Una vez haya sido llamado el elevador, éste debe indicar el piso por 
 * el cual está pasando. Al llegar, el elevador al piso solicitado debe indicar que las puertas han sido 
 * abiertas. Luego de colocar el piso a donde se dirige, cerrar las puertas y repetir el proceso, 
 * tomando en cuenta las validaciones correspondientes.
 */
public class Application {
	public static void main(String[] args) {
		String aPiso="";
		int aPosicion=0;
		int[] piso=new int[16];

		/* Cargamos el arreglo */
		for (int i = 0; i < piso.length; i++) {
			piso[i]=i;
		}
		
		Functions object=new Functions();
		
		/* Agregamos la posicion de la persona */
		boolean retryNumber=false;
		while (object.retryNowNumber || retryNumber) {
			retryNumber=false;
			System.out.print("Ingrese su posicion: ");
			aPosicion=object.readNumber();
			if (aPosicion > 15) {
				System.out.println("La posicion no existe, vuelva a intentar");
				retryNumber=true;
			}
		}		
		
		/* Solicitamos la accion a realizar subida o bajada */
		boolean retryText=false;
		while (object.retryNowText || retryText) {
			retryText=false;
			System.out.print("Quiere subir o bajar? ");
			aPiso=object.readText();
			if (aPiso.equals("subir") || aPiso.equals("SUBIR")) {
				for (int i = aPosicion; i < piso.length; i++) {
					System.out.println("Piso: "+ piso[i]);
				}
			} else if (aPiso.equals("bajar") || aPiso.equals("BAJAR")) {
				for (int i = aPosicion; i < piso.length && i >= 0; i--) {
					System.out.println("Piso: "+ piso[i]);
				}	
			} else {
				System.out.println("Valor incorrecto, vuelva a intentar");
				retryText=true;
			}
		}
	}
}


public class Calcapp {
	public static void main(String[] args) {
		Calculadora object=new Calculadora();
		
		System.out.print("Suma: ");
		System.out.println(object.suma("6","5.4","10","67.98","190")+"\n");

		System.out.print("Suma: ");
		System.out.println(object.suma("6","4")+"\n");

		System.out.print("Suma: ");
		System.out.println(object.suma("6","4","5")+"\n");

		System.out.print("Suma: ");
		System.out.println(object.suma("7.8","56.9")+"\n");

		System.out.print("Suma: ");
		System.out.println(object.suma("7.8","56.9","99.4")+"\n");
		
		System.out.println("\n");
		System.out.print("Suma: ");
		object.mostrarResultado( object.suma( "20.3", "33.44", "2.0", "77.88", "41.32" ) );
		System.out.print("Suma: ");
		object.mostrarResultado( object.suma(2,2) );
		System.out.print("Suma: ");
		object.mostrarResultado( object.suma( 2, 2, 2 ) );
		System.out.print("Suma: ");
		object.mostrarResultado( object.suma( 2.2, 2.3 ) );
		System.out.print("Suma: ");
		object.mostrarResultado( object.suma( 2.2, 2.3, 2.4 ) );
	}
}

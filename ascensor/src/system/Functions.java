package system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Functions {
	/* ------------------Text----------------------- */
	boolean retryNowText=true;
	public String readText() {

		String enterText="";
		try {

			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader read = new BufferedReader(io);
			enterText=read.readLine();
			
			String regexRules = "[a-zA-Z]+";
			boolean validationString = Pattern.matches(regexRules, enterText);
			if (validationString) {
				retryNowText=false;
			} else {
				System.out.println("Ingreso caracteres incorrectos\n");
				retryNowText=true;
			}
		} catch (IOException object) {
			System.out.println("Hubo un error al leer");
			retryNowText=true;
		} catch (Exception e) {
			System.out.println("Ocurrio un error general");
			retryNowText=true;
		}
		return enterText;
	}
	
	/* -------------------Number---------------------- */
	boolean retryNowNumber=true;
	public int readNumber() {

		String enterNumber="";
		int valueConverted=0;
		try {

			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader read = new BufferedReader(io);
			enterNumber=read.readLine();
			valueConverted=Integer.parseInt(enterNumber);
			
			String regexRules = "[0-9]+";
			boolean validationString = Pattern.matches(regexRules, enterNumber);
			if (validationString) {
				retryNowNumber=false;
			} else {
				System.out.println("Ingreso caracteres incorrectos\n");
				retryNowNumber=true;	
			}
		} catch (NumberFormatException nf) {
			System.out.println("Disculpe usted a colocado un valor erroneo");
			retryNowNumber=true;
		} catch (Exception e) {
			System.out.println("Ocurrio un error general");
			retryNowNumber=true;
		}
		
		return valueConverted;
	}
}

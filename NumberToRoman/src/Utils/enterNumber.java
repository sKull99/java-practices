/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Scanner;

/**
 *
 * @author hflores "sKull"
 */
public class enterNumber {
    public int integerNumber() {
        int number=0;
        try {
            Scanner read = new Scanner(System.in);
            number = read.nextInt();
            
            if (number > 3999) {                
                System.out.println("ingreso un numero mayor a 3999, vuelva a ingresar un numero.!!!");
            } else if (number == 0 ) {
                System.out.println("ingreso el numero 0, vuelva a ingresar un numero distinto de 0.!!!");
            } else if (number < 1 ){
                System.out.println("ingreso un numero negativo, vuelva a ingresar un numero que no sea negativo.!!!");
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un problema.!!!");
        }
        return number;
    }
}

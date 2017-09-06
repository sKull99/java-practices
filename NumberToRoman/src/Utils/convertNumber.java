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
public class convertNumber {
    
    /* Number Arabigo to Number Roman */
    public String number(int number) {
        String numberRoman="";
        try {
            // vars
            int unidad=0, decena=0, centenas=0, miles=0;
            String u="", d="", c="", m="";
            String sum="", letter="";
            
            // Obtengo el valor requerido por cada magnitud
            unidad = number % 10;
            decena = number % 100 / 10;
            centenas = number % 1000 / 100;
            miles = number / 1000;
           
            // set Unidad
            switch (unidad) {
                case 1: case 2: case 3:
                    for (int i = 0; unidad <= 3 && i < unidad; i++) {
                        u += "I";
                    }
                    break;
                case 4:
                    u = "IV";
                    break;
                case 5:
                    u = "V";
                    break;
                case 6:
                    u = "VI";
                    break;
                case 7:
                    u = "VII";
                    break;
                case 8:
                    u = "VIII";
                    break;
                case 9:
                    u = "IX";
                    break;
                default:
                    u = "";
                    break;
            }
            
            // set Decena
            switch (decena) {
                case 1: case 2: case 3:
                    for (int i = 0; decena <= 3 && i < decena; i++) {
                        d += "X";
                    }
                    break;
                case 4:
                    d = "XL";
                    break;
                case 5:
                    d = "L";
                    break;
                case 6:
                    d = "LX";
                    break;
                case 7:
                    d = "LXX";
                    break;
                case 8:
                    d = "LXXX";
                    break;
                case 9:
                    d = "XC";
                    break;
                default:
                    d = "";
                    break;
            }
            
            // set Centena
            switch (centenas) {
                case 1: case 2: case 3:
                    for (int i = 0; centenas <= 3 && i < centenas; i++) {
                        c += "C";
                    }
                    break;
                case 4:
                    c = "CD";
                    break;
                case 5:
                    c = "D";
                    break;
                case 6:
                    c = "DC";
                    break;
                case 7:
                    c = "DCC";
                    break;
                case 8:
                    c = "DCCC";
                    break;
                case 9:
                    c = "CM";
                    break;
                default:
                    c = "";
                    break;
            }
            // set Miles
           switch (miles) {
                case 1: case 2: case 3:
                    for (int i = 0; miles <= 3 && i < miles; i++) {
                        m += "M";
                    }
                    break;
                default:
                    m = "";
                    break;
           }
            // formato numberRoman = m+d+c+u
            numberRoman = m + c + d + u;
            
        } catch (Exception e) {
            System.out.println("Ocurrio un problema.!!!");
        }
        return numberRoman;
    }
    
    /* Number Roman to Number Arabigo*/
    public int numberRoman(String numberRoman) {
       return 0;       
    }
}

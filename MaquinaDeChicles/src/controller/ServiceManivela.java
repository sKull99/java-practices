/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author hflores "sKull"
 */
public class ServiceManivela {

    /* Insertar monedas */
    public int dataMoney() {
        int dataMoney=0;
        try {
            
            Scanner read = new Scanner(System.in);
            dataMoney = read.nextInt();
            
            if (dataMoney == 0) 
                    System.out.println("No ha insertado ninguna moneda aun.");                
            
        } catch (Exception e) {
            System.out.println("Oops.!!! Hubo algun error.");
        }
        return dataMoney;
    }
    
    /* Girar la manivela*/
    public String girar() {
        String a="";
        try {

            InputStreamReader io = new InputStreamReader(System.in);
            BufferedReader read = new BufferedReader(io);
            System.out.print("Girar Manivela 's' o Ejectar moneda 'e': ");
            a = read.readLine();

        } catch (Exception e) {
            System.out.println("Oops..!!! Hubo algun problema");
        }
        return a;
    }
}

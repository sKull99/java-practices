/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Enunciado maquina de chicles.
Se desea implementar el código controlador de una máquina expendedora de chicles de
la siguiente manera.
La maquina consta de 3 partes, una ranura para poder insertar monedas, una manivela
que al girarla expende el/los chicle/s (dependiendo de cuantas monedas tiene) y el
contenedor de donde salen los chicles.
El usuario de la maquina puede, en todo momento, girar la manivela o inserta una
moneda. Se pide que solo puedan ingresar un máximo de hasta 5 monedas (no importa
el valor de la moneda), por lo cual la maquina solo podrá expender hasta un máximo de
5 chicles por ves girada. Y que si el usuario gire la manivela cuando no puso ninguna
moneda salga un cartel, en el visor que diga “No ha insertado ninguna moneda aun”.
Además el usuario debe poder eyectar las monedas, si se arrepintió. Y poder agregar
más chicles.
Se desea saber también, en todo momento, la ganancia obtenida hasta el momento.
Finalmente se pide que el visor informe de todos los posibles estados de la maquina que
estos pueden ser:
1. AGOTADO. Que significa que no quedan más chicles.
2. SIN MONEDA. Hay chicles pero no hay moneda aun.
3. CON MONEDA.
4. VENDIDO. Que se vendió el/los chicle/s.
Cada vez que alguien intente hacer algo con la maquina.
*/
package maquinadechicles;

import controller.ServiceManivela;
import controller.ServiceMoney;
import controller.ServiceProvision;

/**
 *
 * @author hflores "sKull"
 */
public class MaquinaDeChicles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Aprovisionamiento de chicles */             
        ServiceProvision objProvision = new ServiceProvision();
        int unitChicles = objProvision.chicles(10);
        
        /* Estado por default */
        String status = "SIN MONEDA";
        String gira = null;
        
        /* dar chicles, suma contable, total tchicles, diferencia dchicles vars */
        int sum=0, tchicles=0, dchicles=0;

        do {

            /* Insertar modena */
            int money=0;
            ServiceManivela objManivela = new ServiceManivela();
            System.out.println("Estado: " + status);
            System.out.print("Ingrese sus monedas: ");
            money = objManivela.dataMoney();
        
            /* Estados de provision */
            tchicles = unitChicles - dchicles;
            ServiceMoney objMoney = new ServiceMoney();
            status = objMoney.statusMoney(money, tchicles); 
            System.out.println("Estado : " + status);
            
            if (status.equals("CON MONEDA")) {

                /* Girar manivela (?) */
                gira = objManivela.girar();
                if (gira.equals("e") || gira.equals("E")) {
                    
                    System.out.println("Devolver momendas: " + money);
                    money = 0;
                    gira = "s";
                    System.out.println();
                    
                }
        
                /* Informacion para el usuario */
                System.out.println();
                System.out.println("Cantidad de chicles a dar: " + money);
                sum += money;
                dchicles += money;
                System.out.println("Total de ventas: " + sum);
                status = "SIN MONEDA";
                
            } else {
                
                /* Retornamos las monedas y salimos */
                System.out.println("Devolver momendas: " + money);
                money = 0;                
                gira = "n";
                
            }
            System.out.println();
            
        } while (gira.equals("s") || gira.equals("S"));
      
    }
    
}
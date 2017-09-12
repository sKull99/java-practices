/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author hflores "sKull"
 */
public class ServiceMoney {
    
    public String statusMoney(int money, int chicles) {
      String statusMoney = "";
      try {
         
          /* Money check*/
          if (money > 0 && money <= 5) {
              statusMoney = "CON MONEDA";
          } else {
              statusMoney = "Supero el limite de monedas a ingresar.";
          }
              
          /* Chicles check */
          if (chicles <= 0) {
              statusMoney = "AGOTADO";
          }
          
          /* Validacion money vs chicles */
          if (chicles < money) {
              statusMoney = "AGOTADO";
          }
            
        } catch (Exception e) {
            System.out.println("Oops..!!! Hubo algun problema.");
        }
        return statusMoney;
    }
    
}

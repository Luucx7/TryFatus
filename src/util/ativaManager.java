/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author lukin
 */
public class ativaManager {
    
       public static int isAtiva(String total, String valorPago, String metodo) {
           Double preco = Double.parseDouble(total);
           Double pago = 0.0;
           try {
               pago = Double.parseDouble(valorPago);
           } catch (Exception ex) {
               pago = 0.0;
           }
           if (metodo.equals("A Vísta")) {
               return 0;
           } else if (preco>=pago) {
               return 0;
           } else {
               return 1;
           }
       }
}

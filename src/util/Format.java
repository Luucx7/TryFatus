/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DecimalFormat;

/**
 *
 * @author USER
 */
public class Format {
    public static double decimal(double valor) {
        DecimalFormat df = new DecimalFormat("#.##"); 
        String retornar = df.format(valor).replace(',', '.');
        return new Double(retornar);
    }             
}

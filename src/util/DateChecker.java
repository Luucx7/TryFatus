/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author lukin
 */
public class DateChecker {
    
    /**
     *
     * @param data
     * @return
     */
    
    public static Date DateChecker(String data) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = null;
        java.sql.Date sqlStartDate = null;
        try {
            date = sdf1.parse(data);
            java.sql.Date dataSql = new java.sql.Date(date.getTime());
            sqlStartDate = dataSql;
        } catch (java.text.ParseException | NullPointerException ex) {
            //Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            sqlStartDate = null;
        } 
        return sqlStartDate;
    }
}

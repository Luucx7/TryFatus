/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author lukin
 */
public class DateConvert {
    
    private static final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    public static String DateConvert(java.sql.Date date) {
        String data = null;
        String dia = date.toString().substring(8, 10);
        String mes = date.toString().substring(5, 7);
        String ano = date.toString().substring(0, 4);
        data = dia+"/"+mes+"/"+ano;
        return data;
    }
    
    public static Date LocalToUtil(LocalDate date) {
        Date date1 = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date1;
    }
    
    public static LocalDate UtilToLocal(Date date) {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate;
    }
    
    public static long diferencaDias(Date um, Date dois) {
        long difference =  (um.getTime()-dois.getTime())/86400000;
        return Math.abs(difference);
    }
	
    public static Date getDate(String date) {
        try {
            return df.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
     	}
        return null;
    }
            
}

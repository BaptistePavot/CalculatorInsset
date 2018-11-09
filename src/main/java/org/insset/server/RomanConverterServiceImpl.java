/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.RomanConverterService;
import org.insset.shared.FieldVerifier;


/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        //Implement your code
        return "XV/III/MX";
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        //Implement your code
        
        return 3;
    }

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
    String result;    
    
        result = intToRoman(nbr);
        
        return result;
    }
    
           // Fonction pour convertir en romain
    public static String intToRoman(int num)  
    {  
 
        String m[] = {"", "M", "MM", "MMM"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D",  
                            "DC", "DCC", "DCCC", "CM"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L",  
                            "LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV", "V",  
                            "VI", "VII", "VIII", "IX"};
             
        // Conversion en romain
        String thousands = m[num/1000];
        String hundereds = c[(num%1000)/100];
        String tens = x[(num%100)/10];
        String ones = i[num%10];
             
        String ans = thousands + hundereds + tens + ones;
             
        return ans;
    }
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

     @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        
        String spl[] = nbr.split("/");
        
        int jour = Integer.parseInt(spl[0]);
        int mois = Integer.parseInt(spl[1]);
        int annee = Integer.parseInt(spl[2]);
        
        
         String resultat = intToRoman(jour);
         resultat += "/";
         resultat += intToRoman(mois);
         resultat += "/";
         resultat += intToRoman(annee);
        
        return resultat;
        
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        //Implement your code
        return 3;
    }

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        //Implement your code
        return new String("XVXX");
    }

}

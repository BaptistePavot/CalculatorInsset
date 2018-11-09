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

    
   
	
	private final static String[] _RRUTR = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	private final static String[] _RRDTR = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	private final static String[] _RRCTR = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};

        /**
	 * return the value of a Roman figure
	 * @param vv = The figure
	 * @return The corresponding value
	 */
	static int RomanCharToValue(char vv)
	{
		switch (vv)
		{
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
		}
		return 0;
	}
	
	/**
	 * Return the Roman number string corresponding to the value entered.  
	 * @param value to convert
	 * @return String value
	 */
	public static String IntToRoman(int i)
	{
		if (FieldVerifier.IsRomanNumber(i))
		{
			
			if (i>=0 && i<=9) return _RRUTR[i];
			if (i>=10 && i<=99) return _RRDTR[i / 10]+ _RRUTR[i % 10];
			if (i>=100 && i<=999) return _RRCTR[i / 100]+ _RRDTR[(i / 10) % 10];
			

		}//endif
		
		return "";
	}
	
	/**
	 * Return the int value correspondif of a Roman String entered
	 * @param value in roman figures
	 * @return int value
	 */
	public static int RomanToInt(String RN)
	{
		int oc,NewRV,OldRV=0,Result=0;
		
		if (FieldVerifier.isValidRoman(RN))
		{
			for (oc=0;oc<RN.length();oc++)
			{
				NewRV = RomanCharToValue(RN.toCharArray()[oc]);
				if (NewRV > OldRV)
				{
					Result+=NewRV-(OldRV<<1);
				}else
				{
					Result+=NewRV;
				}//endif
				OldRV=NewRV;
			}//endfor
			
		}else
			return -1;//endif

		return Result;
	}
    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        //Implementl
      int nombre = RomanToInt(nbr);
      
        return nombre;
    }

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        //Implement your code
        return new String("XVXX");
    }

}

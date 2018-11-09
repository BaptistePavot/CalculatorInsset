package org.insset.shared;

import static java.lang.Integer.parseInt;

/**
 * <p>
 * FieldVerifier validates that the name the user enters is valid.
 * </p>
 * <p>
 * This class is in the <code>shared</code> packing because we use it in both
 * the client code and on the server. On the client, we verify that the name is
 * valid before sending an RPC request so the user doesn't have to wait for a
 * network round trip to get feedback. On the server, we verify that the name is
 * correct to ensure that the input is correct regardless of where the RPC
 * originates.
 * </p>
 * <p>
 * When creating a class that is used on both the client and the server, be sure
 * that all code is translatable and does not use native JavaScript. Code that
 * is note translatable (such as code that interacts with a database or the file
 * system) cannot be compiled into client side JavaScript. Code that uses native
 * JavaScript (such as Widgets) cannot be run on the server.
 * </p>
 */
public class FieldVerifier {

         private final static String[] acceptedchar={"I","V","X","L","C","D","M"};
    /**
     * Verifies that the specified name is valid for our service.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */
    public static boolean isValidName(String name) {
        if ((name == null) || (name.isEmpty())) {
            return false;
        }
        return true;
    }

    /**
     * Verifies that the specified value is valide.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */
    public static boolean isValidDecimal(Integer nbr) {
       if   (nbr <=0              || nbr >= 2001)
       {
           return false;
       }
       else
       {
          return true; 
       }
        
    }

    public static boolean isValidRoman(String nbr) {
     boolean  actuval = false;
		
		for (int i=0;i<nbr.length();i++)
		{
                    for (int j=0;j<acceptedchar.length;j++)
			if (nbr.substring(i, i+1).equals(acceptedchar[j])) actuval=true;
			
		}
		return actuval;
    }
    /**
	 * Validate if the entered integer value is in the accepted limits
	 * @param val
	 * @return true if ok
	 */
	public static boolean IsRomanNumber(int val)
	{
		if ( val>0  &&  val<=1999 )return true;
		return false;
	}
    public static boolean isValidDate(String date) {
              boolean checkFormat;

        if (date.matches("([0-3])([0-9])/([0-9])([0-3])/([0-2])([0-9])([0-9])([0-9])")&& parseInt(date.split("/")[2]) <2000                        )
            checkFormat=true;
        else
           checkFormat=false;
        return checkFormat;
    
    }
    
   
}

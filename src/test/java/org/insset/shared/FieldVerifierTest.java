/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class FieldVerifierTest {
    
    public FieldVerifierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameOk() {
        System.out.println("isValidName");
        String name = "Baptiste";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
        
    }
    
     /**
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameNoOkVide() {
        System.out.println("isValidName");
        String name = "";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
        
    }

     /**
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameOkNull() {
        System.out.println("isValidName");
        String name = null;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalOk() {
        System.out.println("isValidDecimal");
        Integer nbr = 1500;
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalNoOk() {
        System.out.println("isValidDecimal");
        Integer nbr = 0;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRoman() {
        System.out.println("isValidRoman");
        String nbr = "";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String date = "";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of intToRoman method, of class FieldVerifier.
     */
    @Test
    public void testIntToRoman() {
        System.out.println("intToRoman");
        int num = 5;
        String expResult = "V";
        String result = FieldVerifier.intToRoman(num);
        assertEquals(expResult, result);
        
    }
    
}

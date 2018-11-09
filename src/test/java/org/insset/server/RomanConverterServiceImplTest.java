/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

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
public class RomanConverterServiceImplTest {
    
    public RomanConverterServiceImplTest() {
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
     * Test of convertDateYears method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertDateYears() {
        System.out.println("convertDateYears");
        String nbr = "11/11/1989";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XI/XI/MCMLXXXIX";
        String result = instance.convertDateYears(nbr);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of convertRomanToArabe method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertRomanToArabe() {
        System.out.println("convertRomanToArabe");
        String nbr = "V";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 5;
        Integer result = instance.convertRomanToArabe(nbr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRomanOk() {
        System.out.println("convertArabeToRoman");
        Integer nbr = 5;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "V";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
    }

    /**
     * Test of RomanCharToValue method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testRomanCharToValue() {
        System.out.println("RomanCharToValue");
        char vv = 'V';
        int expResult = 5;
        int result = RomanConverterServiceImpl.RomanCharToValue(vv);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of IntToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testIntToRoman() {
        System.out.println("IntToRoman");
        int i = 5;
        String expResult = "V";
        String result = RomanConverterServiceImpl.IntToRoman(i);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of RomanToInt method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testRomanToInt() {
        System.out.println("RomanToInt");
        String RN = "V";
        int expResult = 5;
        int result = RomanConverterServiceImpl.RomanToInt(RN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman() {
        System.out.println("convertArabeToRoman");
        Integer nbr = 5;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "V";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
 
    }

  
}

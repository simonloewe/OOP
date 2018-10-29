 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw06a02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lion
 */
public class DemoIT {
    
    public DemoIT() {
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
     * Test of getMax2 method, of class Demo.
     */
    @Test
    public void testGetMax2() {
        System.out.println("getMax2");
        int a = 1;
        int b = 4;
        Demo instance = new Demo();
        instance.getMax2(a, b);
    }

    /**
     * Test of getMin2 method, of class Demo.
     */
    @Test
    public void testGetMin2() {
        System.out.println("getMin2");
        int a = 1;
        int b = 4;
        Demo instance = new Demo();
        instance.getMin2(a, b);
    }

    /**
     * Test of getMax3 method, of class Demo.
     */
    @Test
    public void testGetMax3() {
        System.out.println("getMax3");
        int a = 1;
        int b = 4;
        int c = 5;
        Demo instance = new Demo();  
        instance.getMax3(a, b, c);
    }
    
}

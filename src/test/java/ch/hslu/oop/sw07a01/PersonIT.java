/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07a01;

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
public class PersonIT {
    
    public PersonIT() {
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
     * Test of getPersonID method, of class Person.
     */
    @Test
    public void testGetPersonID() {
        System.out.println("getPersonID");
        Person instance = null;
        long expResult = 0L;
        long result = instance.getPersonID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonName method, of class Person.
     */
    @Test
    public void testGetPersonName() {
        System.out.println("getPersonName");
        Person instance = null;
        String expResult = "";
        String result = instance.getPersonName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonSurname method, of class Person.
     */
    @Test
    public void testGetPersonSurname() {
        System.out.println("getPersonSurname");
        Person instance = null;
        String expResult = "";
        String result = instance.getPersonSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonName method, of class Person.
     */
    @Test
    public void testSetPersonName() {
        System.out.println("setPersonName");
        Person instance = null;
        instance.setPersonName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonSurname method, of class Person.
     */
    @Test
    public void testSetPersonSurname() {
        System.out.println("setPersonSurname");
        Person instance = null;
        instance.setPersonSurname();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

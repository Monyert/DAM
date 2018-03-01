/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancari;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author monyert
 */
public class CompteBancariTest {

    public CompteBancariTest() {
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
     * Test of ingresar method, of class CompteBancari.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double quantitat = 100.0;
        CompteBancari cc = new CompteBancari(2211, 1000.00);
        cc.ingresar(quantitat);
        assertEquals(1100.00, cc.cons_saldo(), 0.0);
    }

    /**
     * Test of retirar method, of class CompteBancari.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double quantitat = 100.0;
        CompteBancari cc = new CompteBancari(2211, 1000.00);
        cc.retirar(quantitat);
        assertEquals(900.00, cc.cons_saldo(), 0.0);
    }

    /**
     * Test of cons_saldo method, of class CompteBancari.
     */
    @Test
    public void testCons_saldo() {
        System.out.println("cons_saldo");
        CompteBancari instance = null;
        double expResult = 0.0;
        double result = instance.cons_saldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}

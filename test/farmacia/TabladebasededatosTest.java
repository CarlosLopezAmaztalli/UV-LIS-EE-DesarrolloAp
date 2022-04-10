/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlosLopezAmaztalli
 */
public class TabladebasededatosTest {
    
    public TabladebasededatosTest() {
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
     * Test of cargar method, of class Tabladebasededatos.
     */
    @Test
    public void testCargar() {
        System.out.println("cargar");
        Tabladebasededatos instance = new Tabladebasededatos();
        instance.cargar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarTabla method, of class Tabladebasededatos.
     */
    @Test
    public void testLimpiarTabla() {
        System.out.println("limpiarTabla");
        Tabladebasededatos instance = new Tabladebasededatos();
        instance.limpiarTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Tabladebasededatos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Tabladebasededatos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

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
public class frmDatosTest {
    
    public frmDatosTest() {
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
     * Test of CargarInterfaz method, of class frmDatos.
     */
    @Test
    public void testCargarInterfaz() {
        System.out.println("CargarInterfaz");
        frmDatos instance = new frmDatos();
        instance.CargarInterfaz();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarDatos method, of class frmDatos.
     */
    @Test
    public void testCargarDatos() {
        System.out.println("CargarDatos");
        frmDatos instance = new frmDatos();
        instance.CargarDatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarTabla method, of class frmDatos.
     */
    @Test
    public void testLimpiarTabla() {
        System.out.println("limpiarTabla");
        frmDatos instance = new frmDatos();
        instance.limpiarTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class frmDatos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        frmDatos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

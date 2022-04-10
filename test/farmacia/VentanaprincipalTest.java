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
public class VentanaprincipalTest {
    
    public VentanaprincipalTest() {
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
     * Test of main method, of class Ventanaprincipal.
     */
    private Ventanaprincipal ventanaprincipal;
    public void escenario() {
        ventanaprincipal=new  Ventanaprincipal();
    }
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ventanaprincipal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of getProveedor method, of class Ventanaprincipal.
     */
    @Test
    public void testGetProveedor() {
        System.out.println("getProveedor");
        Ventanaprincipal instance = new Ventanaprincipal();
        String expResult = "Tomas Castro";
        String result = instance.getProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     @Test
public void testGetProveedor2() {
        System.out.println("getProveedor");
        Ventanaprincipal instance = new Ventanaprincipal();
        String expResult = "ramon hernandez";
        String result = instance.getProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 @Test
    public void testGetProveedor3() {
        System.out.println("Jose fernandez");
        Ventanaprincipal instance = new Ventanaprincipal();
        String expResult = "Tomas Castro";
        String result = instance.getProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testGetProveedor4() {
        System.out.println("getProveedor");
        Ventanaprincipal instance = new Ventanaprincipal();
        String expResult = "luis donaldo";
        String result = instance.getProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     @Test
    public void testGetProveedor5() {
        System.out.println("getProveedor");
        Ventanaprincipal instance = new Ventanaprincipal();
        String expResult = "hector valdilla";
        String result = instance.getProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of getSucursal method, of class Ventanaprincipal.
     */
    @Test
    public void testGetSucursal() {
        System.out.println("getSucursal");
        Ventanaprincipal instance = new Ventanaprincipal();
        String expResult = "";
        String result = instance.getSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of noEsAlphanumerico method, of class Ventanaprincipal.
     */
    @Test
    public void testNoEsAlphanumerico() {
        System.out.println("noEsAlphanumerico");
        String texto = "Por favor ingrese un nombre de producto, Mensaje de error al Ingresar dato";
        Ventanaprincipal instance = new Ventanaprincipal();
        boolean expResult = false;
        boolean result = instance.noEsAlphanumerico(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

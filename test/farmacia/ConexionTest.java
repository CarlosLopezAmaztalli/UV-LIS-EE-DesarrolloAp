/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.sql.Connection;
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
public class ConexionTest {
    
    public ConexionTest() {
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
     * Test of getConnecction method, of class Conexion.
     */
    @Test
    public void testGetConnecction() {
        System.out.println("getConnecction");
        Conexion instance = new Conexion();
        Connection expResult = null;
        Connection result = instance.getConnecction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(false);
    }

    /**
     * Test of desconectar method, of class Conexion.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        Conexion instance = new Conexion();
        instance.desconectar();
        assertTrue(false);
        
    }
    
}

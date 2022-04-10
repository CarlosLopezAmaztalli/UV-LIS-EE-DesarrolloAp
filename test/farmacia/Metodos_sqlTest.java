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
public class Metodos_sqlTest {
    
    public Metodos_sqlTest() {
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
     * Test of guardar method, of class Metodos_sql.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        String nombre = "";
        String apellidos = "";
        String correo = "";
        String contraseña = "";
        Metodos_sql instance = new Metodos_sql();
        int expResult = 0;
        int result = instance.guardar(nombre, apellidos, correo, contraseña);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarNombre method, of class Metodos_sql.
     */
    @Test
    public void testBuscarNombre() {
        System.out.println("BuscarNombre");
        String correo = "";
        String expResult = "";
        String result = Metodos_sql.BuscarNombre(correo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarUsuarioRegistrado method, of class Metodos_sql.
     */
    @Test
    public void testBuscarUsuarioRegistrado() {
        System.out.println("BuscarUsuarioRegistrado");
        String correo = "";
        String contraseña = "";
        String expResult = "";
        String result = Metodos_sql.BuscarUsuarioRegistrado(correo, contraseña);
        assertEquals(expResult, result);
        assertTrue(correo="root");
        fail("The test case is a prototype.");
    }
    
}

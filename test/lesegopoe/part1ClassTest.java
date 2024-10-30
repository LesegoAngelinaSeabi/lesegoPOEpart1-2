/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lesegopoe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class part1ClassTest {
    
    public part1ClassTest() {
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
     * Test of getFirstName method, of class part1Class.
     */
    
    @Test
    public void testCheckUsername() {
        System.out.println("kyk_1");
        String username = "kyk_1";
        part1Class instance = new part1Class();
        boolean expResult = true;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
           }

    /**
     * Test of checkPasswordComplexity method, of class part1Class.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("Ch&&sec@ke99!");
        String password = "Ch&&sec@ke99!";
        part1Class instance = new part1Class();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registerUser method, of class part1Class.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        part1Class instance = new part1Class();
        String expResult = "";
        String result = instance.registerUser();
        assertEquals(expResult, result);
            }
    /**
     * Test of loginUser method, of class part1Class.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String user = "username";
        String pass = "username";
        part1Class instance = new part1Class();
        boolean expResult = true;
        boolean result = instance.loginUser(user, pass);
        assertEquals(expResult, result);
            }

    /**
     * Test of Returnlogin method, of class part1Class.
     */
    @Test
    public void testReturnlogin() {
        System.out.println("Returnlogin");
        part1Class instance = new part1Class();
        String expResult = "";
        String result = instance.Returnlogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

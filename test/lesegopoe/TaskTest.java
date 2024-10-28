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
public class TaskTest {
    
    public TaskTest() {
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
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("login feature");
        String Description = "create login to authenticate users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(Description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("do again");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("");
        String createTaskID = "auto generated";
        int number = 0;
        String developer = "Robyn Harrison";
        Task instance = new Task();
        String expResult = "auto generated";
        String result = instance.createTaskID(createTaskID, number, developer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("do again");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("Robyn harrison");
        String status = "To do";
        int number = 0;
        String taskname = "Login feature";
        String description = "create login to authenticate users";
        String id = "Auto generated";
        int duration = 8;
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails(status, number, taskname, description, id, duration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("do again");
    }

    /**
     * Test of ReturnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("8hours");
        int hours = 8;
        Task instance = new Task();
        int expResult = 0;
        int result = instance.ReturnTotalHours(hours);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

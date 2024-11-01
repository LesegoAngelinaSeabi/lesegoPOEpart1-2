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
    //Task 1
    @Test
    public void testCheckTaskDescription1() {
        System.out.println("Check Task Description");
        String Description = "create login to authenticate users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(Description);
        assertEquals(expResult, result);
        
    }
    //Task 2
    @Test
    public void testCheckTaskDescription2() {
        System.out.println("Check Task Description");
        String Description = "create add task feature to add task users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(Description);
        assertEquals(expResult, result);
        
    }


    /**
     * Test of createTaskID method, of class Task.
     */
    //task 1
    
 @Test
    public void testCreateTaskID1() {
        System.out.println("create taskID");
        String Taskname = "login Feature";
        int number = 0;
        String developer = "Robyn Harrison";
        Task instance = new Task();
        String expResult = "LO:0:SON";
        String result = instance.createTaskID(Taskname, number, developer);
        assertEquals(expResult, result);
        
    }
    //task 2
    @Test
    public void testCreateTaskID2() {
        System.out.println("create taskID");
        String Taskname = "Add task feature";
        int number = 1;
        String developer = "Mike smith";
        Task instance = new Task();
        String expResult = "AD:1:ITH";
        String result = instance.createTaskID(Taskname, number, developer);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    //Task 1
    @Test
    public void testPrintTaskDetails1() {
        System.out.println("Robyn harrison");
        String status = "To do";
        int number = 0;
        String taskname = "Login feature";
        String description = "create login to authenticate users";
        String id = "";
        int duration = 8;
        Task instance = new Task();
        String expResult = "instance.printTaskDetails(status, number, taskname, description, id, duration";
        String result = instance.printTaskDetails(status, number, taskname, description, id, duration);
        assertEquals(expResult, result);
       
    }
//Task 2
    public void testPrintTaskDetails2() {
        System.out.println("Mike smith");
        String status = "Doing";
        int number = 0;
        String taskname = "Add task feature";
        String description = "create add task feature to add task users";
        String id = " ";
        int duration = 10;
        Task instance = new Task();
        String expResult = "status, number, taskname, description, id, duration";
        String result = instance.printTaskDetails(status, number, taskname, description, id, duration);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of ReturnTotalHours method, of class Task.
     */
    //task 1
    @Test
    public void testReturnTotalHours1() {
        System.out.println("total hours");
        int hours = 8;
        Task instance = new Task();
        int expResult = 8;
        int result = instance.ReturnTotalHours(hours);
        assertEquals(expResult, result);
        
    }
    //Task 2
    @Test
    public void testReturnTotalHours2() {
        System.out.println("total hours");
        int hours = 10;
        Task instance = new Task();
        int expResult = 10;
        int result = instance.ReturnTotalHours(hours);
        assertEquals(expResult, result);
        
    }
    
}

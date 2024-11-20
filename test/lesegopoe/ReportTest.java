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
public class ReportTest {
    
    public ReportTest() {
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
     * Test of displayReport method, of class Report.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        String[] statuses = null;
        String[] developers = null;
        String[] Taskdescript = null;
        String[] taskNames = null;
        String[] taskIds = null;
        int[] durations = null;
        Report instance = new Report();
        instance.displayReport(statuses, developers, Taskdescript, taskNames, taskIds, durations);
            }

    /**
     * Test of displayDoneTasks method, of class Report.
     */
    @Test
    public void testDisplayDoneTasks() {
        System.out.println("displayDoneTasks");
        String[] statuses = null;
        String[] developers = null;
        String[] taskNames = null;
        int[] durations = null;
        Report instance = new Report();
        instance.displayDoneTasks(statuses, developers, taskNames, durations);
            }

    /**
     * Test of displayLongestTask method, of class Report.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        int[] durations = null;
        String[] developers = null;
        String[] taskNames = null;
        Report instance = new Report();
        instance.displayLongestTask(durations, developers, taskNames);
            }

    /**
     * Test of searchTaskByName method, of class Report.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String[] taskNames = null;
        String[] developers = null;
        String[] statuses = null;
        Report instance = new Report();
        instance.searchTaskByName(taskNames, developers, statuses);
            }

    /**
     * Test of searchTasksByDeveloper method, of class Report.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String[] developers = null;
        String[] taskNames = null;
        String[] statuses = null;
        Report instance = new Report();
        instance.searchTasksByDeveloper(developers, taskNames, statuses);
           }

    /**
     * Test of deleteTask method, of class Report.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String[] statuses = null;
        String[] taskDescript = null;
        String[] developers = null;
        String[] taskNames = null;
        String[] taskIds = null;
        int[] durations = null;
        Report instance = new Report();
        instance.deleteTask(statuses, taskDescript, developers, taskNames, taskIds, durations);
            }
    
}

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
        String[] statuses = {"To do","doing","Done","To do"};
        String[] developers = {"Mike smith","Edward harrison","samantha paulson","Glenda  Oberholzer"};
        String[] Taskdescript = {"T1","T2","T3","T4"};
        String[] taskNames = {"create login","Create add features","create reports","add arrays"};
        String[] taskIds ={"T1","T2","T3","T4"};
        int[] durations = {5,8,2,11};
        Report instance = new Report();
        instance.displayReport(statuses, developers, Taskdescript, taskNames, taskIds, durations);
        
    }

    /**
     * Test of displayDoneTasks method, of class Report.
     */
    @Test
    public void testDisplayDoneTasks() {
        System.out.println("displayDoneTasks");
        String[] statuses = {"To do","doing","Done","To do"};
        String[] developers = {"Mike smith","Edward harrison","samantha paulson","Glenda  Oberholzer"};
        String[] taskNames = {"create login","Create add features","create reports","add arrays"};
        int[] durations = {5,8,2,11};
        Report instance = new Report();
        instance.displayDoneTasks(statuses, developers, taskNames, durations);
            }

    /**
     * Test of displayLongestTask method, of class Report.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        int[] durations = {5,8,2,11};
        String[] developers = {"Mike smith","Edward harrison","samantha paulson","Glenda  Oberholzer"};
        String[] taskNames = {"create login","Create add features","create reports","add arrays"};
        Report instance = new Report();
        instance.displayLongestTask(durations, developers, taskNames);
            }

    /**
     * Test of searchTaskByName method, of class Report.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String[] taskNames = {"create login","Create add features","create reports","add arrays"};
        String[] developers = {"Mike smith","Edward harrison","samantha paulson","Glenda  Oberholzer"};
        String[] statuses = {"To do","doing","Done","To do"};
        Report instance = new Report();
        instance.searchTaskByName(taskNames, developers, statuses);
    }
    /**
     * Test of searchTasksByDeveloper method, of class Report.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String[] developers = {"Mike smith","Edward harrison","samantha paulson","Glenda  Oberholzer"};
        String[] taskNames = {"create login","Create add features","create reports","add arrays"};
        String[] statuses = {"To do","doing","Done","To do"};
        Report instance = new Report();
        instance.searchTasksByDeveloper(developers, taskNames, statuses);
        
    }

    /**
     * Test of deleteTask method, of class Report.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String[] statuses = {"To do","doing","Done","To do"};
        String[] taskDescript = {"T1","T2","T3","T4"};
        String[] developers = {"Mike smith","Edward harrison","samantha paulson","Glenda  Oberholzer"};
        String[] taskNames = {"create login","Create add features","create reports","add arrays"};
        String[] taskIds = {"T1","T2","T3","T4"};
        int[] durations = {5,8,2,11};
        Report instance = new Report();
        instance.deleteTask(statuses, taskDescript, developers, taskNames, taskIds, durations);
           }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesegopoe;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class LesegoPOE {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
         final JDialog dialog = new JDialog();
         dialog.setAlwaysOnTop(true);
         
       part1Class userLogin = new part1Class();
        // User registration for account
        System.out.println("Register your account..........");
        
         //prompt user to register their details
        System.out.println("Enter your First Name:");
        String firstName = sc.nextLine();
        userLogin.setFirstName(firstName);
        
        System.out.println("Enter your Last Name:");
        String lastName = sc.nextLine();
        userLogin.setLastName(lastName);
        
        System.out.println("Enter  your Username:");
        String username = sc.nextLine();
        userLogin.setUsername(username);
        
        System.out.println("Enter your  Password:");
        String password = sc.nextLine();
        userLogin.setPassword(password);
        
          System.out.println(userLogin.registerUser());
          
          //check if the entered username and password meet the required criteria
        while (!userLogin.checkUsername(username) || !userLogin.checkPasswordComplexity(password )) {
          
           
            System.out.println("Enter your  Username:");
            username = sc.nextLine();
            
             System.out.println("Enter your  Password:");
            password = sc.nextLine();
            //Register the user
            System.out.println(userLogin.registerUser());
        }
        
         // User login  with entered username and password
      
         
         userLogin.loginUser(username ,password );
        
        userLogin.Returnlogin();
        //Show a welcome message using JOptionPane
        JOptionPane.showMessageDialog(null,"WELCOME TO EASYKANBAN");
        
        //create a task object for task management
        Task task = new Task ();
        
        //Menu variable to control the loop and select options
        int Menu =0;
        while(Menu!=3){
            
        //Display menu options to the user and capture their choice
         Menu = Integer.parseInt(JOptionPane.showInputDialog("Select an option: \n 1: Add Tasks \n 2: Show Report \n 3: Exit"));
         
         switch(Menu){
             case 1:
                 int accumulatedhours=0;
                 int size=0;
                 
        //Declaring arrays to hold task details
        size = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter"));
        String [] Taskname = new String[size];
        String [] TaskDescription = new String[size];
        String [] Developer = new String[size];
        int [] duration = new int [size];
        String [] TaskId = new String [size];
        String [] Taskstatus = new String [size];
                 
                 
            //Loop to input task details 
                for (int i = 0; i < size; i++) {
                     //Prompt user to enter taskname
                    Taskname[i] = JOptionPane.showInputDialog("Enter taskname:");
                    //check if the task description is within the character limit
                    do{
                        TaskDescription[i]=JOptionPane.showInputDialog("Enter task Description(MAX 50 characters):");  
                     }while(
                        !task.checkTaskDescription(TaskDescription[i]));


                      Developer[i]=JOptionPane.showInputDialog("Firstname and lastname");
                      //Prompt user to enter the task duration in hours
                      duration[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter task duration of (in hours)"));
                      
                    //create task Id
                      TaskId [i]=task.createTaskID(Taskname[i], i, Developer[i]);
                      JOptionPane.showMessageDialog(null,"Task Id:" + TaskId[i]);
                      
                    //Prompt user to select a task option
                     int status  = Integer.parseInt(JOptionPane.showInputDialog("Select an option: \n 1: To do \n 2: Done \n 3: Doing"));
                      
                     //select the task status based on the user's input
                      switch(status){
                     case 1:
                        Taskstatus[i]="To do";
                           break;

                     case 2:
                        Taskstatus[i]="Done";
                              break;

                     case 3:
                        Taskstatus[i]="Doing";
                              break;
                        }
                JOptionPane.showMessageDialog(null,"Task status:" + Taskstatus[i]);
                      
                //Print out the task details using the Task object

                      task.printTaskDetails( Taskstatus[i], i, Taskname[i], TaskDescription[i],  TaskId [i], duration [i]);
                // Accumulate the total hours for all tasks entered

                accumulatedhours= accumulatedhours+ task.ReturnTotalHours(duration[i]);
                }
                // Display the total number of tasks entered

            JOptionPane.showMessageDialog(null,"Total of all the taks: " + size);
    
            
              break;  
             case 2:
               JOptionPane.showMessageDialog(null,"Coming soon");

                 break;
             case 3:
                 JOptionPane.showMessageDialog(null,"Goodbye!!");
                 System.exit(0);
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Invalid option");
                 break;
         }
     }
}
}

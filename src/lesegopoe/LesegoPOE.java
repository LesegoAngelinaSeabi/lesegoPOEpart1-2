/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesegopoe;

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
        // TODO code application logic here
         
       part1Class userLogin = new part1Class();
        // User registration for account
        JOptionPane.showMessageDialog(null,"Register your account..........");
        
        String firstName = JOptionPane.showInputDialog("Enter your First Name:");
        userLogin.setFirstName(firstName);
        
       
        String lastName = JOptionPane.showInputDialog("Enter your Last Name:");
        userLogin.setLastName(lastName);
        
        
        String username = JOptionPane.showInputDialog("Enter  your Username:");
        userLogin.setUsername(username);
        
        
        String password = JOptionPane.showInputDialog("Enter your  Password:");
        userLogin.setPassword(password);
        
          System.out.println(userLogin.registerUser());
        while (!userLogin.checkUsername(username) || !userLogin.checkPasswordComplexity(password )) {
          //   JOptionPane.showMessageDialog(null,"username is incorrectly formatted and password does not meet the complexity requirements");
           
            
            username = JOptionPane.showInputDialog(null,"Enter your Username:","Easy Kanban - Login",JOptionPane.INFORMATION_MESSAGE);
            
            password = JOptionPane.showInputDialog(null,"Enter your Password:","Easy Kanban - Login",JOptionPane.INFORMATION_MESSAGE);
            System.out.println(userLogin.registerUser());
        }
         // User login their details
       
        
          userLogin.loginUser(username ,password );
        
        userLogin.Returnlogin();
        JOptionPane.showMessageDialog(null,"WELCOME TO EASYKANBAN");
        Task task = new Task ();
        int Menu =0;
        while(Menu!=3){
            
         Menu = Integer.parseInt(JOptionPane.showInputDialog("Select an option: \n 1: Add Tasks \n 2: Show Report \n 3: Exit"));
         
         switch(Menu){
             case 1:
                 int accumulatedhours=0;
                 int size=0;
                 size = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter"));
                 String [] Taskname = new String[size];
                 String [] TaskDescription = new String[size];
                 String [] Developer = new String[size];
                 int [] duration = new int [size];
                 String [] TaskId = new String [size];
                 String [] Taskstatus = new String [size];
                 
                 
                 
                 for (int i = 0; i < size; i++) {
                     
                  Taskname[i] = JOptionPane.showInputDialog("Enter taskname:");
                  
                   do{
                  TaskDescription[i]=JOptionPane.showInputDialog("Enter task Description(MAX 50 characters):");  
                 }while(!task.checkTaskDescription(TaskDescription[i]));
                    
                  
                  Developer[i]=JOptionPane.showInputDialog("Firstname and lastname");
                  duration[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter task duration of (in hours)"));
                  
                  TaskId [i]=task.createTaskID(Taskname[i], i, Developer[i]);
                  JOptionPane.showMessageDialog(null,"Task Id:" + TaskId[i]);
                    
                  int status  = Integer.parseInt(JOptionPane.showInputDialog("Select an option: \n 1: To do \n 2: Done \n 3: Doing"));
                  
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
                  //do a while loop for TAskdescription
                  task.printTaskDetails( Taskstatus[i], i, Taskname[i], TaskDescription[i],  TaskId [i], duration [i]);
                 accumulatedhours= accumulatedhours+ task.ReturnTotalHours(duration[i]);
                 }
            JOptionPane.showMessageDialog(null,"Total of all the taks: " + accumulatedhours);
      
            
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

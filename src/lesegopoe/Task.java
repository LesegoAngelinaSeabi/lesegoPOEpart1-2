/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesegopoe;

import javax.swing.JOptionPane;


/**
 *
 * @author RC_Student_lab
 */
// Task class to call out the task methods
public class Task {
    // Method to check the validity of the task description length
    public boolean checkTaskDescription(String Description){
        boolean verify = false;
        // If description length is less than 50 characters, it's valid
        if (Description.length()<50) {
            JOptionPane.showMessageDialog(null, "Task Description is successfully captured:");
            verify=true;
        }else{
             //If description length is 50 characters or more, it's invalid
         JOptionPane.showMessageDialog(null, "Task Description is not successfully captured, please ensure that it meets the requirements:");
         verify=false;
        }
        
        return verify;
    }
    //Method to create a unique task ID based on task number and developer initials
   public String createTaskID(String createTaskID, int number, String developer) {
       String initials = createTaskID.substring(0, 2).toUpperCase() + ":" + number +":" + developer.substring(developer.length()-3).toUpperCase();
       
   return initials;
   }
   // Method to print task details 
   public String printTaskDetails(String status,int number, String taskname, String description,  String id, int duration){
      //formatted string with all task details
       String details= "The details are as follows" +"\nTask status:"+ status+
               "\nTask number:"+number +"\nTaskname:"+
               taskname+"\nTask Description:"+
               description+ "\nTask ID:"+ 
               id +"\nDuration:"+duration;
          // Display the task details in a message dialog
       JOptionPane.showMessageDialog(null,details);
       
       return details;
   }
   //Method to return total hours for the task
   public int ReturnTotalHours(int hours){
       int total = hours;
       
       return total;
   }
}



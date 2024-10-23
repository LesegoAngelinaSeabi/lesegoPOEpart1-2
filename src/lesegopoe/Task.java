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

public class Task {
    public boolean checkTaskDescription(String Description){
        boolean verify = false;
        if (Description.length()<50) {
            JOptionPane.showMessageDialog(null, "Task Description is successfully captured:");
            verify=true;
        }else{
         JOptionPane.showMessageDialog(null, "Task Description is not successfully captured, please ensure that it meets the requirements:");
         verify=false;
        }
        
        return verify;
    }
   public String createTaskID(String createTaskID, int number, String developer) {
       String initials = createTaskID.substring(0, 2).toUpperCase() + ":" + number +":" + developer.substring(developer.length()-3).toUpperCase();
       
   return initials;
   }
   public String printTaskDetails(String status,int number, String taskname, String description,  String id, int duration){
       String details= "The details are as follows" +"\nTask status:"+ status+
               "\nTask number:"+number +"\nTaskname:"+
               taskname+"\nTask Description:"+
               description+ "\nTask ID:"+ 
               id +"\nDuration:"+duration;
          
       JOptionPane.showMessageDialog(null,details);
       
       return details;
   }
   public int ReturnTotalHours(int hours){
       int total = hours;
       
       return total;
   }
}



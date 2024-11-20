/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesegopoe;


import javax.swing.JOptionPane;

public class Report {

    // Display all tasks in the report
    public void displayReport(String[] statuses, String[] developers, String [] Taskdescript,String[] taskNames, String[] taskIds, int[] durations) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < taskNames.length; i++) {
            output.append("Task Status: ").append(statuses[i])
                .append("\n Developer: ").append(developers[i])
                .append("\n Task Number: ").append(i)
                .append("\n Task Name: ").append(taskNames[i])
                     .append("\n TaskDescription: ").append(Taskdescript[i])
                .append("\n Task ID: ").append(taskIds[i])
                .append("\n Duration: ").append(durations[i])
                .append("hours\n****************************************\n");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }

    // Display tasks that are marked as "Done"
    public void displayDoneTasks(String[] statuses, String[] developers, String[] taskNames, int[] durations) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < statuses.length; i++) {
            if ("Done".equals(statuses[i])) {
                output.append("Developer: ").append(developers[i])
                    .append("\n Task Name: ").append(taskNames[i])
                    .append("\n Duration: ").append(durations[i])
                    .append("hours\n**************************\n");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }

    // Find and display the task with the longest duration
    public void displayLongestTask(int[] durations, String[] developers, String[] taskNames) {
        int maxDuration = 0;
        int index = -1;
        
        for (int i = 0; i < durations.length; i++) {
            if (durations[i] > maxDuration) {
                maxDuration = durations[i];
                index = i;
            }
        }
        
        if (index != -1) {
            JOptionPane.showMessageDialog(null, "Developer with the longest duration"+"\nDeveloper: " + developers[index]
                    + "\n Task Name: " + taskNames[index]
                    + "\n Duration: " + durations[index] + " hours");
        }
    }

    // Search for a task by its name
    public void searchTaskByName(String[] taskNames, String[] developers, String[] statuses) {
        String searchQuery = JOptionPane.showInputDialog("Enter task name to search:");
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(searchQuery)) {
                output.append("Task Name: ").append(taskNames[i])
                    .append("\n Developer: ").append(developers[i])
                    .append("\n Status: ").append(statuses[i])
                    .append("\n");
            }
        }
        
        if (output.length() > 0) {
            JOptionPane.showMessageDialog(null, output.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }

    // Search for tasks by developer's name
    public void searchTasksByDeveloper(String[] developers, String[] taskNames, String[] statuses) {
        String searchQuery = JOptionPane.showInputDialog("Enter developer name to search:");
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < developers.length; i++) {
            if (developers[i].equalsIgnoreCase(searchQuery)) {
                output.append("Task Name: ").append(taskNames[i])
                    .append("\n Status: ").append(statuses[i])
                    .append("\n");
            }
        }
        
        if (output.length() > 0) {
            JOptionPane.showMessageDialog(null, output.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks found for this developer.");
        }
    }

    // Delete a task by its name
    public void deleteTask(String[] statuses,String [] taskDescript, String[] developers, String[] taskNames, String[] taskIds, int[] durations) {
        String searchQuery = JOptionPane.showInputDialog("Enter task name to delete:");
        boolean taskFound = false;
        String[] remove = {"Delete", "Cancel"};
        
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(searchQuery)) {
                 int sure;
                           //asking the users whether they want to delete the task or not
                            sure = JOptionPane.showOptionDialog(null, "Do you still want to delete the task" + " " + searchQuery + "?",
                                    "End of task", JOptionPane.PLAIN_MESSAGE,
                                    JOptionPane.WARNING_MESSAGE, null,
                                    remove, null);
                // Shift all task arrays to remove the task
                for (int j = i; j < taskNames.length - 1; j++) {
                    statuses[j] = statuses[j + 1];
                    developers[j] = developers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskDescript[j] = taskNames[j + 1];
                    taskIds[j] = taskIds[j + 1];
                    durations[j] = durations[j + 1];
                }
                
                // Clear the last task entry (optional but cleaner)
                statuses[taskNames.length - 1] = "";
                developers[taskNames.length - 1] = "";
                taskNames[taskNames.length - 1] = "";
                taskIds[taskNames.length - 1] = "";
                taskDescript[taskNames.length - 1] = "";
                durations[taskNames.length - 1] = 0;
                
                JOptionPane.showMessageDialog(null, "Task deleted successfully.");
                taskFound = true;
                break;
            }
        }
        
        if (!taskFound) {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }
}

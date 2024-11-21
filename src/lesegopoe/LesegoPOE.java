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
    // Scanner object for user input
    JDialog dialog = new JDialog();
    dialog.setAlwaysOnTop(true);
    Scanner sc = new Scanner(System.in);

    // Create instances of external classes
    part1Class userLogin = new part1Class();
    Report report = new Report();
    Task task = new Task();

    // User registration for account
    System.out.println("Register your account..........");

    // Prompt user to register their details
    System.out.print("Enter your First Name: ");
    String firstName = sc.nextLine();
    userLogin.setFirstName(firstName);

    System.out.print("Enter your Last Name: ");
    String lastName = sc.nextLine();
    userLogin.setLastName(lastName);

    System.out.print("Enter your Username: ");
    String username = sc.nextLine();
    userLogin.setUsername(username);

    System.out.print("Enter your Password: ");
    String password = sc.nextLine();
    userLogin.setPassword(password);
    

    System.out.println(userLogin.registerUser());

    // Check if the entered username and password meet the required criteria
    while (!userLogin.checkUsername(username) || !userLogin.checkPasswordComplexity(password)) {
        System.out.print("Enter your Username: ");
        username = sc.nextLine();

        System.out.print("Enter your Password: ");
        password = sc.nextLine();

        System.out.println(userLogin.registerUser());
    }

    // User login with entered username and password
    userLogin.loginUser(username, password);
    userLogin.Returnlogin();
//part 2
    // Show a welcome message using JOptionPane
    JOptionPane.showMessageDialog(null, "WELCOME TO EASYKANBAN");

    // Declare arrays globally so they can be used across different cases
    String[] taskName = null;
    String[] taskDescription = null;
    String[] developer = null;
    int[] duration = null;
    String[] taskId = null;
    String[] taskStatus = null;

    // Menu loop for task management
    int menu = 0;
    while (menu != 3) {
        menu = Integer.parseInt(JOptionPane.showInputDialog("Select an option:\n1: Add Tasks\n2: Show Report\n3: Exit"));

        switch (menu) {
            case 1:
                int accumulatedHours = 0;
                int size = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter?"));

                // Initialize arrays based on the number of tasks
                taskName = new String[size];
                taskDescription = new String[size];
                developer = new String[size];
                duration = new int[size];
                taskId = new String[size];
                taskStatus = new String[size];

                // Loop to input task details
                for (int i = 0; i < size; i++) {
                    taskName[i] = JOptionPane.showInputDialog("Enter task name:");

                    // Check if the task description is within the character limit
                    do {
                        taskDescription[i] = JOptionPane.showInputDialog("Enter task description (MAX 50 characters):");
                    } while (!task.checkTaskDescription(taskDescription[i]));

                    developer[i] = JOptionPane.showInputDialog("Enter developer's name:");
                    duration[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration (in hours):"));

                    // Create task ID
                    taskId[i] = task.createTaskID(taskName[i], i, developer[i]);
                    JOptionPane.showMessageDialog(null, "Task ID: " + taskId[i]);

                    // Prompt user to select task status
                    int status = Integer.parseInt(JOptionPane.showInputDialog("Select a task status:\n1: To Do\n2: Done\n3: Doing"));
                    switch (status) {
                        case 1: taskStatus[i] = "To Do"; break;
                        case 2: taskStatus[i] = "Done"; break;
                        case 3: taskStatus[i] = "Doing"; break;
                    }
                    JOptionPane.showMessageDialog(null, "Task status: " + taskStatus[i]);

                   

                    // Accumulate total hours for all tasks entered
                    accumulatedHours += task.ReturnTotalHours(duration[i]);
                }
                // Display total number of tasks entered
                JOptionPane.showMessageDialog(null, "Total duration of tasks performed: " + accumulatedHours);
                break;

            case 2:
                // Loop for viewing reports until the user selects to quit
                int options;
                boolean quitReport = false;
                while (!quitReport) {
                    options = Integer.parseInt(JOptionPane.showInputDialog("Choose an option:\n1. View Report\n2. View Developer with Longest Duration\n3. View Completed Tasks\n4. Search for a Task Name\n5. Search by Developer Name\n6. Delete Task\n7. Quit"));

                    switch (options) {
                        /* called my switch case the implemented a conditional statement to check if the array is not null, for each and evey option*/
                        case 1:
                            if (taskStatus != null && developer != null && taskName != null && taskId != null && duration != null) {
                                report.displayReport(taskStatus, developer, taskDescription,taskName, taskId, duration);
                            }
                            break;
                        case 2:
                            if (duration != null && developer != null && taskName != null) {
                                report.displayLongestTask(duration, developer, taskName);
                            }
                            break;
                        case 3:
                            if (taskStatus != null && developer != null && taskName != null && duration != null) {
                                report.displayDoneTasks(taskStatus, developer, taskName, duration);
                            }
                            break;
                        case 4:
                            if (taskName != null && developer != null && taskStatus != null) {
                                report.searchTaskByName(taskName, developer, taskStatus);
                            }
                            break;
                        case 5:
                            if (developer != null && taskName != null && taskStatus != null) {
                                report.searchTasksByDeveloper(developer, taskName, taskStatus);
                            }
                            break;
                        case 6:
                            if (taskStatus != null && developer != null && taskName != null && taskId != null && duration != null) {
                                report.deleteTask(taskStatus,taskDescription, developer, taskName, taskId, duration);
                            }
                            break;
                        case 7:
                            // Quit the report loop and return to the main menu
                            quitReport = true;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Invalid option, please try again.");
                            break;
                    }
                }
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Goodbye!");
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid option");
                break;
        }
    }
}

}
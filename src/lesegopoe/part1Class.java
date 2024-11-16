/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesegopoe;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class part1Class {

    private String firstName, lastName, password, username;
    
// Getter and setter methods for first name, last name, username, and password

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    // Boolean flag to check if the user is successfully logged in

    private boolean istrue = false;
    
   // Method to check if the username is valid
    public boolean checkUsername(String username) {
        boolean validate = false;
        
        // Username must be at least 6 characters long and contain an underscore
        if (username.length() <= 5 && username.contains("_")) {
            
            validate = true;
        } else {
          
            validate = false;
        }
        return validate;
    }
       // Method to check if the password meets complexity requirements
    public boolean checkPasswordComplexity(String password) {
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        boolean verify = false;

        if (password.length() >= 8) {
            // Check each character of the password to see if it meets the complexity criteria

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasCapitalLetter = true;
                } else if (Character.isDigit(ch)) {
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }
        }
        if (hasCapitalLetter && hasNumber && hasSpecialChar) {
            verify = true;
        } else {
            verify = false;
        }
        return verify;
    }
   // Method to register the user by checking the validity of the username and password

    public String registerUser() {

        if (checkUsername(username) && checkPasswordComplexity(password)) {
            System.out.println("The two above conditions have been met and the user has been registered successfully.");
        } else {
            System.out.println("The two above conditions have been not met the requirements");
        }
        
        return "";
    }
// User login method, prompts the user to enter username and password

    public boolean loginUser(String user, String pass) {
       Scanner scan = new Scanner(System.in);
       
       //loop until the user enters correct username and password
        do {
            System.out.print("Enter username:");
            user = scan.nextLine();
            
             System.out.print("Enter password:");
            pass = scan.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                istrue = true;
            } else {
                System.out.println("password or username is incorrect please try again");

            }
        } while (!istrue); 
                 
        return istrue;
    }
//method to return a message showing the results of the login attempt
    public String Returnlogin() {

        if (istrue) {
            System.out.println( "welcome back " + getFirstName() + " " + getLastName());

        } else {
            System.out.println("username or password is incorrect please try again");

        }

        return " ";
    }

}




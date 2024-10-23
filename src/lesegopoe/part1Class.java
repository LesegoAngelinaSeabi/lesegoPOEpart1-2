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
public class part1Class {

    private String firstName, lastName, password, username;

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

    private boolean istrue = false;
    // Check if the username is correct

    public boolean checkUsername(String username) {
        boolean validate = false;
        if (username.length() <= 5 && username.contains("_")) {
            
            validate = true;
        } else {
          
            validate = false;
        }
        return validate;
    }
    // Check the passwordcomplexity 

    public boolean checkPasswordComplexity(String password) {
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        boolean verify = false;

        if (password.length() >= 8) {
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
    // Register the user by checking username and password validity

    public String registerUser() {

        if (checkUsername(username) && checkPasswordComplexity(password)) {
            JOptionPane.showMessageDialog(null, "The two above conditions have been met and the user has been registered successfully.","Easy Kanban - Register",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The two above conditions have been not met the requirements","Easy Kanban - Register",JOptionPane.INFORMATION_MESSAGE);
        }
        
        return "";
    }

    public boolean loginUser(String user, String pass) {

        do {

            user = JOptionPane.showInputDialog(null,"Enter username:","Easy Kanban - Login",JOptionPane.INFORMATION_MESSAGE);

            pass = JOptionPane.showInputDialog(null,"Enter password:","Easy Kanban - Login",JOptionPane.INFORMATION_MESSAGE);

            if (user.equals(username) && pass.equals(password)) {
                istrue = true;
            } else {
                JOptionPane.showMessageDialog(null, "password or username is incorrect please try again","Easy Kanban - Login",JOptionPane.INFORMATION_MESSAGE);

            }
        } while (!istrue); 
                 
        return istrue;
    }

    public String Returnlogin() {

        if (istrue) {
            JOptionPane.showMessageDialog(null, "welcome back " + getFirstName() + " " + getLastName(),"Easy Kanban - Login",JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "username or password is incorrect please try again","Easy Kanban - Login",JOptionPane.INFORMATION_MESSAGE);

        }

        return " ";
    }

}

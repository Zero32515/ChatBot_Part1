/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatbot_part1;

/**
 *
 * @author Student
 */
public class Login {
    private String savedUser, savedPass;

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;
        boolean hasUpper = false, hasDigit = false, hasSpecial = false;
        for (char check : password.toCharArray()) {
            if (Character.isUpperCase(check)) hasUpper = true;
            if (Character.isDigit(check)) hasDigit = true;
            if (!Character.isLetterOrDigit(check)) hasSpecial = true;
        }
        return hasUpper && hasDigit && hasSpecial;
    }

    public boolean checkCellPhoneNumber(String phone) {
    return phone.startsWith("+27") && phone.length() >= 10;
}

    public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is incorrectly formatted.";
        } else if (!checkPasswordComplexity(password)) {
            return "Password does not meet the complexity requirements.";
        } else {
            this.savedUser = username;
            this.savedPass = password;
            return "The two above conditions have been met, and the user has been registered successfully.";
        }
    }

    public boolean loginUser(String username, String password) {
        return username.equals(savedUser) && password.equals(savedPass);
    }

    public String returnLoginStatus(boolean success, String firstName, String lastName) {
        if (success) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}

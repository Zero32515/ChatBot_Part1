/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatbot_part1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ChatBot_Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    Login auth = new Login();

    System.out.println("--- Registration ---");

 
    String phone = "";
    boolean validPhone = false;
    while (!validPhone) {
        System.out.print("Enter your Phone Number: ");
        phone = scanner.nextLine();
        if (auth.checkCellPhoneNumber(phone)) {
            System.out.println("Phone number captured successfully.");
            validPhone = true;
        } else {
            System.out.println("Phone number is incorrectly formatted. Please try again.");
        }
    }
    String u = "";
    String p = "";
    boolean registered = false;
    while (!registered) {
        System.out.print("Enter username: ");
        u = scanner.nextLine();
        System.out.print("Enter password: ");
        p = scanner.nextLine();

        String registrationStatus = auth.registerUser(u, p);
        System.out.println(registrationStatus);

   
        if (registrationStatus.contains("successfully")) {
            registered = true;
        } else {
            System.out.println("Please modify your credentials to meet requirements.");
        }
    }
    System.out.println("\n--- Login ---");
    boolean loginSuccessful = false;
    while (!loginSuccessful) {
        System.out.print("Username: ");
        String logU = scanner.nextLine();
        System.out.print("Password: ");
        String logP = scanner.nextLine();

        loginSuccessful = auth.loginUser(logU, logP);
        System.out.println(auth.returnLoginStatus(loginSuccessful, "Wanga", "Mulovhedzi"));

        if (!loginSuccessful) {
            System.out.println("Please try logging in again.");
        }
    }
    
    scanner.close();
}      
    }
    

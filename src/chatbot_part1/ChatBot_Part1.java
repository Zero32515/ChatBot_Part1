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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Login auth = new Login(); 

        System.out.println("--- Registration ---");
        System.out.print("Enter username: ");
        String u = input.nextLine();
        System.out.print("Enter password: ");
        String p = input.nextLine();
        System.out.print("Enter your Phone Number: ");
String phone = input.nextLine();

if (auth.checkCellPhoneNumber(phone)) {
    System.out.println("Phone number captured successfully.");
} else {
    System.out.println("Phone number is incorrectly formatted.");
}
        
        System.out.println(auth.registerUser(u, p));

        System.out.println("\n--- Login ---");
        System.out.print("Username: ");
        String logU = input.nextLine();
        System.out.print("Password: ");
        String logP = input.nextLine();

        boolean isCorrect = auth.loginUser(logU, logP);
        // Using the names from your assignment requirements
        System.out.println(auth.returnLoginStatus(isCorrect, "Wanga", "Mulovhedzi"));
    }
    
}

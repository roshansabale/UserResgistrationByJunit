package com.Bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        int choice;
        Scanner scanner=new Scanner(System.in);
        UserRegistrationOperations userRegistrationOperations=new UserRegistrationOperations();
        System.out.println("**** User Registration Checking System ****");
        do {
            System.out.println("\n"+"1:Validate first name" + "\n" +"2:Validate last name"+"\n"+"3:Validate Email Address"+"\n"+"4:Exit"+"\n"+ "Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your first name");
                    String firstName = scanner.next();
                    userRegistrationOperations.validateFirstName(firstName);
                    break;
                case 2:
                    System.out.println("Enter your last name");
                    String lastName= scanner.next();
                    userRegistrationOperations.validateLastName(lastName);
                    break;
                case 3:
                    System.out.println("Enter your Email");
                    String email=scanner.next();
                    userRegistrationOperations.validateEmail(email);
                    break;
            }
        }while (choice!=4);
    }
}

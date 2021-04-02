package com.Bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        int choice;
        Scanner scanner=new Scanner(System.in);
        UserRegistrationOperations userRegistrationOperations=new UserRegistrationOperations();
        System.out.println("**** User Registration Checking System ****");
        do {
            System.out.println("\n"+"1:Validate first name" + "\n" +"2:Validate last name"+"\n"+"3:Validate Email Address"
                    +"\n"+"4:Validate Mobile Number"+"\n"+"5:Validate Password"+"\n"+"6:Exit"+"\n"+ "Enter your choice:");
             choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter your first name");
                    String firstName = scanner.next();
                    userRegistrationOperations.validateFirstNameOrLastName(firstName);
                    break;
                case 2:
                    System.out.println("Enter your last name");
                    String lastName= scanner.next();
                    userRegistrationOperations.validateFirstNameOrLastName(lastName);
                    break;
                case 3:
                    System.out.println("Enter your Email");
                    String email=scanner.next();
                    userRegistrationOperations.validateEmail(email);
                    break;
                case 4:
                    System.out.println("Enter your MobileNumber");
                    String mobileNumber=scanner.nextLine();
                    userRegistrationOperations.validateMobileNumber(mobileNumber);
                    break;
                case 5:
                    System.out.println("Enter your password");
                    String password=scanner.nextLine();
                    userRegistrationOperations.validatePassword(password);
                    break;
            }
        }while (choice!=6);
    }
}

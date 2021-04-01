package com.Bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        int choice;
        Scanner scanner=new Scanner(System.in);
        UserRegistrationOperations userRegistrationOperations=new UserRegistrationOperations();
        System.out.println("**** User Registration Checking System ****");
        do {
            System.out.println("\n"+"1:Validate first name" + "\n" +"2:Validate last name"+"\n"+"3:Validate Email Address"+"\n"+"4:Validate Mobile Number"+"\n"+"5:Exit"+"\n"+ "Enter your choice:");
             choice = Integer.parseInt(scanner.nextLine());
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
                case 4:
                    System.out.println("Enter your MobileNumber");
                    String mobileNumber=scanner.nextLine();
                    userRegistrationOperations.validateMobileNumber(mobileNumber);
                    break;
            }
        }while (choice!=5);
    }
}

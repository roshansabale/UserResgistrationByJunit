package com.Bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationOperations {
    //UC:1 Validate FirstName
    public boolean validateFirstName(String firstName) {
        String pattern ="^[A-Z]{1}[a-z]{2,25}$";

        boolean status;
        if(Pattern.matches(pattern, firstName)) {
            System.out.println("First name is Valid !!");
            status=true;
        }else {
            System.out.println("First name is Invalid !!");
            status=false;
        }
        return status;
    }

    public boolean validateLastName(String lastName) {
        String pattern = "^[A-Z]{1}[a-z]{2,25}$";

        boolean status;
        if (Pattern.matches(pattern, lastName)) {
            System.out.println("Last name is Valid !!");
            status = true;
        } else {
            System.out.println("Last name is Invalid !!");
            status = false;
        }
        return status;
    }
    //abc.xyz@bl.co.in
    public boolean validateEmail(String email) {
        String pattern = "[a-z]{1}(.+)@([a-z]{1,15})(.?([a-z]{2}))+(.?(([a-z]{2})*))$";
        boolean status;
        if (Pattern.matches(pattern, email)) {
            System.out.println("Email is Valid !!");
            status = true;
        } else {
            System.out.println("Email is Invalid !!");
            status = false;
        }
        return status;
    }
    //91 9645871102
    public boolean validateMobileNumber(String mobileNumber) {
        String pattern="[91]{2}\\s[789]{1}[0-9]{9}$";
        boolean status;
        if (Pattern.matches(pattern,mobileNumber)) {
            System.out.println("Mobile Number is valid !!");
            status=true;
        } else {
            System.out.println("Mobile Number is Invalid !!");
            status=false;
        }
        return status;
    }
}

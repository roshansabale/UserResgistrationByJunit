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
}

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
    //abc.xyz@bl.co.in  {15}@[a-z]{15}.[a-z]{3}.[a-z]{3}
    public boolean validateEmail(String email) {
        String pattern = "[a-z]{1}(.+)@([a-z]{1,15})(.?([a-z]{2}))+(.?(([a-z]{2})*))$";
       // String pattern="[a-z]+(\\.([a-z]*))+@[a-z]+(.(([a-z]{2})*))+(\\.(([a-z]{2})*))$";
        //(.+)$";//"^[a-z]{1}(.*a-z])+@[a-z](.+[a-z])(.+[a-z])$";
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
}

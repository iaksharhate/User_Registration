package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {

    static Scanner sc = new Scanner(System.in);

    public static void validateFirstName(){

        System.out.println("Enter first name: ");
        String fName = sc.next();
        String regex = "^[A-Z]{1}[a-z]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fName);
        boolean r = matcher.matches();

        if (r)
            System.out.println("It is a valid first name.");
        else
            System.out.println("It is invalid first name.");
    }

    public static void validateLastName(){

        System.out.println("Enter last name: ");
        String lName = sc.next();
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lName);
        boolean r = matcher1.matches();

        if (r)
            System.out.println("It is a valid last name.");
        else
            System.out.println("It is invalid last name.");
    }

    public static void validateEmail(){
        System.out.println("Enter your E-mail: ");
        String email = sc.next();
        String regex2 = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(email);
        boolean r = matcher2.matches();

        if (r)
            System.out.println("It is a valid E-mail.");
        else
            System.out.println("It is invalid E-mail.");
    }

    public static void validateMobileNumber(){
        System.out.println("Enter your mobile number: ");
        String mobileNo = sc.next();
        String regex3 = "(0|91)?[7-9][0-9]{9}";

        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(mobileNo);
        boolean r = matcher3.matches();

        if (r)
            System.out.println("It is a valid Mobile Number.");
        else
            System.out.println("It is invalid Mobile Number.");

    }

    public static void validatePasswordRule1(){
        System.out.println("Enter The Password Atleast Eight Character: ");
        String password = sc.nextLine();
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(password);
        boolean r = matcher4.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");

    }

    public static void validatePasswordRule2(){
        System.out.println("Enter The Password At least Eight Character one Upper case: ");
        String password = sc.nextLine();
        String regex5 = "^[A-Z]{1}+[a-z 0-9]{7,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password);
        boolean r = matcher5.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");

    }

    public static void validatePasswordRule3(){
        System.out.println("Enter The Password At least one Upper case and one numeric");
        String password = sc.nextLine();
        String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(password);
        boolean r = matcher6.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");

    }

    public static void validatePasswordRule4(){
        System.out.println("Enter the Password At least One Upper Case & One Numeric & One Special Character:");
        String password = sc.nextLine();
        String regex7 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
        Pattern pattern7 = Pattern.compile(regex7);
        Matcher matcher7 = pattern7.matcher(password);
        boolean r = matcher7.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");

    }

    public static void validateEmailSamples (){
        System.out.println("Enter your Email: ");
        String email = sc.nextLine();
        String regex8 = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(email);
        boolean r = matcher8.matches();

        if (r)
            System.out.println("It is a valid E-mail.");
        else
            System.out.println("It is invalid E-mail.");
    }
//    1] Test case with Junit to validate First Name
//    public boolean validateFirstName(String fName) {
//        String regex = "^[A-Z]{1}[a-z]*";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(fName);
//        boolean r = matcher.matches();
//        return r;
//    }

    public static final String regex = "^[A-Z]{1}[a-z]*";

    public boolean validateFirstName(String fName) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex);
        if (Pattern.matches(regex, fName))
            return Pattern.matches(regex, fName);
        else {
            throw new UserRegistrationException("Enter valid first name.");
        }
    }
//    2] Test case with Junit to validate Last Name
//    public boolean validateLastName(String lName) {
//        String regex = "^[A-Z]{1}[a-z]*";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(lName);
//        boolean r = matcher.matches();
//        return r;
//    }

    public static final String regex1 = "^[A-Z]{1}[a-z]*";

    public boolean validateLastName(String lName) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex1, lName))
            return Pattern.matches(regex1, lName);
        else {
            throw new UserRegistrationException("Enter valid last name.");
        }
    }
//    3] Test case with Junit to validate Email
//    public boolean validateEmail(String email) {
//        String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(email);
//        boolean r = matcher.matches();
//        return r;
//    }

    public static final String regex2 = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";

    public boolean validateEmail(String email) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex2, email))
            return Pattern.matches(regex2, email);
        else {
            throw new UserRegistrationException("Enter valid Email.");
        }
    }
//    4] Test case with Junit to validate Mobile Number
//    public boolean validateMobileNumber(String mobileNumber) {
//        String regex = "(0|91)?[7-9][0-9]{9}";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(mobileNumber);
//        boolean r = matcher.matches();
//        return r;
//    }

    public static final String regex3 = "(0|91)?[7-9][0-9]{9}";

    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex3);
        if (Pattern.matches(regex3, mobileNumber))
            return Pattern.matches(regex3, mobileNumber);
        else {
            throw new UserRegistrationException("Enter valid Mobile Number.");
        }
    }
//    5] Test case with Junit to validate password by Rule 1
//    public boolean validatePassword01(String password01) {
//        String regex = "^[A-Z a-z 0-9]{8,}$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(password01);
//        boolean r = matcher.matches();
//        return r;
//    }

    public static final String regex4 = "(^[A-Z a-z 0-9]{8,}$";

    public boolean validatePassword01(String password01) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex4);
        if (Pattern.matches(regex4, password01))
            return Pattern.matches(regex4, password01);
        else {
            throw new UserRegistrationException("Enter valid Password.");
        }
    }
//    6] Test case with Junit to validate password by Rule 2
//    public boolean validatePassword02(String password02) {
//        String regex = "^[A-Z]{1}+[a-z 0-9]{7,}$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(password02);
//        boolean r = matcher.matches();
//        return r;
//    }

    public static final String regex5 = "^[A-Z]{1}+[a-z 0-9]{7,}$";

    public boolean validatePassword02(String password02) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex5);
        if (Pattern.matches(regex5, password02))
            return Pattern.matches(regex5, password02);
        else {
            throw new UserRegistrationException("Enter valid Password.");
        }
    }
//    7] Test case with Junit to validate password by Rule 3
//    public boolean validatePassword03(String password03) {
//        String regex = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(password03);
//        boolean r = matcher.matches();
//        return r;
//    }

    public static final String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";

    public boolean validatePassword03(String password03) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex6);
        if (Pattern.matches(regex6, password03))
            return Pattern.matches(regex6, password03);
        else {
            throw new UserRegistrationException("Enter valid Password.");
        }
    }
//    8] Test case with Junit to validate password by Rule 4
//    public boolean validatePassword04(String password04) {
//        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(password04);
//        boolean r = matcher.matches();
//        return r;
//    }

    public static final String regex7 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";

    public boolean validatePassword04(String password04) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex6);
        if (Pattern.matches(regex6, password04))
            return Pattern.matches(regex6, password04);
        else {
            throw new UserRegistrationException("Enter valid Password.");
        }
    }
}

package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Akshar");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Hate");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("akshar.hate@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("8850463876");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword01_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword01("akshar11");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword02_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword02("Aksharha");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword03_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword03("AksharH1");
        Assertions.assertTrue(result);
    }
}

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
}

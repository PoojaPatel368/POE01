package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    private By _firstname = By.id("FirstName");
    By _lastnane = By.id("LastName");
    By _Email = By.name("Email");
    By _password = By.id("Password");
    By _ConfirmPassword = By.id("ConfirmPassword");
    By _registerbutton = By.id("register-button");


    public void enterRegistrationDetails(){
        //click on registration button
        clickOnElement(By.className("ico-register"));
        //type firstname

        typeText(By.id("FirstName"), "TestFirstName");
        //type lastname

        typeText(By.id("LastName"), "TestLastName");
        //type email address

        typeText(By.name("Email"), "testEmail" + timestamp() + "@gmail.com");
        //type password

        typeText(By.id("Password"), "test123");
        //type confirm password

        typeText(By.id("ConfirmPassword"), "test123");
        //click on register button

        clickOnElement(By.id("register-button"));
        //type message
    }

}

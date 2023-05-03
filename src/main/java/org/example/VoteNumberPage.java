package org.example;

import org.openqa.selenium.By;

public class VoteNumberPage extends Utils{

    public  void verifyUserShouldBeAbleToVoteNumber  ()     {
        clickOnElement(By.className("ico-register"));
        //type first name
        typeText(By.id("FirstName"), "ram");
        //type last name
        typeText(By.id("LastName"), "patel");
        //type email address
        typeText(By.name("Email"), "ram123@gmail.com");
        //type password
        typeText(By.id("Password"), "ram1234");
        //type confirm password
        typeText(By.id("ConfirmPassword"), "ram1234");
        //click on register submit button
        clickOnElement(By.id("register-button"));
        //click on login button
        clickOnElement(By.className("ico-login"));
        //Type  email address
        typeText(By.id("Email"), "ram123@gmail.com");
        // Enter Password
        typeText(By.id("Password"), "ram1234");
        clickOnElement(By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 login-button\"]"));
        //click on good
        clickOnElement(By.id("vote-poll-1"));
}}

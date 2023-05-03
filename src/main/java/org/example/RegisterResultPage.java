package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends  Utils{

private By _result = By.className("result");
String expectedMessage="Your registration completed";
    public void verifyUserRegisteredSuccessfully(){
        //type message
        Assert.assertEquals(getTextFromElement(_result),expectedMessage);

    }
}

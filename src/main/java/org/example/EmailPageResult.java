package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailPageResult extends Utils {

    private By _result = By.className("result");

    String expectedMessage ="Only registed user can Email";


    public void VerifyUserShouldAbleToEmail(){

        Assert.assertEquals(getTextFromElement(_result),expectedMessage);
    }


}

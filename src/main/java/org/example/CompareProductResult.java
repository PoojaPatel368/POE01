package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductResult extends Utils {

    private By _result = By.className("result");

    String expectedMessage ="can not compare products";

    public  void verifyUserBeAbleToCompareProduct(){
        Assert.assertEquals(getTextFromElement(_result),expectedMessage);
    }
    }





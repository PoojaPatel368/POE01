package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VoteNumberResult extends Utils{

    private By _VoteNumberResult = By.className("result");
    String expectedMessage="Only registered users can vote.";
    public void VerifyUserShouldAbleToVoteNumber() {

        String actualMessage = getTextFromElement(By.xpath("//span[@class=\"poll-total-votes\"]"));
        System.out.println("My Message:" + actualMessage);
    }

}

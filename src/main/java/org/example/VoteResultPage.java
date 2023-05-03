package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VoteResultPage extends Utils {

    private By _result = By.className("result");

    String expectedMessage ="CommunityPollVoteMessage";

    public void VerifyUserShouldAbleToVote(){

        Assert.assertEquals(getTextFromElement(_result),expectedMessage);
    }


}

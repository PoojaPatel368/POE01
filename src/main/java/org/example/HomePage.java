package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

   private By _registerButton = By.className("ico-register");

  private By _VoteResult = By.id("pollanswers-2");
  private By _VotePage = By.id("vote-poll-1");

    public void clickOnRegisterButton(){

     clickOnElement(_registerButton);

    }
    public void clickOnVoteResult(){
        clickOnElement(_VoteResult);

    }
    public void clickOnVotePage(){
        clickOnElement(_VotePage);
    }
}


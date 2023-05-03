package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Suit extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    LoginPage loginPage = new LoginPage();

    VotePage votePage = new VotePage();
    VoteResultPage voteResultPage = new VoteResultPage();

    EmailPage emailPage = new EmailPage();

    EmailPageResult emailPageResult = new EmailPageResult();

    CompareProduct compareProduct = new CompareProduct();
    CompareProductResult compareProductResult = new CompareProductResult();

    ElectronicItem electronicItem = new ElectronicItem();

    ElectronicItemResult electronicItemResult = new ElectronicItemResult();

    RefferAFriend refferAFriend = new RefferAFriend();

    VoteNumberPage voteNumberPage = new VoteNumberPage();

    VoteNumberResult voteNumberResult = new VoteNumberResult();

    @Test
    public void verifyUserShoudBeAbleToRegisterSuccessfully() {


        //click on regsiter button
        homePage.clickOnRegisterButton();
//        fill in registration details
        registerPage.enterRegistrationDetails();
//        verify user registered successfully
        registerResultPage.verifyUserRegisteredSuccessfully();
    }

    @Test
    public void verifyUserShouldBeAbleToVote() {

        votePage.VerifyUserShouldAbleToVote();


        //    voteResultPage.VerifyUserShouldAbleToVote();
    }

    @Test
    public void verifyUserShouldBeAbleToEmail() {

        emailPage.clickOnElement(By.linkText("Apple MacBook Pro 13-inch"));

        emailPageResult.clickOnElement(By.className("email-a-friend"));

    }


    @Test
    public void verifyUserBeAbleToCompareProduct() {

        compareProduct.verifyUserBeAbleToCompareProduct();


    }

    @Test
    public void verifyUserBeAbleToAddElectronicsItems() {


        // ElectronicItemResult
        ElectronicItem.clickOnElement(By.linkText("Shopping cart"));

    }

    @Test
    public void verifyUserShouldRefferTotheFriend() {

        //click on regsiter button
        homePage.clickOnRegisterButton();
//        fill in registration details
        registerPage.enterRegistrationDetails();
       // loginPage.enterTheLoginDetails();

       RefferAFriend.clickOnElement(By.className("ico-login"));
        // emailPage.VerifyUserShouldAbleToEmail();
        RefferAFriend.clickOnElement(By.id("Email"));

    }

    @Test
    public void verifyUserShouldBeAbleToVoteNumber() {

        VoteNumberPage.clickOnElement(By.id("vote-poll-1"));




    }
}
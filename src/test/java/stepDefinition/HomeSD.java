package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import runnerTest.webPages.HomePage;

public class HomeSD {


    private final HomePage homePage=new HomePage();

    @Given("^I am on darksky home page$")
    public void verifyHomePage(){
        Assert.assertEquals(homePage.getHomePageTitle(), "Dark Sky - 1 City Hall, New York, NY");
    }

    @When("^I click on day section on the home page$")
    public void clickTodaySection(){

        homePage.clickToday();
    }
    @Then("^I  verify the lowest and highest tem on home page$")
    public void verifyHighLowTemp(){
        Assert.assertTrue(homePage.getHighLowTem(), Boolean.parseBoolean("true"));
    }

}



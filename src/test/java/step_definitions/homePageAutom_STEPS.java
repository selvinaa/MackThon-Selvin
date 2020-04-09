package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePageAutom;
import step_definitions.step_impl.HomePageAutom_impl;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class homePageAutom_STEPS {

    private static WebDriver driver = Driver.getDriver();
    HomePageAutom homePageAutom = new HomePageAutom();
    HomePageAutom_impl homePageAutom_impl = new HomePageAutom_impl();


    @Given("User opens homepage")
    public void user_opens_homepage() throws InterruptedException {
//        driver.get(ConfigReader.readProperty("url"));
        Driver.getDriver().get(ConfigReader.readProperty("url"));
        homePageAutom_impl.getInfoHome();


    }

    @Given("Verifies title is \\{string}")
    public void verifies_title_is() {
        String expected = "My Store";
        Assert.assertEquals(driver.getTitle(), expected );
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
    }








}


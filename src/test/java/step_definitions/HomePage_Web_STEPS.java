package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.HomePage_Web;
import step_definitions.step_impl.HomePage_impl;
import util.ConfigReader;
import util.Driver;

public class HomePage_Web_STEPS {
    private static WebDriver driver = Driver.getDriver();
    //HomePage homePage = new HomePage();
    HomePage_impl homePage_impl = new HomePage_impl();
    HomePage_Web homePage_web = new HomePage_Web();


    @Given("User opens Apache Pag")
    public void user_opens_Apache_Pag() {
        homePage_web.apache_btn.click();
        Assert.assertEquals(driver.getTitle(), "Apache Tutorials for Beginners");
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }


}

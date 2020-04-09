package step_definitions.step_impl;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.HomePage_Web;
import util.Driver;
import util.SeleniumUtils;

import java.awt.*;

public class HomePage_Web_impl {

    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();


    public static void openApachePage(){
        HomePage_Web homePage_web = new HomePage_Web();

        SeleniumUtils.click(homePage_web.apache_btn);
        Actions action = new Actions(driver);
        action.moveToElement(homePage_web.searchField).perform();
        SeleniumUtils.sendKeys(homePage_web.searchField, "Jmeter");


    }


}

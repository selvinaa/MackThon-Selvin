package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Driver;

public class HomePageAutom {

    private static WebDriver driver = Driver.getDriver();


    public void homePageAutomation(){
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "search_query_top")
    public WebElement searchField;




}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class HomePage_Web {
    private static WebDriver driver = Driver.getDriver();
    public HomePage_Web(){

        PageFactory.initElements(driver, this);
    }

   // @FindBy(xpath = "(//span[@class='g-separator g-menu-item-content']//span[@class='g-menu-item-title'])[3]")
   // public WebElement web_btn;

    @FindBy(xpath = "(//a[@title='Apache'])[2]")
    public WebElement apache_btn;



}

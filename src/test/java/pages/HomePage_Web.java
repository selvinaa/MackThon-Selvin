package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
//EXTENDING HOME PAGE TO GET ACCESS OF IT
public class HomePage_Web{

    private static WebDriver driver = Driver.getDriver();

    HomePage homePage = new HomePage();

    public HomePage_Web(){

        PageFactory.initElements(driver, this);
    }

   // @FindBy(xpath = "(//span[@class='g-separator g-menu-item-content']//span[@class='g-menu-item-title'])[3]")
   // public WebElement web_btn;

    @FindBy(xpath = "(//a[@title='Apache'])[2]")
    public WebElement apache_btn;

    @FindBy(xpath = "//button[@class='gsc-search-button gsc-search-button-v2'][1]")
    public WebElement searchField;



}

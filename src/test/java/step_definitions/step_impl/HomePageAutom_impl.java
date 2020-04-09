package step_definitions.step_impl;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePageAutom;
import util.Driver;
import util.SeleniumUtils;

public class HomePageAutom_impl {
    private static WebDriver driver = Driver.getDriver();
    HomePageAutom homePageAutom = new HomePageAutom();


    public void getInfoHome() {
       // HomePageAutom homePageAutom = new HomePageAutom();
//        Actions action = new Actions(driver);
//        JavascriptExecutor js =  ((JavascriptExecutor)driver);
        //js.executeScript("scroll(0,500);");
//        WebElement best = driver.findElement(By.className("//a[@class='blockbestsellers']"));
//       action.moveToElement(best).perform();
        SeleniumUtils.click(homePageAutom.searchField);
       // System.out.println(homePageAutom.bestSellerButton.getText());



    }


}

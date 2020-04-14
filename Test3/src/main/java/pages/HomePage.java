package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver webDriver;

        public HomePage(WebDriver driver) throws Exception {
        this.webDriver = driver;
        PageFactory.initElements(this.webDriver, this);
        Thread.sleep(2000);
    }
}
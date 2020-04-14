import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;

import static utils.TestBase.initiateTest;
import static utils.TestBase.webDriver;

public class FirstTest {
    private HomePage homePage;
   

    @BeforeClass
    public void initialize() {
        initiateTest();
    }

    @Test (priority =0)
    public void searchForWristWatches() throws Exception {
        homePage = new HomePage(webDriver);
        
        WebElement firstName = homePage.findElement(By.id("firstName"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement lastName = homePage.findElement(By.name("lastName"));				

        WebElement username = homePage.findElement(By.id("username"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement address = homePage.findElement(By.name("address"));							
        WebElement Zip = homePage.findElement(By.id("zip"));							

              
        
        
        firstName.sendKeys("User");					
        lastName.sendKeys("lastuser");
        username.sendKeys("abcd@gmail.com");					
        address.sendKeys("Town house ");
        Zip.sendKeys(110098);					
        		
        
        homePage.Continue_to_checkout.click();
        
        
        Thread.sleep(3000);
    }

   
}
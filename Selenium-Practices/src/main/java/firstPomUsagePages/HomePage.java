package firstPomUsagePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    /**
     * *
     * we want to click the form authentication
     * that will redirect to authentication page
     *
     */
private By formLink = By.linkText("Form Authentication");
// creating method to click this link
    // we do not have a real driver to hit the link
    //the method call me will give me a driver
   // WebDriver driver;
    public LoginPage clickForm(WebDriver driver){
        driver.findElement(formLink).click();
        //the action click will lead us to another page so we should follow the pom and return  object from the new page

    return new LoginPage(driver);}


}

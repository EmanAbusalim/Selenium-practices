package firstPomUsagePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    /**
     * this page is designed for :
     * -----insert the uer name tomsmith
     * ---insert the password SuperSecretPassword!
     * ---click login button
     */
    //we should create costructor so not passing the webdriver to every method but to the object itself
    WebDriver driver;
    LoginPage(WebDriver driver){
        this.driver= driver;

    }
    private By username= By.cssSelector("input#username");
    private By password= By.cssSelector("input#password");
    private By login= By.cssSelector("button.radius");
    public void insertUsername(WebDriver driver){
        driver.findElement(username).sendKeys("tomsmith");}
    public void insertPassword(){
        driver.findElement(password).sendKeys("SuperSecretPassword!");}
    public SecureAreaPage login(){
        driver.findElement(login).click();
         return new SecureAreaPage();}
}

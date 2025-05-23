package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FirstLessons {
    private WebDriver driver;
    
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(768,1024));
    }
    public void linkText(){
        driver.findElement(By.linkText("Checkboxes")).click();
        // this is to get the all links inthe page you are
     // List<WebElement> links=  driver.findElements(By.tagName("a"));
    //    System.out.println(links.size());

    }
    public static void main (String args[]){
        FirstLessons f= new FirstLessons();
         f.setup();
         f.linkText();
    }

}

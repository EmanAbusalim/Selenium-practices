package firstPackage.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment1 {
    WebDriver driver;

    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().fullscreen();
    }

    public void hitShiftingContent() {
        setup();
        driver.findElement(By.xpath("//a[text()='Shifting Content']")).click();
    }

    public void hitMenuElement() {
        driver.findElement(By.linkText("Example 1: Menu Element")).click();

    }
    public void getNumberOfElements(){
      List<WebElement> bar= driver.findElements(By.cssSelector("li a"));
        System.out.println(bar.size());
    }
    public static void main (String args[]){
        Assignment1 obj=new Assignment1();
       // obj.setup();
        obj.hitShiftingContent();
        obj.hitMenuElement();
        obj.getNumberOfElements();
    }

}
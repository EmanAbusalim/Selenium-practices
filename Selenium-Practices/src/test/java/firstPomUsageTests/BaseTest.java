package firstPomUsageTests;

import firstPomUsagePages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public HomePage setup(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        return new HomePage();
        //Homepage homepage= new Homepage();
        // is there a different between the two statements

    }



    }

}

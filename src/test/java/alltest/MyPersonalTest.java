package alltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalTest {
    WebDriver driver;

    
    @Test
    public void verifyJenkins(){
        System.out.println("Maa Jenkins Testing");
        System.out.println("Second changes");
    }
}

package org.example.nexttime;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Predicate;

public class tuesday {
    WebDriver driver;


    textbox txt; waits wt; section se; buttons bt; iframe ifr;

    @BeforeClass
 public void reason(){
     WebDriverManager.firefoxdriver().setup();
     driver = new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("https://www.leafground.com/waits.xhtml");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
 }

 @Test(priority = 1,enabled = false)
    public void newcode(){
        txt = new textbox(driver);
        txt.textboxes("news","fellow","membership");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

 }

 @Test(priority = 2)
    public void semiimp(){
        wt= new waits(driver);
        wt.waiter();

 }

 @Test(priority = 3)
    public void section(){
        se= new section(driver);
        se.Action_Dropdown();
    }

    @Test(priority = 4)
    public void button(){
        bt =new buttons(driver);
        bt.button();
        se = new section(driver);
        se.browser();
    }

 @Test(priority = 5)
 public void browser(){
      ifr = new iframe(driver);
      ifr.iframes();
      ifr.count_fram();
 }

}

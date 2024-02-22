package org.example.dashboard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class leafboard {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/dashboard.xhtml");
    }

    @Test(priority = 1)
    public void first_time(){
        System.out.println("Leafground");
        driver.close();
    }
}

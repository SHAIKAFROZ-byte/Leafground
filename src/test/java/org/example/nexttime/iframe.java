package org.example.nexttime;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.List;

public class iframe {
    WebDriver driver;
    public iframe(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//iframe[@src='default.xhtml']") private WebElement iframe_Click;
    @FindBy(xpath = "//button[@id='Click']") private  WebElement button;
    @FindBy(tagName = "iframe") private List<WebElement> count_frame;
    @FindBy(xpath = "//iframe[@id='frame2']") WebElement nestedframe;

    @FindBy(xpath = "(//iframe)[3]") private WebElement outerframe3;

    @FindBy(xpath = "(//iframe)[2]") private  WebElement outerframe2;

    @FindBy(xpath = "//button[contains(text() ,'Count Frames' )]") private  WebElement countframe;

    @FindBy(xpath = "//iframe[@id='frame2']") private  WebElement page;
    @FindBy(xpath = "//button[@id ='Click']") private WebElement btn;

    public void iframes() {
        driver.switchTo().frame(iframe_Click);
        button.click();
        System.out.println(button.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(outerframe2);
        System.out.println(countframe.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(outerframe3);
        int innerframe = count_frame.size();
        driver.switchTo().frame(page);

        System.out.println(btn.getText());
        driver.switchTo().defaultContent();
        int outerframes = count_frame.size();
        System.out.println("sum of frames: " + (innerframe + outerframes));
    }
      }









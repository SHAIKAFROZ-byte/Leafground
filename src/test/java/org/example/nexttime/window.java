package org.example.nexttime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class window {
    WebDriver driver;
    public  window(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@id='menuform:m_window']") private WebElement windowbutton;

    @FindBy(xpath = "//li[@id='menuform:j_idt38']") private WebElement browser;

    @FindBy(xpath = "//button[@id='j_idt88:new']") private  WebElement firstframe;

    public section windows(){
        Actions act= new Actions(driver);
        act.moveToElement(browser).click().perform();
        act.moveToElement(windowbutton).click().perform();
        return new section(driver);
    }

    public  section windowframe(){
        String parentwindow = driver.getWindowHandle();
        firstframe.click();
        System.out.println(driver.getWindowHandle());
        driver.switchTo().window(parentwindow);
        return new section(driver);

    }

}

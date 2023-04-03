package org.example.nexttime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.security.PublicKey;
import java.time.Duration;

public class section {

    WebDriver driver;
    public section(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//li[@id='menuform:j_idt38']") private WebElement Element;
    @FindBy(xpath = "//li[@id='menuform:m_button']") private  WebElement button;
    @FindBy(xpath = "//li[@id='menuform:j_idt38']") private WebElement browser;
    @FindBy(xpath = "//li[@id='menuform:m_frame']") private  WebElement frame;


    public section Action_Dropdown() {
        Actions act = new Actions(driver);
        act.moveToElement(Element).click().perform();
        button.click();
        return this;


    }
//   public section browser(){
//       Actions act = new Actions(driver);
//       act.moveToElement(browser).click().perform();
//       frame.click();
//       return this;
//    }

}

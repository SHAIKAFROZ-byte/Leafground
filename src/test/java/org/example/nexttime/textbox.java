package org.example.nexttime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class textbox {
    WebDriver driver;

   public textbox(WebDriver driver){

       PageFactory.initElements(driver,this);

   }

   @FindBy(xpath = "//input[@id='j_idt88:name']") public WebElement firstbox;
    @FindBy (xpath = "//input[@id='j_idt88:j_idt91']") public WebElement secondbox;
    @FindBy(xpath = "//input[@id='j_idt88:j_idt93']") public WebElement disabledbox;
    @FindBy(xpath="//input[@id='j_idt88:j_idt97']") public WebElement retrivetext;
    @FindBy(xpath = "//input[@id='j_idt88:j_idt95']") public WebElement cleartxt;



    public textbox textboxes(String input1, String input2, String input3){
        firstbox.sendKeys(input1);
        secondbox.sendKeys(input2 );
        disabledbox.isEnabled();
        String ele = retrivetext.getText();
        System.out.println(ele);
        cleartxt.clear();
        return this;


    }
}

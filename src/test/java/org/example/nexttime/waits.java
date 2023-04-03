package org.example.nexttime;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waits {
    WebDriver driver;

    public waits(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//button[@id='j_idt87:j_idt89']")
    private WebElement first_wait1;

    @FindBy(xpath = "//button[@id='j_idt87:j_idt90']")
    private WebElement first_wait2;
    @FindBy(xpath = "//button[@id='j_idt87:j_idt92']")
    private WebElement second_wait1;


    @FindBy(xpath = "//button[@id='j_idt87:j_idt93']")
    private WebElement second_wait2;

    @FindBy(xpath = "//button[@id='j_idt87:j_idt95']")
    private WebElement Third_wait1;

    @FindBy(xpath = "//button[@id='j_idt87:j_idt96']")
    private WebElement Third_wait2;

    @FindBy(xpath = "//button[@id='j_idt87:j_idt98']")
    private WebElement fourth_wait1;

    @FindBy(xpath = "//button[@id='j_idt87:j_idt99']")
    private WebElement fourth_wait2;

    public waits element_to_click() {
        //visiblity of Element

        first_wait1.click();
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(first_wait2));
        first_wait2.click();
        return  this;
    }

    public waits Element_visiblity() {
        //invisibilty of Element
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        second_wait1.click();
        wait.until(ExpectedConditions.invisibilityOf(second_wait2));
        return this;
    }

    public waits Element_Clickbilitu(){
    Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //element to be clickable
    Third_wait1.click();
    wait.until(ExpectedConditions.elementToBeClickable(Third_wait2));
    return  this;
}


    public waits text_Present() {
        //change of text
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        fourth_wait1.click();
        wait.until(ExpectedConditions.textToBePresentInElement(fourth_wait2, "Did you notice?"));
        return this;

    }

}
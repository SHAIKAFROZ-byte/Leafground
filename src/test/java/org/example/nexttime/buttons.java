package org.example.nexttime;

import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

public class buttons {
    WebDriver driver;
    Wait wt;

    public buttons(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath= "//button[@id='j_idt88:j_idt90']") private WebElement clicker;
    @FindBy(xpath = "//button[@id='j_idt88:j_idt92']") private WebElement disbled_button;
    @FindBy(xpath = "//button[@id='j_idt88:j_idt94']") private WebElement submit_position;

    @FindBy(xpath = "//button[@id='j_idt88:j_idt96']") private  WebElement color;

    @FindBy(xpath = "//button[@id='j_idt88:j_idt98']" ) private WebElement btn_ht_wt;

    @FindBy(xpath = "//button[@id='j_idt88:j_idt100']") private  WebElement wecolor;
    @FindBy(xpath = "//button[@id='j_idt88:j_idt102:imageBtn']") private  WebElement image;

    @FindBy(xpath= "//img[@id='j_idt88:j_idt102:j_idt104']") private  WebElement banner;

    @FindBy(xpath = "//li[@id='menuform:j_idt38']") private WebElement browser;

    @FindBy(xpath = "//li[@id='menuform:j_idt38']") private WebElement MenuElement;

    @FindBy(xpath = "//h5[contains(text(),'How many rounded buttons are there?')]/following-sibling::button") private List<WebElement> btns;

    public  buttons button() {
        Wait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
        wt.until(ExpectedConditions.visibilityOf(clicker));
        clicker.click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        return new buttons(driver);
    }
    public buttons btn_dimensions() {
      Wait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
        wt.until(ExpectedConditions.visibilityOf(disbled_button));
        disbled_button.isEnabled();
        System.out.println(submit_position.getRect().getX());
        System.out.println(submit_position.getRect().getY());
        String in = color.getCssValue("color");


        System.out.println(in);
        System.out.println(btn_ht_wt.getRect().getHeight());
        System.out.println(btn_ht_wt.getRect().getWidth());
         return  this;
    }

    public buttons btns_color() {

        Actions act = new Actions(driver);
        act.moveToElement(wecolor).perform();
        System.out.println(wecolor.getCssValue("background-color"));
        System.out.println(wecolor.getCssValue("color"));
        image.click();
        return  this;

    }

    public buttons btns_Count(){
        Wait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
        Actions act = new Actions(driver);
        wt.until(ExpectedConditions.visibilityOf(banner));
        act.click();
        System.out.println(btns.size());
        for(WebElement we : btns){
            System.out.println(we.getText());
        }
        return new buttons(driver);
    }

    public section section(){
       Actions act = new Actions(driver);
       act.moveToElement(MenuElement).click().perform();
       act.moveToElement(browser).click().perform();
        return new section(driver);
    }

}

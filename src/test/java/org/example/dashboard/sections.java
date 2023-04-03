package org.example.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sections {

    WebDriver driver;
    public sections(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, sections.class);
    }
   @FindBy(id="menuform:j_idt40") private WebElement section;
    @FindBy(id="menuform:m_button") private WebElement button_Section;

    public button button(){
        Actions act = new Actions(driver);
        act.moveToElement(section).click().perform();
        act.moveToElement(button_Section).click().perform();
        return  new button(driver);

    }



}

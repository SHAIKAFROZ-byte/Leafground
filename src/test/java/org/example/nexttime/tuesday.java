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


    textbox txt; waits wt;  buttons bt; iframe ifr; window w;
    section se;

    @BeforeClass
 public void setup(){
     WebDriverManager.firefoxdriver().setup();
     driver = new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("https://www.leafground.com/waits.xhtml");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
 }


 @Test(description = "First", priority = 1)
 public void checkingMenu(){
     se= new section(driver);
     se.Action_Dropdown();
     bt = new buttons(driver);
     bt.button().btn_dimensions().btns_color().btns_color().section();
 }

 @Test(priority = 1,enabled = false)
    public void newcode(){
        txt = new textbox(driver);
        txt.textboxes("news","fellow","membership");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

 }

 @Test(priority = 2,enabled = false)
    public void semiimp(){
        wt= new waits(driver);
        wt.element_to_click().Element_visiblity().element_to_click().text_Present();

 }

 @Test(priority = 3,enabled = false)
    public void section(){
        se= new section(driver);
        se.Action_Dropdown();
    }

    @Test(priority = 4, enabled = false)
    public void button(){
        bt =new buttons(driver);
        bt.button();
//        bt.disab();
       //se = new section(driver);
       // se.browser();
    }

 @Test(description = "what is this",priority = 5, enabled = false)
 public void browser(){
      w=new window(driver);
      w.windows();
      w.windowframe();

 }

}

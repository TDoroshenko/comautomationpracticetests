package com.automationpractice.mainpagetest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class MainPageTest {

    private final String URL = "http://automationpractice.com";
   private WebDriver driver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEDRIVER"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @Test
    public void testCanSelectTShirtWithSizeL(){
//        driver.findElements(By.xpath("//a[@title='T-shirts']")).forEach(elment -> elment.click());

        List<WebElement> elements = driver.findElements(By.xpath("//a[@title='T-shirts']"));

        for (int i = 0; i < elements.size(); i++){
            System.out.println("Element number" + i+1);
            elements.get(i).click();
        }

    }



}

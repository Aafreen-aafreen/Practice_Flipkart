package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Base {

        private WebDriver driver1;

        public Base(WebDriver driver)
        {

            this.driver1 = driver;

        }


        public void click_action(By locator) throws InterruptedException {

            driver1.findElement(locator).click();
            Thread.sleep(5000);
        }
        public void sendKeys_action(By locator,String text)
        {
            driver1.findElement(locator).sendKeys(text);
        }

        public String getTitle()
        {
            System.out.println("in fun"+this.driver1);
            String s= driver1.getTitle();

            return s;
        }

        public boolean is_displayed(By locator)
        {

            return driver1.findElement(locator).isDisplayed();
        }

        public boolean is_enabled(By locator)
        {

            return driver1.findElement(locator).isEnabled();
        }
        public List<WebElement> get_list_webelements(By locator)
        {
            List<WebElement> web_ele = driver1.findElements(locator);
            return web_ele;
        }


        public void scroll_operation(String s )
        {
            JavascriptExecutor js = (JavascriptExecutor) driver1;
            js.executeScript("window.scrollBy(0,'"+ s +"')");
        }

        public String get_text(By locator)
        {
            return driver1.findElement(locator).getText();
        }

        public void assert_ignorecase(String s1,String s2)
        {

            assert s1.equalsIgnoreCase(s2);
        }
        public void Mouse_hover(By locator)
      {
          WebElement ele = driver1.findElement(locator);
          Actions actions = new Actions(driver1);
          actions.moveToElement(ele).perform();
       }
        public void selectBydropdown(WebElement locator, String value){
        Select s=new Select(locator);
        s.selectByVisibleText(value);
    }
    public void refresh() {
        driver1.navigate().refresh();
    }

    public void Switch_window() throws InterruptedException {
        String parent=driver1.getWindowHandle();
        Set<String> s=driver1.getWindowHandles();
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
        String child_window=I1.next();
        if(!parent.equals(child_window))
            {
                driver1.switchTo().window(child_window);
                System.out.println(driver1.switchTo().window(child_window).getTitle());
                Thread.sleep(3000);

            }
    }
    }}



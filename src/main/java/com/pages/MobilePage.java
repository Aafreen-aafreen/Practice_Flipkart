package com.pages;

import com.pages.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePage extends Base {
    private WebDriver driver;

    // 1. By Locators: OR
    public By Mobile = By.xpath("//*[text()='Mobiles']/parent::a");
    public By Electronics = By.xpath("//*[text()='Electronics']");


    // 2. Constructor of the page class:
    public MobilePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void Click_mobile_button() throws InterruptedException {
        driver.findElement(Mobile).click();
        Thread.sleep(3000);
    }
    public void Click_Electronics_button() throws InterruptedException {
        Mouse_hover(Electronics);
        Thread.sleep(3000);
    }

    }


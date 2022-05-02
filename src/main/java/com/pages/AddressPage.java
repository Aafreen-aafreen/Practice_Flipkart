package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage extends Base {
    private WebDriver driver;

    public AddressPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public By NAME = By.xpath("//*[@class='exehdJ']");
    public By MYPROFILE = By.xpath("(//*[@class='_2kxeIr'])[1]");
    public By SEARCHBAR = By.xpath("//*[@title='Search for products, brands and more']");
    public By MANAGEADDRESS = By.xpath("//*[text()='Manage Addresses']");
    public By ADDADDRESS = By.xpath("//*[text()='ADD ADDRESSES']");
    public By ADDRESSNAME = By.xpath("//*[@name='name']");
    public By PHONENUMBER = By.xpath("//*[@name='phone']");
    public By PINCODE = By.xpath("//*[@name='pincode']");
    public By LOCALITY = By.xpath("//*[@name='addressLine2']");
    public By ADDRESS = By.xpath("//*[@name='addressLine1']");
    public By SAVEBUTTON = By.xpath("//*[text()='Save']");
    public By ADDRESSLOCATOR = By.xpath("//*[text()='Test New User']");



}
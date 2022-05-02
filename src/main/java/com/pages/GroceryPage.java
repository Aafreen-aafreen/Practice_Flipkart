package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroceryPage extends Base{
    private WebDriver driver;
    public GroceryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public By GROCERY = By.xpath("//*[text()='Grocery']");
    public By SERACH_GROCERY_TEXT = By.xpath("//input[@title='Search grocery products']");
    public By SEARCH_GROCERY_BUTTON = By.xpath("//input[@title='Search grocery products']/parent::div//following-sibling::button");
    public By Add_Product_Milk = By.xpath("//*[text()='Add Item']");
    public By Go_To_Cart = By.xpath("//*[text()='Cart']");
    public By Add_Toor_Daal = By.xpath("//*[text()='Toor Dal']");
    public By Staples = By.xpath("//*[text()='Staples']");
    public By Add_gujrati_daal = By.xpath("(//*[text()='Origo Fresh Gujarat Toor Dal (Split)'])[1]");
    public By Dairy = By.xpath("//*[text()='Dairy & Eggs']");
    public By Cheese = By.xpath("//*[text()='Cheese']");
    public By Add_amul_cheese = By.xpath("//*[text()='Amul Processed cheese Cubes']");
    public By Add_to_basket = By.xpath("//*[text()='ADD TO BASKET']");
    public By Snacks = By.xpath("//*[text()='Snacks & Beverages']");
    public By Cookies = By.xpath("//*[text()='Cookies']");
    public By Unibic = By.xpath ("//*[text()='UNIBIC Assorted Cookies']");
    public By Go_to_basket = By.xpath("//*[text()='GO TO BASKET']");
    public By TATA_FILTER = By.xpath("//div[text()='Tata']//preceding-sibling::div");
    public By BESAN = By.xpath("//a[text()='Tata BESAN 1 KG']");

}

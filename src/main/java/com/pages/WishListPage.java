package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends Base {
    private WebDriver driver;

    public WishListPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public By TOPOFFER = By.xpath("//*[text()='Top Offers']");
    public By KURTA = By.xpath("(//*[@class='_396cs4 _3exPp9'])[1]");
    public By ADDTOWISH = By.xpath("(//*[@class='eX72wL'])[1]");
    public By MYWISHLIST = By.xpath("(//*[text()='Wishlist'])");
    public By MYWISHLISTNUMBER = By.xpath("//*[text()='My Wishlist (1)']");

}
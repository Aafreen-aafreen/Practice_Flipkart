package com.pages;

import com.aventstack.extentreports.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {

	private WebDriver driver;

	// 1. By Locators: OR
	public By emailId = By.xpath("//*[text()='Enter Email/Mobile number']/parent::label/preceding-sibling::input");
	public By password = By.xpath("//*[@type='password']");
	public By signInButton = By.xpath("(//*[@type='submit'])[2]");
	public By loggenin_user = By.xpath("//*[@class='exehdJ' and text()='Test']");
	public By Image1 = By.xpath("//*[@id='container']/div/div[3]/div[3]/div/a/div/div/img[1]");


	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}



	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

	public void doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();

	}

	public void validate_img() throws InterruptedException {
		int width=driver.findElement(Image1).getSize().getWidth();
		int hight=driver.findElement(Image1).getSize().getHeight();
		WebElement ele =driver.findElement(Image1);
		System.out.println(width +">>>"+hight);
		System.out.println(width);
		System.out.println(hight);
		Thread.sleep(3000);
		assert_ignorecase(String.valueOf(width),"1424");
		assert_ignorecase(String.valueOf(hight),"123");
		String naturalWidth = ele.getAttribute("naturalWidth");
		String naturalHeight = ele.getAttribute("naturalHeight");
		System.out.println(naturalWidth);
		System.out.println(naturalHeight);


	}

}

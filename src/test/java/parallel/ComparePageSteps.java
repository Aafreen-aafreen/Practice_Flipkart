package parallel;

import com.pages.GroceryPage;
import com.pages.LoginPage;
import com.pages.MobilePage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class ComparePageSteps {
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private GroceryPage groceryPage = new GroceryPage(DriverFactory.getDriver());
    private MobilePage mobilePage = new MobilePage(DriverFactory.getDriver());


    @Given("i click on Mobile button")
    public void i_click_on_mobile_button() throws InterruptedException {
        mobilePage.Click_mobile_button();
    }

    @Given("i click on Electronics button")
    public void iClickOnElectronicsButton() throws InterruptedException {
        mobilePage.Click_Electronics_button();
        mobilePage.click_action(By.xpath("//*[text()='Mi']"));
    }

    @Then("add {int} mobiles to compare")
    public void addMobilesToCompare(int arg0) throws InterruptedException {
        mobilePage.click_action(By.xpath(("(//*[text() ='Redmi 9A Sport (Metallic Blue, 32 GB)'])[1]/parent::div/parent::div/preceding-sibling::div//div//label//div")));
        Thread.sleep(3000);
        mobilePage.click_action(By.xpath(("(//*[text() ='Redmi 9A Sport (Carbon Black, 32 GB)'])[1]/parent::div/parent::div/preceding-sibling::div//div//label//div")));
        Thread.sleep(3000);
        mobilePage.click_action(By.xpath("//*[text()='COMPARE']/ancestor::a"));
        Thread.sleep(3000);
        mobilePage.is_displayed(By.xpath("//a[text()='Redmi 9A Sport (Metallic Blue, 32 GB)']"));
        mobilePage.is_displayed(By.xpath("//a[text()='Redmi 9A Sport (Carbon Black, 32 GB)']"));
        Thread.sleep(3000);

    }
}

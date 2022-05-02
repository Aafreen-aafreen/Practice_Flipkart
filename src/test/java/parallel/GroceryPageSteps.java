package parallel;

import com.pages.GroceryPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GroceryPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private GroceryPage groceryPage = new GroceryPage(DriverFactory.getDriver());


    @Given("user clicks on grocery button")
    public void userClicksOnGroceryButton() throws InterruptedException {
        groceryPage.click_action(groceryPage.GROCERY);
    }

    @Given("user clicks on Staples button")
    public void userClicksOnStaplesButton() throws InterruptedException {
        groceryPage.click_action(groceryPage.Staples);
    }

    @Given("user clicks on Dal&pulses button")
    public void userClicksOnDalPulsesButton() throws InterruptedException {
        groceryPage.click_action(groceryPage.Add_Toor_Daal);
    }

    @Given("user clciks on Toordal button")
    public void userClciksOnToordalButton() throws InterruptedException {
        groceryPage.scroll_operation("750");
        Thread.sleep(5000);
        groceryPage.click_action(groceryPage.Add_gujrati_daal);
        Thread.sleep(3000);

    }

    @Given("i add dal to my cart")
    public void iAddDalToMyCart() throws InterruptedException {
        groceryPage.Switch_window();
        groceryPage.click_action(groceryPage.Go_to_basket);
        boolean b =groceryPage.is_displayed(groceryPage.Add_Toor_Daal);
        assert b;



    }

    @Then("validate dal in cart section")
    public void validateDalInCartSection() {
    }


}

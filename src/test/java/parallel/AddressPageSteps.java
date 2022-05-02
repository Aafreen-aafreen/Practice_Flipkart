package parallel;
import com.pages.AddressPage;
import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressPageSteps {

    private static String title;
    //private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private AddressPage addressPage = new AddressPage(DriverFactory.getDriver());

    @Given("user hovers on profile")
    public void userHoversOnProfile() {
        addressPage.Mouse_hover(addressPage.NAME);
    }

    @Then("user clicks on My Profile")
    public void userClicksOnMyProfile() throws InterruptedException {
        addressPage.click_action(addressPage.MYPROFILE);
        addressPage.click_action(addressPage.SEARCHBAR);
    }

    @Then("user clicks on Add Address")
    public void userClicksOnAddAddress() throws InterruptedException {
        addressPage.click_action(addressPage.MANAGEADDRESS);
        addressPage.click_action(addressPage.ADDADDRESS);

        
    }

    @Then("user types the name")
    public void userTypesTheName() {
        addressPage.sendKeys_action(addressPage.ADDRESSNAME,"Test New User");
    }

    @Then("user types the Mobile number")
    public void userTypesTheMobileNumber() {
        addressPage.sendKeys_action(addressPage.PHONENUMBER,"9066752239");
    }

    @Then("user types the Pincode")
    public void userTypesThePincode() {
        addressPage.sendKeys_action(addressPage.PINCODE,"229001");
        
    }

    @Then("user types the Locality")
    public void userTypesTheLocality() {
        addressPage.sendKeys_action(addressPage.LOCALITY,"NOOR AREA");
    }

    @Then("user types the Address")
    public void userTypesTheAddress() {
        addressPage.sendKeys_action(addressPage.ADDRESS,"OUR NEW AREA, NEAR MARKET AREA, VERY CLOSE");
    }

    @Then("user clicks on Save button")
    public void userClicksOnSaveButton() throws InterruptedException {
        addressPage.click_action(addressPage.SAVEBUTTON);
    }

    @Then("user verify the address")
    public void userVerifyTheAddress() {
        boolean b =addressPage.is_displayed(addressPage.ADDRESSLOCATOR);
        assert b;
    }
}
package parallel;
import com.pages.AddressPage;
import com.pages.WishListPage;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WishListSteps {

    private static String title;
    //private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private AddressPage addressPage = new AddressPage(DriverFactory.getDriver());
    private WishListPage wishlistPage = new WishListPage(DriverFactory.getDriver());
    

    @Given("user clicks on Top Offers")
    public void userClicksOnTopOffers() throws InterruptedException {
        wishlistPage.click_action(wishlistPage.TOPOFFER);
    }

    @Then("user click on first item")
    public void userClickOnFirstItem() throws InterruptedException {
        wishlistPage.click_action(wishlistPage.KURTA);
    }

    @Then("user add the items in wishlist")
    public void userAddTheItemsInWishlist() throws InterruptedException {
        wishlistPage.click_action(wishlistPage.ADDTOWISH);
    }

    @Then("user clicks on My WishList")
    public void userClicksOnMyWishList() throws InterruptedException {
        wishlistPage.click_action(wishlistPage.MYWISHLIST);
    }

    @Then("user verify the wishlist")
    public void userVerifyTheWishlist() {
        boolean b =wishlistPage.is_displayed(wishlistPage.MYWISHLISTNUMBER);
        assert b;
    }
}
package org.example.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.example.steps.StepHomePage;
import org.junit.Assert;

public class ShopPageDefinitions {
	 
	    @Steps
	    StepHomePage homePage;
	 
	    @Given("User is on Home page")
	    public void openApplication() {
	    	homePage.open();
	    	System.out.println("Page is opened");
	    }
	 
	    @When("User add two products to the cart")
	    public void addTwoProducts() {
	    	homePage.addTwoProductsToCart();
	    }
	 
	    @When("User views the cart")
	    public void viewProductsInCart() {
	    	homePage.viewCart();
	    }
	    
	    @When("User completes the checkout")
	    public void checkoutProducts() {
	    	homePage.checkoutStart();
	    	homePage.checkoutProcess();
	    }

	    @Then("User should be able to see the message {string}")
	    public void successfulCheckout(String expectedCheckoutMessage) {
	        String actualCheckoutMessage = homePage.checkoutMessage();
	        Assert.assertEquals(expectedCheckoutMessage, actualCheckoutMessage);
	    }
}

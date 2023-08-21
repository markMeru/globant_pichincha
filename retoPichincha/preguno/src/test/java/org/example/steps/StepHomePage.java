package org.example.steps;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import java.util.List;
import org.openqa.selenium.support.FindBy;

public class StepHomePage extends PageObject{
	
	@FindBy(css = "div[class='button-group'] span")
    List<WebElementFacade> addProductButtons;
	
	@FindBy(css = "button[data-toggle='dropdown'] span[id='cart-total']")
    WebElementFacade cartButton;
	
	@FindBy(css = "a[href='http://opencart.abstracta.us:80/index.php?route=checkout/cart'] strong")
	WebElementFacade viewCartButton;
	
	@FindBy(css = "div[class='pull-right'] a")
	WebElementFacade checkOutButton;
	
	@FindBy(css = "div[class='radio'] input[value='guest']")
	WebElementFacade guestCheckoutRadioButton;
	
	@FindBy(css = "input[value='Continue']")
	List<WebElementFacade> checkOutNextStep;
	
	@FindBy(css = "input[name='firstname']")
	WebElementFacade firstNameInput;
	
	@FindBy(css = "input[name='lastname']")
	WebElementFacade lastNameInput;
	
	@FindBy(css = "input[name='email']")
	WebElementFacade emailInput;
	
	@FindBy(css = "input[name='telephone']")
	WebElementFacade telephoneInput;
	
	@FindBy(css = "input[name='address_1']")
	WebElementFacade addressOneInput;
	
	@FindBy(css = "input[name='city']")
	WebElementFacade cityInput;
	
	@FindBy(css = "input[name='postcode']")
	WebElementFacade postcodeInput;
	
	@FindBy(css = "select[name='zone_id']")
	WebElementFacade stateSelect;
	
	@FindBy(css = "input[name='agree']")
	WebElementFacade agreementCheckbox;
	
	@FindBy(css = "input[value='Confirm Order']")
	WebElementFacade confirmButton;
	
	@FindBy(css = "div[id='common-success'] div[class='row'] div h1")
	WebElementFacade successfulCheckoutMessage;
 
    @Step("Add two Products to Cart")
    public void addTwoProductsToCart() {
    	addProductButtons.get(0).click();
    	addProductButtons.get(0).click();
    }
    
    @Step("View Cart Elements")
    public void viewCart() {
    	cartButton.click();
    	viewCartButton.click();
    }
    
    @Step("Starts the Checkout process")
    public void checkoutStart() {
    	checkOutButton.click();
    }
    
    @Step("Executes the complete Checkout process")
    public void checkoutProcess() {
    	guestCheckoutRadioButton.click();
    	checkOutNextStep.get(0).click();
    	firstNameInput.sendKeys("Mark");
    	lastNameInput.sendKeys("Alp");
    	emailInput.sendKeys("markmer@gmail.com");
    	telephoneInput.sendKeys("999777888");
    	addressOneInput.sendKeys("Avenuee");
    	cityInput.sendKeys("Lima");
    	postcodeInput.sendKeys("88");
    	stateSelect.selectByValue("Surrey");
    	checkOutNextStep.get(1).click();
    	agreementCheckbox.click();
    	checkOutNextStep.get(2).click();
    	confirmButton.click();
    }
    
    @Step("Checkout Message on unsuccessful login")
    public String checkoutMessage() {
        String actualCheckoutMessage = successfulCheckoutMessage.getText();
        return actualCheckoutMessage;
    }

}

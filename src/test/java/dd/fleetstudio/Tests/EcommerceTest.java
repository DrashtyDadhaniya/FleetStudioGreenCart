package dd.fleetstudio.Tests;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dd.fleetstudio.TestComponents.BaseTest;

public class EcommerceTest extends BaseTest {

	@Test(priority = 1, enabled = true, dataProvider = "PromoCodeProvider")
	public void GreenCartE2E(String promoCode) throws InterruptedException {

		projectsPage = ecommerce.loginApplication("Drashty", "drashty.dadhaniya@gmail.com");
		greenCartHomePage = projectsPage.clickOnProject();
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		
		greenCartHomePage.addProductsToCart(itemsNeeded);
		checkOutPage = greenCartHomePage.ProceedToCheckout();
		String promoStatus = checkOutPage.EnterPromoCode(promoCode);		//Correct promocode is - rahulshettyacademy
		
		Assert.assertTrue(promoStatus.contains("Code applied"));
		//Assert.assertFalse(promoStatus.contains("Invalid code"), "Enter 'rahulshettyacademy' as promo code");
		WebElement countryDropDown = checkOutPage.PlaceOrderAndProceed();
		SelectDropDownElement(countryDropDown, "india");
		String ThankYouMsg = checkOutPage.AgrreeTermsAndConditions();
		Assert.assertTrue(ThankYouMsg.contains("Thank you"));
	}
	
	@DataProvider
	public Object[][] PromoCodeProvider() throws IOException {

		return new Object[][] { { "rahulshettyacademy" }, { "fleetstudio" } };
	}

}

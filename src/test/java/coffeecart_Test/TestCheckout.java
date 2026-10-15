package coffeecart_Test;

import org.testng.annotations.Test;

import coffee_cart_env.Coffeecart_env;
import coffee_cart_page.CartDetails;
import coffee_cart_page.CheckoutPage;
import coffee_cart_page.ProductDetails;

public class TestCheckout extends Coffeecart_env {

	
	@Test
	public void checkboxTest() throws InterruptedException {
		 ProductDetails product = new ProductDetails(driver);
		 product.addProducts();
	     product.clickDiscount();
	     product.addProductsagain();

		 CartDetails cart = new  CartDetails(driver);
		 cart.cartClick();
		  cart.plusClick();
		  cart.minusClick();
		  cart.deleteAmericano();
		  cart.deleteEspresso();
		  cart.checkoutClick();

		 
		 CheckoutPage checkout = new CheckoutPage(driver);
		 checkout.checkbox("Aswajith", "aswajith@gmail.com");
		 checkout.proCheckbox();
		 checkout.submitBox();
	}
}
		
		
		
		
	
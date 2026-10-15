package coffeecart_Test;

import org.testng.annotations.Test;

import coffee_cart_env.Coffeecart_env;
import coffee_cart_page.CartDetails;
import coffee_cart_page.ProductDetails;



public class TestCart  extends Coffeecart_env{

	 @Test
	 public void cartTest() throws InterruptedException {

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

	 }
}



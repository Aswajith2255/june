package coffeecart_Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import coffee_cart_env.Coffeecart_env;
import coffee_cart_page.ProductDetails;

public class TestProduct extends Coffeecart_env {
	

	
	@Test
	public void productTest() throws InterruptedException {
		ProductDetails product = new ProductDetails(driver);
		product.addProducts();
		product.clickDiscount();
		product.addProductsagain();
		
		
		String expecttext = "Yes, of course!";
		String actualtext= product.discountMessage();
		System.out.println("actual :"+actualtext);
		Assert.assertEquals(actualtext, expecttext);
		
	}
}
	




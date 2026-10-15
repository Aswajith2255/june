package coffee_cart_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails {
	
	WebDriver driver;
	
	@FindBy(xpath ="//*[@id='app']/div[2]/ul/li[3]")
	WebElement Cappuccino;
	
	
	@FindBy(xpath="//*[@id='app']/div[2]/ul/li[5]")
	WebElement FlatWhite;
	
	@FindBy(xpath ="//*[@id='app']/div[2]/ul/li[1]")
	WebElement Espresso;

	@FindBy(xpath ="//*[@id='app']/div[2]/ul/li[7]")
	WebElement CafeLatte;
	
	@FindBy(xpath="//*[@id='app']/div[2]/ul/li[2]")
	WebElement EspressoMacchiato;

	@FindBy(xpath="//*[@id='app']/div[2]/ul/li[6]")
	WebElement Americano;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/button[1]")
	WebElement yesButton;
	
	
	public ProductDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addProducts() throws InterruptedException {
		Cappuccino.click();
		System.out.println("	Cappuccino");
		Thread.sleep(1000);

		FlatWhite.click();
		Thread.sleep(1000);
		System.out.println("latWhite");
		
		Espresso.click();
		Thread.sleep(1000);
		
	}	
	
	public void clickDiscount() {
		yesButton.click();
	}
	
	
	public void addProductsagain() throws InterruptedException {
		System.out.println("Cafe Latte text = " + CafeLatte.getText());

		CafeLatte.click();
		Thread.sleep(1000);
		System.out.println("CafeLatte");
		
		EspressoMacchiato.click();
		Thread.sleep(1000);
		System.out.println("EspressoMacchiato");
		
		Americano.click();
		Thread.sleep(1000);
		System.out.println("Americano");
		
		
	}
	
	public String discountMessage() {
	return  yesButton.getText();

	}
	

}	
		
		
		
	
	
	
	
	
	
	



package coffee_cart_page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class CartDetails {
	
	WebDriver driver;
//	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id='app']/ul/li[2]/a")
	WebElement cart;
	
	@FindBy(xpath ="//*[@id='app']/div[2]/div/ul/li[4]/div[2]/div/button[1]")
	WebElement Cappuccinoplus;

	@FindBy(xpath ="//*[@id='app']/div[2]/div/ul/li[4]/div[2]/div/button[2]")
	WebElement Cappuccinominus;
	
	@FindBy(xpath="//*[@id='app']/div[2]/div/ul/li[2]/div[4]/button")
	WebElement Americanodelete;
	
	@FindBy(xpath="//*[@id='app']/div[2]/div/ul/li[5]/div[4]/button")
	WebElement Espressodelete;
	
	@FindBy(xpath="//*[@id='app']/div[2]/div/div[1]/button")
	  WebElement checkoutButton;
	
	public CartDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		


	}
	
	
	public void cartClick() throws InterruptedException {
		
//        wait.until(ExpectedConditions.elementToBeClickable(cart));
        System.out.println("Cart element found");
		cart.click();
	    Thread.sleep(2000);
	    System.out.println("Cart page opened");

		}
	public void plusClick() throws InterruptedException {
		
//        wait.until(ExpectedConditions.elementToBeClickable(Cappuccinoplus));

		Cappuccinoplus.click();
		Thread.sleep(2000);
		
		Cappuccinoplus.click();
		Thread.sleep(2000);
        System.out.println("Cappuccino plus clicked");

		
	}
	
	public void minusClick() throws InterruptedException {
		
//        wait.until(ExpectedConditions.elementToBeClickable(Cappuccinominus));

		Cappuccinominus.click();
		Thread.sleep(2000);

        System.out.println("Cappuccino minus clicked");
	}
	
	public void deleteAmericano() throws InterruptedException {
		
//        wait.until(ExpectedConditions.elementToBeClickable(Americanodelete));

		
		Americanodelete.click();
		Thread.sleep(2000);

        System.out.println("Americano deleted");
	}
	
	public void deleteEspresso() throws InterruptedException {
		
//        wait.until(ExpectedConditions.elementToBeClickable(Espressodelete));

		Espressodelete.click();
		Thread.sleep(2000);
		System.out.println("Espresso deleted");
	}
	
	
	 public void checkoutClick() throws InterruptedException {
		 
//	        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));

	        checkoutButton.click();
	        Thread.sleep(2000);
	    }
		
	 
}
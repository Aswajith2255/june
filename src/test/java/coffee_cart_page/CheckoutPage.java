package coffee_cart_page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
  WebDriver driver;
//  WebDriverWait wait;
  
  @FindBy(id = "name")
  WebElement name;

  @FindBy(id = "email")
  WebElement email;

  @FindBy(id = "promotion")
  WebElement promotioncheck;
  
  @FindBy(id="submit-payment")
  WebElement submit;
  
  public CheckoutPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
//	    wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	  
}
  
   public void checkbox(String cousnm, String cousem) throws InterruptedException {
	   
//	    wait.until(ExpectedConditions.elementToBeClickable(name));
	   name.clear();
	   name.sendKeys(cousnm);
	   System.out.println("name  :"+name.getAttribute("value"));
	   Thread.sleep(1000);
	   
//	   
//	    wait.until(ExpectedConditions.elementToBeClickable(email));
	   email.clear();
	   email.sendKeys(cousem);
	   System.out.println("email  :"+email.getAttribute("value"));
	   Thread.sleep(1000);
	   
   }
   
   public void proCheckbox() throws InterruptedException {
//	    wait.until(ExpectedConditions.elementToBeClickable(promotioncheck));
	   promotioncheck.click();
	   Thread.sleep(1000);
   }
   
   public void submitBox() throws InterruptedException {
//	    wait.until(ExpectedConditions.elementToBeClickable(submit));

	   submit.click();
	   Thread.sleep(2000);
   }
}


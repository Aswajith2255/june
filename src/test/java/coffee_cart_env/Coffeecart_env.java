package coffee_cart_env;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Coffeecart_env {
	
	 public WebDriver driver;
	
	@BeforeMethod
	public void preProsssing() {
		driver = new ChromeDriver();
		driver.get("https://coffee-cart.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void postprocessing() {
		driver.close();
	}
	
}


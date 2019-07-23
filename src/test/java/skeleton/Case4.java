package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case4 {
	WebDriver c;
	int find;
	@Given("User open login page of Testme app")
	public void user_open_login_page_of_Testme_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		c=new ChromeDriver();
		c.get("http://10.232.237.143:443/TestMeApp/");
		c.manage().window().maximize();
		c.findElement(By.linkText("SignIn")).click();	
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string1, String string2) {
		c.findElement(By.name("userName")).sendKeys(string1);
		c.findElement(By.name("password")).sendKeys(string2);
		c.findElement(By.name("Login")).click();
	}

	@When("user search a particular product like headphones")
	public void user_search_a_particular_product_like_headphones() {
		WebElement search=  c.findElement(By.id("myInput"));
		Actions action=new Actions(c);
		action.sendKeys(search,"Head").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("tries to proceed to payment without add to cart")
	public void tries_to_proceed_to_payment_without_add_to_cart() {
	    find=c.findElements(By.partialLinkText("Cart")).size();
	}

	@Then("Testme app doesn't display the cart icon")
	public void testme_app_doesn_t_display_the_cart_icon() {
		if(find>0)
		{	
		Assert.assertTrue(false);}
		else
		{
		Assert.assertTrue(true);}
		
		c.close();
	}
}

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

public class Case3 {
	WebDriver c;
	@Given("user opens the login page in TestMe App")
	public void user_opens_the_login_page_in_TestMe_App() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		c=new ChromeDriver();
		c.get("http://10.232.237.143:443/TestMeApp/");
		c.manage().window().maximize();
		c.findElement(By.linkText("SignIn")).click();
		Thread.sleep(3000);
	}

	@When("User enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String string1, String string2) {
		c.findElement(By.name("userName")).sendKeys(string1);
		c.findElement(By.name("password")).sendKeys(string2);
	}

	@When("click Submit button")
	public void click_Submit_button() {
		c.findElement(By.name("Login")).click();
	}

	@When("search for product")
	public void search_for_product() {
		WebElement search=  c.findElement(By.id("myInput"));
		Actions action=new Actions(c);
		action.sendKeys(search,"Head").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    //c.findElement(By.xpath("input[@name='val']")).click();
	}

	@Then("verify Search")
	public void verify_Search() {
		String check= c.getTitle();
		Assert.assertTrue(check.contains("Search"));
		c.close();
	}
}

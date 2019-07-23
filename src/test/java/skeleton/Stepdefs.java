package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	WebDriver c;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		c=new ChromeDriver();
		c.get("http://10.232.237.143:443/TestMeApp/");
		c.manage().window().maximize();
		c.findElement(By.linkText("SignIn")).click();
		Thread.sleep(3000);
	}

	@When("user provides username as {string} and password as {string}")
	public void user_provides_username_as_and_password_as(String string1, String string2) {
		c.findElement(By.name("userName")).sendKeys(string1);
		c.findElement(By.name("password")).sendKeys(string2);
	}

	@Then("user rendered to TestMeApp home page")
	public void user_rendered_to_TestMeApp_home_page() {
		c.findElement(By.name("Login")).click();
		c.close();
	}
}

package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case1 {
	WebDriver c;
@Given("User opens TestMeApp")
public void OpenBrowser() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	c=new ChromeDriver();
	c.get("http://10.232.237.143:443/TestMeApp/");
	c.manage().window().maximize();
	Thread.sleep(3000);
	c.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
}
@When("Enters uname as {word}")
public void getUserName(String username)
{
	c.findElement(By.name("userName")).sendKeys(username);
}
@And("Enter the fn as {word}")
public void getFirstName(String fname)
{
	c.findElement(By.name("firstName")).sendKeys(fname);
}
@And("Enter the ln as {word}")
public void getLastName(String lname)
{
	c.findElement(By.name("lastName")).sendKeys(lname);
}
@And("Enter the pass as {word}")
public void getPass(String pass)
{
	c.findElement(By.name("password")).sendKeys(pass);
}

@And("Enter the cpass as {word}")
public void getCPass(String cpass)
{
	c.findElement(By.name("confirmPassword")).sendKeys(cpass);
}
@And("Select gender")
public void getGender()
{
	c.findElement(By.xpath("//input[@value='Female']")).click();
}
@And("Enter the email as {word}")
public void getEmail(String email)
{

	c.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(email);
}
@And("Enter mob as {word}")
public void getMobile(String mob)
{
	c.findElement(By.name("mobileNumber")).sendKeys(mob);
}
@And("Enter dob as {word}")
public void getDob(String date)
{
	c.findElement(By.name("dob")).sendKeys(date);
}
@And("Enter the address as {string}")
public void getAddress(String addr)
{
	c.findElement(By.name("address")).sendKeys(addr);
}
@And("Enter ans as {word}")
public void getAnswer(String ans)
{
	c.findElement(By.name("answer")).sendKeys(ans);
}
@Then("Click on Register")
public void clickReg()
{
	c.findElement(By.name("Submit")).click();
	c.close();
}
}
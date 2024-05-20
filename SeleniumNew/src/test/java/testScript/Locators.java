package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locatorId()
	{
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		WebElement showmessage=driver.findElement(By.id("button-one"));
		WebElement entermessage=driver.findElement(By.id("single-input-field"));
		WebElement yourmessage=driver.findElement(By.id("message-one"));
		WebElement entervalueA=driver.findElement(By.id("value-a"));
		WebElement entervalueB=driver.findElement(By.id("value-b"));
		WebElement gettotal=driver.findElement(By.id("button-two"));
		WebElement totalab=driver.findElement(By.id("message-two"));
		
	}
	public void className()
	{
		WebElement singlecheckbox=driver.findElement(By.className("form-check-input"));
		WebElement messageone=driver.findElement(By.className("my-2"));
		WebElement selectallbutton=driver.findElement(By.className("btn btn-primary"));
		WebElement togglericonhome=driver.findElement(By.className("navbar-toggler-icon"));
		
	}
	public void name()
	{	WebElement metadescription=driver.findElement(By.name("description"));
		WebElement metakeywords=driver.findElement(By.name("keywords"));
		WebElement metaauthor=driver.findElement(By.name("author"));
		
	}
	public void linkText()
	{
		
	}
	public void partialLinkText()
	{
		
	}

	public static void main(String[] args) {
		
 Locators locators=new Locators();
 locators.initializeBrowser();
 locators.locatorId();
 locators.className();
 locators.name();
 locators.linkText();
 locators.partialLinkText();
 locators.driverQuitandClose();
	}

}

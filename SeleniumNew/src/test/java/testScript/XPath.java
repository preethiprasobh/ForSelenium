package testScript;

import org.openqa.selenium.By;

public class XPath extends Base{
	
public void basicXpath()
{
	//xpath  //tag[@attribute='value']
	driver.findElement(By.xpath("//button[@type='button']"));
	driver.findElement(By.xpath("//input[@id='validationCustom05']"));
	driver.findElement(By.xpath("//label[@for='invalidCheck']"));
	
}
public void contains()
{
	//driver.findElement(By.xpath("//div[contains(@id,'-one')]"));
	driver.findElement(By.xpath("//div[contains(@id,'-one')]"));
	driver.findElement(By.xpath("//input[contains(@id,'Custom02')"));
	driver.findElement(By.xpath("//button[contains(@type,'sub')]')"));
	driver.findElement(By.xpath("//label[contains(@for,'Radio21')]"));
	driver.findElement(By.xpath("//select[contains(@id,'single-input')]"));
	
	
}
public void startsWith()
{
	//driver.findElement(By.xpath("//button[starts-with(text(),'Show Message')]"));
	driver.findElement(By.xpath("//div[contains(@id,'-one')]"));
	driver.findElement(By.xpath("//a[starts-with(@id,'ot')]"));
	driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
	driver.findElement(By.xpath("//div[starts-with(@id,'message-t')]"));
	driver.findElement(By.xpath("//div[starts-with(@id,'collapsible')]"));
	driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]"));
	
}
public void text()
{
	//driver.findElement(By.xpath("//tag[text()='text']"));
	
	driver.findElement(By.xpath("//button[text()='Submit form']"));
	driver.findElement(By.xpath("//label[text()='Enter Message']"));
	driver.findElement(By.xpath("//div[text()='Your Message : ']"));
	driver.findElement(By.xpath("//button[text()='Get Total']"));
	driver.findElement(By.xpath("//button[text()='Get First Selected']"));
	
	
}
public void and()
{
	// driver.findElement(By.xpath("//tag[@attribute='value' and @attribute='value']"));
	
	driver.findElement(By.xpath("//button[@type='button'and@id='button-all']"));
	driver.findElement(By.xpath("//button[@type='button'and@id='button-first']"));
	driver.findElement(By.xpath("//input[@class='form-control'and@id='single-input-field']"));
	driver.findElement(By.xpath("//div[@class='my-2'and@id='message-one']"));
	driver.findElement(By.xpath("//label[@class='form-check-label'and@for='inlineRadio2']"));
	
}
public void or()
{
	driver.findElement(By.xpath("//button[@class='navbar-toggler'or@data-target='collapsibleNavbar']"));
	driver.findElement(By.xpath("//button[@class='navbar-toggler'or@data-toggle='collapse']"));	
	driver.findElement(By.xpath("//div[@id='message-one'or@class='my-2']"));//will select two elements
	
}
public static void main(String[] args) {
		
XPath xpath=new XPath();
xpath.initializeBrowser();
xpath.basicXpath();
xpath.contains();
xpath.startsWith();
xpath.text();
xpath.and();
xpath.or();
xpath.driverQuitandClose();
	}

}

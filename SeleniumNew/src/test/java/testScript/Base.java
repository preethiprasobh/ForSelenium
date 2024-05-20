package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;//global access
	public void initializeBrowser()
	{
		driver=new ChromeDriver();//loading the chrome driver (or) browser initialization
		driver.get("https://selenium.qabible.in/");//launch the URL//wait till the whole page loads
		driver.manage().window().maximize();
		
				}
public void driverQuitandClose()//Quit-closing both parent and associated windows, close-closing only parent window
{
	//driver.close();
	driver.quit();
}

	public static void main(String[] args) {
	
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuitandClose();
	}

}

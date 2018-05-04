package programme;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlanuch
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sb computers\\Downloads\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		

	}
}
	

	

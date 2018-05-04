package programme;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sb computers\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		
		
		//System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		//InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.amazon.in");
		

	}

}

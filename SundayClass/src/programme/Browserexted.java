package programme;

import org.openqa.selenium.By;
//import org.openqa.selenium.remote.RemoteWebDriver;//

public class Browserexted extends BasePage {
	public static void main(String[]args) throws Exception
	{
		browserLaunch(getData("browser"), getData("hdfcurl"));
		//to maximize the window//
		driver.manage().window().maximize();
		
		//to get title page//
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//to remove all cookies//
		driver.manage().deleteAllCookies();
		//to refresh//
		driver. navigate().refresh();
		//to navigate back or forward//
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		//for(int i=1;i<=10;i++)
		//{
		//	((RemoteWebDriver)driver).executeScript("window.scrollBy(0,100");
		//	Thread.sleep(5000);
		//}
		
		Thread.sleep(5000);
		driver.findElement(By.id("loginsubmit")).click();
		
		driver.quit();
		
		//driver.close();//close closes only active window//
			
		
	}
	

}

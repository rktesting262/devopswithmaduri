package devopsvthmaduri;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	//public static void main(String[] args) 
	@Test
	public void method2()
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		System.out.println("chrome");
		Reporter.log("chrome");
	}

}

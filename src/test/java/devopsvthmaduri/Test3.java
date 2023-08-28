package devopsvthmaduri;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	//public static void main(String[] args) 
	@Test
	public void method3()
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		System.out.println("firefox");
		Reporter.log("firefox");

	}

}

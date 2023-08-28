package devopsvthmaduri;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	//public static void main(String[] args) 
	@Test
	public void method1()
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();//down load latest chrome driver softwate
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		
		System.out.println("edge");
		Reporter.log("edge");
		
		
		
	}

}

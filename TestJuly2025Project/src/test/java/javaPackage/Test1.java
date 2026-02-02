package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void a() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://dashboard.gotowebinar.com/contentLibrary");
		System.out.println("Hello Child Branch");
		System.out.println("Hello Shammi");
		System.out.println("Hello Github");
		System.out.println("Hello aBranch");
	}

}

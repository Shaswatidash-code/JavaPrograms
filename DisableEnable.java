package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableEnable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		//xpath for User name
		WebElement e1=	driver.findElement(By.name("username"));
		boolean b1=e1.isDisplayed();
		boolean b2=e1.isEnabled();
		if(b1==true && b2==true)
		{
			e1.sendKeys("mktiwari");
		}
		
		//xpath for Last name
		WebElement e2=	driver.findElement(By.name("lname"));
		System.out.println(e2.isDisplayed());
		System.out.println(e2.isEnabled());
		
	}

}

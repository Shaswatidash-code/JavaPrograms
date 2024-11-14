package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign82 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.xpath("//input[@name='username']"));
		e1.sendKeys("Grotech Minds");
	}

}


//Assignment 82: WAP to enter username by using the xpath locator 
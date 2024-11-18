package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign89Enable {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/grotechminds.html");
		WebElement e1 = driver.findElement(By.name("lname"));
		
		//If the checkbox is enabled or not
		if(e1.isEnabled())
		{
			System.out.println("text box is enabled");
		}
		else {
			System.out.println("test box is disabled");
		}
	}

}

//Assignment 89: WAP to check whether text box  is enabled or not

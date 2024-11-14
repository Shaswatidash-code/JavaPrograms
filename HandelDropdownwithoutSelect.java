package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelDropdownwithoutSelect {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.id("searchDropdownBox"));
		//e1.sendKeys(Keys.ARROW_DOWN);
		//e1.sendKeys(Keys.ARROW_DOWN);
		//e1.sendKeys(Keys.ARROW_DOWN);
		//e1.sendKeys(Keys.ARROW_DOWN);
		//Let's say we want to select the 4th option (index starts from 0)
		int numberofArrowDowns=3;
		for(int i = 0; i<numberofArrowDowns;i++)
		{
			e1.sendKeys(Keys.ARROW_DOWN);
		}
		
	}

}

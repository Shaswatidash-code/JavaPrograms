package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechAssign81 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		
		//Click and select Skills drop down
		WebElement e1 = driver.findElement(By.id("Skills"));
		Select s1 =  new Select(e1);
		s1.selectByVisibleText("Technical Skills");
		
		//Click and select the country
		WebElement e2 = driver.findElement(By.id("Country"));
		Select s2 =  new Select(e2);
		s2.selectByValue("Bhutan");
		
		//Click on the Religion drop down 
		WebElement e3 = driver.findElement(By.id("Relegion"));
		Select s3 =  new Select(e3);
		s3.selectByIndex(1);
		
		
		
	}

}

//Assignment 81: WAP to select the dropdowns skills,country and Religion in the Grotechminds registration page

package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechAssignAbsolutexpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		//Enter value in User name field
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("Shaswati_Grotech");
		
		//Enter value in Hint field
		WebElement e2 = driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("Job Profile");
		
		//Enter value in password field
		WebElement e3 = driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("Test@123");
		
		//Enter value in Your First name field
		WebElement e4 = driver.findElement(By.xpath("(/html/body/form)[1]/input[1]"));
		e4.sendKeys("Shaswati");
		
		//WebElement e5 = driver.findElement(By.xpath("(/html/body/form)[1]/input[3]"));
		//e5.click();
		
		//Select the check box I have a boy
		WebElement e5 = driver.findElement(By.xpath("(/html/body/form)[2]/input[1]"));
		e5.click();
		
		//Select the radio button Female
		WebElement e8 = driver.findElement(By.xpath("(/html/body/input)[5]"));
		e8.click();
		
		//Click on the check box Are you ready to relocate to bangalore? checkbox
		
		WebElement e9 = driver.findElement(By.xpath("(/html/body/input)[6]"));
		e9.click();
		
		//Click on the link Click to know about us link
		WebElement e10 =driver.findElement(By.linkText("Click to know about us"));
		e10.click();
		
		//Navigate to backward
		driver.navigate().back();
		
		//Click on religion drop down
		WebElement e11 = driver.findElement(By.id("Relegion"));
		Select s1 = new Select(e11);
		s1.selectByIndex(0);
		
		
		
	}

}

//Assignment 86: Automate JSAM Application by wring only absolute xpath

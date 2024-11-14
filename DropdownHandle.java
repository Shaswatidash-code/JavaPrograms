package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.id("searchDropdownBox"));
		//Create the object of Select class  
		Select s1 =new Select(e1);
		
		//This is how SelectByIndex will work
		//s1.selectByIndex(2);
		
		//Pass the attribute value
		//s1.selectByValue("search-alias=stripbooks");
		
		//Pass the text
		s1.selectByVisibleText("Audible Audiobooks");

	}

}

//Handle the drop down in Amazon

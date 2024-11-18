package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign90Naukri {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		//Click on Google button
		//WebElement e1 = driver.findElement(By.xpath("//button[@class='socialbtn google resman-btn-tertiary resman-btn-medium']"));
		WebElement e1 = driver.findElement(By.name("google-register"));		
		e1.click();
		Thread.sleep(2000);
		
		//see the parent and child id by using getwindowhandels()
		//System.out.println(driver.getWindowHandles());
		
		//store both the ids in id reference variable
		Set <String> id = driver.getWindowHandles();
		
		//Separating both the id from each other
		Iterator <String> i1 = id.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		
		//print both parent and child id separately
		System.out.println(parentid);
		System.out.println(childid);
		
		//move the control to the child
		driver.switchTo().window(childid);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

//Assignment 90: Launch naukri url https://www.naukri.com/registration/createAccount?othersrcp=22636,click on continue with Google,
//check whether two ids are coming and 
//move the control from parent to child

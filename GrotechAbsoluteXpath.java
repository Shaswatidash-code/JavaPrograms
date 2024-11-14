package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechAbsoluteXpath {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/grotechminds.html");
		driver.manage().window().maximize();
	WebElement e1 =	driver.findElement(By.xpath("(/html/body/input)[1] "));
	e1.sendKeys("test");
	}

}

package week2.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		//implicit wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		
		System.out.println("Confirm if the button is disabled");
		boolean enabled = driver.findElement(By.xpath("(//div[@class='card'])[2]")).isEnabled();
		if(enabled)
		{
			System.out.println("Not enabled");
		}
		else
		{System.out.println("Enabled");}
		
		
		System.out.println("Find the position of the Submit button");
		Point location = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation();
		System.out.println(location);
		
		String colour1 = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
		System.out.println(colour1);
		
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println(size);
		
		System.out.println("Mouse over and confirm the color changed");
		WebElement colorcheck = driver.findElement(By.xpath("//span[text()='Success'][1]"));
		String cssValue = colorcheck.getCssValue("color");
		System.out.println("first color  "+ cssValue);
		colorcheck.click();
		WebElement colorcheck2 = driver.findElement(By.xpath("//span[text()='Success'][1]"));
		String cssValue2 = colorcheck2.getCssValue("color");
		System.out.println("second color  "+ cssValue2);
			
		
		System.out.println("Click Image Button and Click on any hidden button");
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
		System.out.println(findElements.size());
		
		driver.close();
	}

}

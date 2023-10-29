package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		WebElement searchelement = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchelement.sendKeys("Phone");
		searchelement.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));        
        int size = allLinks.size();
        System.out.println(size);
        
//        String text = allLinks.get(2).getText();
//        System.out.println(text);
//        
        for(int i=0; i<=allLinks.size(); i++) 
        {        
        
        System.out.println(allLinks.get(i).getText());
        }
//        
//       
				

		
	}

}

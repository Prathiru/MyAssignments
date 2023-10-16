package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@class=\"inputLogin\"])[1]")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("(//input[@class=\"inputLogin\"])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();	
		
		driver.findElement(By.xpath("(//a[@class=\"x-tab-right\"])[2]")).click();
		
		//driver.findElement(By.xpath("//input[@name=\"phoneCountryCode\"]")).sendKeys("1");
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("123");
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.close();
		
		
	}

}

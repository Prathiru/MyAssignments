package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/radio.xhtml");
		//implicit wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).click();
		System.out.println("Your most favorite browser is selected");
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		System.out.println("UnSelectable is clicked");
		//To check the already/default selected value
		System.out.println("Find the default select radio button");
		String defaultRadio  = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[@checked='checked']")).getText();
		System.out.println(defaultRadio);
		
		//Check if any of the values are selected or not
		System.out.println("Select the age group (only if not selected)");
		boolean selected = driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::label[2]")).isSelected();
		
		if (!selected)
		{
			driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::label[2]")).click();
		}
		else
		{
			System.out.println("already selected");
		}
		driver.close();
	}

}

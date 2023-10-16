package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCheckboxHW {

	public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://leafground.com/checkbox.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
	driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
	String checked = driver.findElement(By.className("ui-growl-title")).getText();
	
	System.out.println("Notification" + checked);
	
	driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
	
	driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();	
	String state = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
	System.out.println(state);
	
	driver.findElement(By.className("ui-toggleswitch-slider")).click();
	
	String checked2 = driver.findElement(By.className("ui-growl-title")).getText();
	System.out.println("Toggle Switch" + checked2);
	
	String disabled = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).getText();
	System.out.println("Verify if check box is " + disabled);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
	driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();
	
	driver.close();
}
}
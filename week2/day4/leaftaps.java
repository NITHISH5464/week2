package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftaps {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("mani");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("11486")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11486");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
	    
	}
	

}

package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class learnxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
		     ChromeDriver xpath=new ChromeDriver();
		     xpath.manage().window().maximize();
		     xpath.get("http://leaftaps.com/opentaps/control/main");
		     xpath.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		     xpath.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		     xpath.findElement(By.xpath("//input[@value='Login']")).click();
		     xpath.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		     xpath.findElement(By.xpath("//a[@id='ext-gen606']")).click();
		     
		     
		     
		     
	}

}

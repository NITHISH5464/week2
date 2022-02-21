package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class grndchildtocrndparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div//input[@type='text']")).sendKeys("cbenithish25@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']/ancestor::div[@class='_6lux']")).sendKeys("5464689750");
     	driver.findElement(By.xpath("login")).click();

	}

}

package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class siblings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.xpath("//span[@class='_9nyy2']/following-sibling::input")).sendKeys("ra_one_on");
		driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("oh no oh no");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

}
}
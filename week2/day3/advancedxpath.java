package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class advancedxpath {
//relative xpath
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	    ChromeDriver xpath=new ChromeDriver();
	     xpath.manage().window().maximize();
	     xpath.get("http://leaftaps.com/opentaps/control/main");
	     xpath.findElement(By.xpath("//p[@class='top']/input[@id='username']")).sendKeys("Demosalesmanager");
	     xpath.findElement(By.xpath("//p/input[@name='PASSWORD']")).sendKeys("crmsfa");
	     xpath.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
	}
}

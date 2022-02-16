package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imgAssmnt {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver img=new ChromeDriver();
		img.manage().window().maximize();
		img.get("http://leafground.com/pages/Image.html");
		img.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		img.findElement(By.xpath("wp-categories-title"))

	}

}

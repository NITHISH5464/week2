package week2.day2;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learndropdown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver markmani=new ChromeDriver(); 
		markmani.get("http://www.leafground.com/pages/Dropdown.html");
		
        WebElement dropdown1 = markmani.findElement(By.id("dropdown1"));
        Select dd = new Select(dropdown1);
		dd.selectByIndex(0);  
	
 	   WebElement dropdown2 = markmani.findElement(By.id("dropdown2"));
 	   Select dd1=new Select(dropdown2);
 	   dd1.selectByIndex(0);
 	   
 	   WebElement dropdown3 = markmani.findElement(By.id("drapdown"));
 	   Select dd2=new Select(dropdown3);
 	   dd2.selectByIndex(0);
 	   
 			   
      
	}

}

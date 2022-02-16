package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.is.Ef;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditfieldAssmt {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver EF=new ChromeDriver();
		EF.manage().window().maximize();
		EF.get("http://leafground.com/pages/Edit.html");
		EF.findElement(By.id("email")).sendKeys("cbenithish25@gmail.com");
		//EF.findElement(By.id("//div[@class='large-6 small-12 columns']/input[@value='Append ']")).sendKeys("no comment");
		//String name = EF.findElement(By.id("TestLeaf")).getAttribute("no");
		
		EF.findElement(By.id("Clear me!!")).clear();
		
	}

}
//tagname[@attibute='attributevalue']
//input[@id='username']
//text based xpath
//tagname[text()='textt
//a[text()='leads']

//index
//(tagname[@attribute='attribute'])[1]
//(input[@@type=text])[3]
package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.doclet.Taglet.Location;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver buttons=new ChromeDriver();
     buttons.manage().window().maximize();
     buttons.get("http://www.leafground.com/pages/Button.html");
   //  buttons.findElement(By.className("wp-categories-icon svg-image")).click();
     buttons.findElement(By.id("home")).click();
     String text="TestLeaf - Selenium Playground";
     String title=buttons.getTitle();
     if(text.equals(buttons)) {
    	 System.out.println("home page is matched");
    	
    	 }else {
    		 System.out.println("home page is not matched");
    	 }
    
     buttons.findElement(By.linkText("Button")).click();
     Point location = buttons.findElement(By.id("position")).getLocation();
    int x=location.getX();
    System.out.println(x);
    int y=location.getY();
    System.out.println(y);
    		
     String cssValue = buttons.findElement(By.id("color")).getCssValue("background-color:lightgreen");
     System.out.println(cssValue);
  // buttons.findElement(By.id(cssValue))  
 //  buttons.findElement(By.id("size")).getSize("background-color:lightblue"));
     
   
     
     
	}

}

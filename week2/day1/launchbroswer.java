package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbroswer {
 public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 //driver.get("https://www.amazon.in/");//it get some page link or page
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	
	// String title=driver.getTitle();
	 
	// System.out.println(title);
	 
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.partialLinkText("Create")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MANI GANGSTAR");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ROWDY MANI");
	 driver.findElement(By.className("smallSubmit")).click();
	 String title=driver.getTitle();
	 String title2="Create Lead | opentaps CRM";
	 if(title.equals(title2)) {
		 System.out.println("title matched");
	 }else {
		 System.out.println("title not matched");
	 }
	 
	
	 
	
	 
	 

	// driver.manage().window().maximize();//it manage the maximiz,minimiz bottons
}
	
}

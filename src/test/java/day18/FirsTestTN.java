package day18;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirsTestTN {
	WebDriver driver;
  
//------------- Launch Application
   @BeforeClass
   void openApp() 
  {
  
  WebDriverManager .chromedriver().setup();
  driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  
  }
  
//--------------Login   
  @Test(priority=2)
  void login() 
 {
 
	driver.findElement(By.name("username")).sendKeys("Admin");  
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
 }
  
//--------------Close Browser   

     @AfterClass
  void closeAppp()
 {
   
	  driver.quit();
 
 }
 

}
  


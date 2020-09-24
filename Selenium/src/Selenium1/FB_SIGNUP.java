package Selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_SIGNUP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Training\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
	   WebElement createaccount = driver.findElement(By.id("u_0_2"));
	   createaccount.click();
	   

		Thread.sleep(3000);
	   
	  WebElement first = driver.findElement(By.cssSelector("input#u_1_b"));
	  first.sendKeys("vicky");
	  
	  WebElement last = driver.findElement(By.name("lastname"));
	  last.sendKeys("verma");
	  
	  WebElement mail	= driver.findElement(By.cssSelector("input#u_1_g"));
	  mail.sendKeys("rahul880@gmail.com");
	  
	  WebElement remail	= driver.findElement(By.cssSelector("input[aria-label='Re-enter email address']"));
	  remail.sendKeys("rahul880@gmail.com");
 
	  WebElement pass = driver.findElement(By.name("reg_passwd__"));
	  pass.sendKeys("rahul@8800");
	  
	  WebElement drop1 = driver.findElement(By.cssSelector("select#day"));
	  Select s = new Select(drop1);
	  s.selectByIndex(17);
	  

	  WebElement drop2 = driver.findElement(By.cssSelector("select#month"));
	  Select s2 = new Select(drop2);
	  s2.selectByVisibleText("May");
	  
	  WebElement drop3 = driver.findElement(By.cssSelector("select#year"));
	  Select s3 = new Select(drop3);
	  s3.selectByValue("1992");
	  
	  WebElement sex = driver.findElement(By.cssSelector("input[value='2']"));
	  sex.click();
	   
	   
		  WebElement submit = driver.findElement(By.name("websubmit"));
		   submit.click();
}
}
package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_LOGIN {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Training\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("rahultaak06@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("rahul@8800");
		
		WebElement submit = driver.findElement(By.name("login"));
		submit.click();

}
}

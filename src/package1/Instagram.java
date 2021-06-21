package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajini Priya\\Desktop\\rrr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        
      driver.findElement(By.id("username")).sendKeys("Raghava");
      
      Thread.sleep(5000);
      driver.findElement(By.name("pw")).sendKeys("Raghava");
      
      
	}

}

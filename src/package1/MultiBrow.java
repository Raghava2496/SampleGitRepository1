package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajini Priya\\Desktop\\rrr\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("http://demo.guru99.com/test/guru99home/");
		
		System.setProperty("webdriver.gecko.driver","D:\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.close();
        
        
     
	}

}

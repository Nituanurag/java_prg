package numpyNinjaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nituk\\Desktop\\Selenium\\SeleniumPractic\\Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.findElement(By.name("name9ccff46e")).sendKeys("NituKaran");
		//Thread.sleep(3000);
		driver.findElement(By.name("login9ccff46e")).sendKeys("nitu@redifmail.com");
		//Thread.sleep(3000);
		driver.findElement(By.name("passwd9ccff46e")).sendKeys("sunrise");
		driver.close();
		
	}

}

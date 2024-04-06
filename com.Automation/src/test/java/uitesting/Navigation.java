package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")). sendKeys ("GNRSystems India Pvt Ltd");
	driver.findElement(By.name("GNRsystem")).submit();
	driver.navigate().to("Https://www.github.com");
	driver.findElement(By.id("username")).sendKeys("Useelam");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.quit();
	}
	

	}


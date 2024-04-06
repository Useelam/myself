package framespractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
	

	public static void main(String[] args) throws Exception {
		//WebDiverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Text1");//Main document
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");//frame1
		
		Select courseName_dd = new Select (driver.findElement (By.id("course")));
		courseName_dd.selectByVisibleText("Java");
		Thread.sleep(3000);
		driver.switchTo().frame("fm2");//frame2
		
		driver.findElement(By.id("firstName")).sendKeys("Uma");
		driver.switchTo().defaultContent();//Main document
		Thread.sleep(3000);
		driver.switchTo().frame("frm1"); //frame1
		
		courseName_dd.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();//Main document
		driver.findElement (By.id("name")).clear();
		driver.findElement (By.id("name")).sendKeys ("Text2");
		}

	}



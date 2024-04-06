package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBoxes {
//WebDriver driver;
	public static void main(String[] args) throws Exception {
	ChromeDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://github.com/login");
	Thread.sleep(2000);
	WebElement usernameTxt = driver.findElement(By.id("login_field"));
	if(usernameTxt.isEnabled()) {
		usernameTxt.sendKeys("Useelam");
		String enteredText = usernameTxt.getAttribute("value");
		System.out.println(enteredText);
		Thread.sleep(2000);
		usernameTxt.clear();
	}
	else { 
		System.err.println("username textbox is not enabled");
	}
	
		System.out.println("username textbox is not displayed");

	}

}

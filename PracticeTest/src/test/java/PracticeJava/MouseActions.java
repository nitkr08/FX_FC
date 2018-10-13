package PracticeJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
	
	//Double click operation using mouse
	@Test
	public void DoubleClick(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement more_icon=driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[1]/td[2]/label"));
		Actions use_mouse=new Actions(driver);
		use_mouse.moveToElement(more_icon);
		use_mouse.doubleClick().perform();
	}
	
	

}

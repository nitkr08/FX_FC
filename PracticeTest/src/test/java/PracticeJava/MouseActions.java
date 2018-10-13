package PracticeJava;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseActions {
	
	public WebDriver driver;
	
	@BeforeTest
	public void Start_Browser(){
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	//Right click operation
	@Test
	public void RightLCick_UsingMouse() throws InterruptedException, AWTException{
		WebElement more_icon=driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[1]/td[2]/label"));
		Actions use_mouse=new Actions(driver);
		//use_mouse.moveToElement(more_icon);
		use_mouse.contextClick(more_icon).perform();
		
	}
	
	//Double click operation using mouse
	@Test(enabled=false)
	public void DoubleClick(){
		WebElement more_icon=driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[1]/td[2]/label"));
		Actions use_mouse=new Actions(driver);
		use_mouse.moveToElement(more_icon);
		use_mouse.doubleClick().perform();
	}
	
	//Handling of Alert-Accept(),Dismiss() and SendKeys()
	@Test(enabled=false)
	public void AlertHandle(){
	Alert Al=driver.switchTo().alert();
	Al.accept();
//	Al.dismiss();
//	Al.sendKeys("test");
	}
	

}

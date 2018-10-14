package PracticeJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	
	
	@Test
	public static void test() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement month_Name=driver.findElement(By.id("month"));
		Select month=new Select(month_Name);
		month.selectByVisibleText("Feb");
 		WebElement selected_month=month.getFirstSelectedOption();
		System.out.println(selected_month.getText());
		List<WebElement> All_Options=month.getOptions();
		for(WebElement web:All_Options){
			
			System.out.println(web.getText());
			
		}


}
} 
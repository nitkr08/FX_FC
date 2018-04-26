package PracticeJava;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class rough {
	
	@Test
	public static void test(){
		WebDriver driver=new FirefoxDriver();

	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("men shoes"+Keys.ENTER);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)");
	//driver.findElement(By.xpath("//*[@alt='Oricum Boxer-303 Sneakers For Men']")).click();
	
	String before_xpath=".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[";
	String med_xpath="]/div[";
	String after_xpath="]/div/a[1]/div[1]/div/div[1]/img";
	
	for(int i=1;i<=10;i++){
		
		for(int j=1;j<=4;j++){
		String name_item=driver.findElement(By.xpath(before_xpath+i+med_xpath+j+after_xpath)).getTagName();
		System.out.println("Name of each product"+name_item);
		
		}
		
	}
	WebDriverWait wait_exp=new WebDriverWait(driver,30);
	}

}

package PracticeJava;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindow {
	
	@Test
	public static void test(){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> Allwindows=driver.getWindowHandles();
		System.out.println(Allwindows);
		int count=Allwindows.size();
		System.out.println(count);
		for(String child:Allwindows){
			
			if(!parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				System.out.println("Child window"+ driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(parent );
			System.out.println("Parent window"+ driver.getTitle());
		}
	}
	}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,100)", args);
		boolean flag = true ; 
		int count = 1 ;
		
		 while(flag) {
			 try {
				 js.executeScript("window.scrollBy(0,50)", args);
				WebElement ele= driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small feed-carousel first-carousel']//a[@aria-label='Carousel next slide']"));
			if( driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small feed-carousel first-carousel']//a[@aria-label='Carousel next slide']")).isDisplayed()) {
			 flag = false ; 
			 System.out.println("element is displayed");
			 ele.click();
			}
			
			 }
			 catch(Exception e ) {
				 count++ ; 
				 
				 
				 if(count == 6)
				 {
					 System.out.println("count i 6 cannot proceed 10");
					 flag = false ;
					 
				 }
				 else
					 flag = true ;
				 
			 }
			 
			 
			 
		 }
		 System.out.println("element found");
		//driver.findElement(RelativeLocator.with(By.xpath("//div[@class='a-section a-spacing-none fluid-image-container']")).near(By.xpath("//div[@class='a-section a-spacing-none fluid-image-container']")).below(By.xpath("//div[@class='a-cardui-header']"))).click();
		
		//Carousel next slide
		
		
		
	}
}

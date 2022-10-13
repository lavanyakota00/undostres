package SeleniumPrg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpening {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sanbox.undostres.com.mx/");
		
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[contains(@name,'mobile')])[1]")).sendKeys("8465433546");
		driver.findElement(By.xpath("(//*[contains(@name,'operator')])[1]")).click();
		driver.findElement(By.xpath("//*[text()='Telcel']")).click();
		driver.findElement(By.xpath("(//*[contains(@name,'amount')])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='main-info data-value'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='button buttonRecharge'])[1]")).click();
		
		//moving to payment page 
		
		driver.findElement(By.xpath("//*[@id='cardGly']")).click();
		driver.findElement(By.xpath("(//*[contains(@class,'radio-custom-label')])[1]")).click();
		 //driver.findElement(By.xpath("//*[text()='Usar nueva tarjeta']")).click();
		
		driver.findElement(By.xpath("//*[@id='cardnumberunique']")).sendKeys("4111111111111111");
		driver.findElement(By.xpath("(//*[contains(@name,'expmonth')])[2]")).sendKeys("11");
		driver.findElement(By.xpath("(//*[contains(@name,'expyear')])[2]")).sendKeys("25");
		driver.findElement(By.xpath("(//*[contains(@name,'cvvno')])[2]")).sendKeys("111");
		driver.findElement(By.xpath("(//*[contains(@name,'txtEmail')])[1]")).sendKeys("test@test.com");
		
		driver.findElement(By.xpath("(//*[contains(@name,'promocode')])[2]")).sendKeys("123");
		driver.findElement(By.xpath("(//*[@class='PaymentMethod'])[3]")).click();
		driver.findElement(By.xpath("(//*[contains(@name,'email')])[1]")).sendKeys("automationUDT1@gmail.com");
		driver.findElement(By.xpath("(//*[contains(@name,'password')])[1]")).sendKeys("automationUDT123");
		
		//driver.switchTo().frame("a-v3yskzts2c4e");
		driver.navigate().to("https://sanbox.undostres.com.mx/payment.php");
		driver.findElement(By.xpath("(//*[contains(@class,'recaptcha-checkbox-borderAnimation')])[3]")).click();
		
		
//		driver.findElement(By.xpath("")).sendKeys("");
//		
		
		
		
		
	
	
	
	
	
	}

}

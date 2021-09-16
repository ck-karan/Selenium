import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoGrid {
	
public static void main(String args[]) throws InterruptedException, MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karakris\\Downloads\\Jars\\jars for selenium testng\\chromedriver.exe");
		
		//Adding capabilities to driver
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.102:4444/wd/hub"), capability);
		Thread.sleep(2000);
		System.out.println("Chrome Driver opens");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		System.out.println("navigate to google.com");
		
		WebElement searchBar = driver.findElement(By.name("q"));
		
		searchBar.sendKeys("Selenium Webdriver");
		Thread.sleep(3000);
		
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Searching for Selenium WebDriver");
		
		String text = driver.findElement(By.xpath("//div[@class='LGOjhe']/span/span")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		driver.quit();
	
	}
}

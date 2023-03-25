import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	static WebDriver driver = new ChromeDriver();
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{	
		System.setProperty("webdriver.chrome.driver","E://Automation Workspace//SeleniumTest//driver/chromedriver.exe");
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		By download = By.xpath("//span[contains(text(),'Downloads')]");
		driver.findElement(download).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
		close();
	}
	public static void close()
	{
		driver.close();
		driver.quit();
	}

}

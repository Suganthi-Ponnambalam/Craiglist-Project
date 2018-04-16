package testcase1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Case1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\muthu\\Downloads\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	/*driver.get("https://letskodeit.teachable.com/");
	driver.findElement(By.xpath("//div[@id='navbar']//ul/li[1]/a")).click();
    driver.findElement(By.xpath("//table[@id='product']//td[text()='Python Programming language']//following-sibling::td"));*/
	
	driver.get("https://dhtmlx.com/docs/products/dhtmlxGrid/");
	//driver.findElement(By.xpath("//div[@id='cgrid2_1522305654835']//tbody[contains(text(),'Alia']//following-sibling::td"));
	driver.findElement(By.xpath("//div[@id='cgrid2_1522305654835']/div[2]/table/tbody/tr[3]/td[2]"));
	Thread.sleep(3000);
	
	driver.close();
	
	}
}

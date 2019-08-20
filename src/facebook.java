import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[]args) {
		
		
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://facebook.com/");
		//driver.findElement(By.cssSelector("#email")).sendKeys("hello");
		//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("password");
	//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myown"); 
		//driver.findElement(By.cssSelector("[value='Log In']")).click();
		//driver.findElement(By.cssSelector(null)())
		WebDriver driver = new ChromeDriver();
		driver.get("http://spirit.com/");
		driver.findElement(By.id("departCityCodeSelect")).sendKeys("New York");
		driver.findElement(By.id("destCityCodeSelect")).sendKeys("Los angles,Cali");
		driver.findElement(By.id("departDate")).sendKeys("09/05/2019");
		driver.findElement(By.id("returnDate")).sendKeys("09/17/2019");
		Select s = new Select(driver.findElement(By.id("paxAdults")));
	     s.selectByValue("3");
	    driver.findElement(By.cssSelector("#book-travel-form > div > p > button")).click();
				

	
	
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code


		/* Class name = ChromeDriver,

		x driver = new x();*/
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://nba.com");
		System.out.println(driver.getTitle());
		
driver.navigate().to("http://yahoo.com");
driver.quit();
	}

	}



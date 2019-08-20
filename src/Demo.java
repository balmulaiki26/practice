import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code


		/* Class name = ChromeDriver,

		x driver = new x();*/
		
        System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		
	}

}

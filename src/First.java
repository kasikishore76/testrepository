import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HOME\\Downloads\\browser drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.fb.com");

	}

}

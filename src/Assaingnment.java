import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Assaingnment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HOME\\Downloads\\browser drivers\\geckodriver.exe");

	String text="Rahul";

	

	WebDriver driver= new FirefoxDriver();

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("name")).sendKeys(text);

	driver.findElement(By.cssSelector("[id='alertbtn']")).click();

	System.out.println(driver.switchTo().alert().getText());

	driver.switchTo().alert().accept();

	driver.findElement(By.id("confirmbtn")).click();

	System.out.println(driver.switchTo().alert().getText());



	driver.switchTo().alert().dismiss();


}
}
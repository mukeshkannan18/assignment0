package week5day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.accept();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert promtAlert=driver.switchTo().alert();
		promtAlert.sendKeys("mukesh");
		promtAlert.accept();
	}

}

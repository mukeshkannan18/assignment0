package week5day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnframe {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("mukesh");
		promptAlert.accept();
		
		WebElement value=driver.findElement(By.xpath("//p[@id='demo']"));
		String text=value.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
	
	
	}

}

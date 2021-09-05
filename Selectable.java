package week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement src = driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
		WebElement dest = driver.findElement(By.xpath("//ol[@id='selectable']/li[4]"));
		Actions builder=new Actions(driver);
		builder.clickAndHold(src).moveToElement(dest).release().perform();

	}

}

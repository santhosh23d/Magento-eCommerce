package org.s.a.l;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LogoScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		// open the chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\santh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// "type the url ""https://magento.softwaretestingboard.com/"and click enter"
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();

		// click sign in button
		WebElement signin = driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]"));
		signin.click();

		Thread.sleep(2000);

		JavascriptExecutor J = (JavascriptExecutor) driver;

		// scroll down
		WebElement scroll = driver.findElement(By.xpath("//span[@class='base']"));
		J.executeScript("arguments[0].scrollIntoView(true)", scroll);

		// enter valid email id
		WebElement Email = driver.findElement(By.xpath("//input[@name='login[username]']"));
		Email.sendKeys("TEST54321@gmail.com");

		// enter valid password
		WebElement Password = driver.findElement(By.xpath("//input[@name='login[password]']"));
		Password.sendKeys("Test54321");

		// click sign in button in login page
		WebElement click = driver.findElement(By.xpath("(//button[@name='send'])[1]"));
		click.click();

		Thread.sleep(3000);

		// take screen shot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File place = new File("C:\\Users\\santh\\eclipse-workspace\\Magento eCommerce\\screenshot\\img.png");
		FileHandler.copy(file, place);

	}
}

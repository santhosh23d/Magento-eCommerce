package org.check;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {
	public static void main(String[] args) throws InterruptedException {

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
	}
}

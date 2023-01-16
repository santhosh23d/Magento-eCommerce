package org.size;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SizeS {
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

		Actions A = new Actions(driver);
		
		Thread.sleep(3000);
		
		// drag pointer to men
		WebElement move1 = driver.findElement(By.xpath("//span[text()='Men']"));
		A.moveToElement(move1).perform();

		// now drag pointer to tops
		WebElement move2 = driver.findElement(By.xpath("(//span[text()='Tops'])[2]"));
		A.moveToElement(move2).perform();

		// now click jackets
		WebElement move3 = driver.findElement(By.xpath("(//span[text()='Jackets'])[2]"));
		move3.click();

		// click any product in the page
		WebElement product = driver.findElement(By.xpath("(//span[@class='product-image-wrapper'])[1]"));
		product.click();

		// scroll down and click xs in size option
		WebElement scrolldown = driver.findElement(By.xpath("//span[text()='Proteus Fitness Jackshirt']"));
		J.executeScript("arguments[0].scrollIntoView(true)", scrolldown);

		Thread.sleep(3000);
		WebElement xs = driver.findElement(By.id("option-label-size-143-item-166"));
		xs.click();

		// click s in size option
		Thread.sleep(3000);
		WebElement s = driver.findElement(By.id("option-label-size-143-item-167"));
		s.click();

	}
}

package org.shortby;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortbyPosition {
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

		// click the sort by function
		WebElement sortby = driver.findElement(By.id("sorter"));
		sortby.click();

		// click the price option in sort by
		WebElement price = driver.findElement(By.xpath("(//option[@value='price'])[1]"));
		price.click();
		
		// click the sort by function
		WebElement sortby2 = driver.findElement(By.id("sorter"));
		sortby2.click();

		// click the product name option in sort by
		WebElement name = driver.findElement(By.xpath("(//option[@value='name'])[1]"));
		name.click();
		// click the sort by function
		WebElement sortby3 = driver.findElement(By.id("sorter"));
		sortby3.click();

		// click the position option in sort by
		WebElement position = driver.findElement(By.xpath("(//option[@value='position'])[1]"));
		position.click();

	}
}

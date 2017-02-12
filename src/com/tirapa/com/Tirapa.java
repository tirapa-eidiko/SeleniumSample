package com.tirapa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tirapa {
	@Test
	public void bitbucketLogin() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.14.0-win64\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();

		System.out.println("Loging to https://depot.ciscospark.com");

		driver.get("https://depot.ciscospark.com");

		System.out.println("Clicking Login");
		driver.findElement(By.className("login")).click();
		System.out.println("Entering Email id");
	
		driver.findElement(By.id("email")).clear();
	
		driver.findElement(By.id("email")).sendKeys("tondaputirapareddy@gmail.com");
		System.out.println("Click on Continue button");
		driver.findElement(By.cssSelector("input.btn")).click();

		Thread.sleep(45000);
		System.out.println("Entering Password.....");

		driver.findElement(By.xpath(".//*[@id='IDToken2']")).sendKeys("Aparitreddy22");

		System.out.println("Signinf Up button.......");

		driver.findElement(By.xpath(".//*[@id='Button1']")).click();

		Thread.sleep(30000);

		driver.findElement(By.xpath(".//*[@id='content']/div/header/div/nav[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Integrations")).click();

		System.out.println("App List is displaying");

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		// BitBucket is clicked

		driver.findElement(
				By.xpath(".//*[@id='content']/div/div/div/div/div[2]/div/div/div[7]/div/div/div[2]/p/span/a/span"))
				.click();
		System.out.println("BitBucket Icon is clicked");
		
		Thread.sleep(30000);
		driver.switchTo().frame("guestFrame");
	  	driver.findElement(By.xpath(".//*[@id='add-config']")).click(); 
	  	
	  	
	  	Select DropBP = new Select(driver.findElement(By.xpath(".//*[@id='repos']")));
		Thread.sleep(10000);
	    DropBP.selectByVisibleText("rakesh_t/mavanweb");
	    System.out.println("Selecting bitbucket repository.......");
	    Thread.sleep(10000);
	    
	    
	    driver.findElement(By.xpath(".//*[@id='pull-requests']/div[1]")).click();
	    driver.findElement(By.xpath(".//*[@id='pull-requests']/div[1]/div[1]/label")).click();
	    Thread.sleep(2000);
	    System.out.println("Created check box is checked");
	   
	    
	    driver.findElement(By.xpath(".//*[@id='pull-requests']/div[1]/div[2]/label")).click();
	    Thread.sleep(2000);
	    System.out.println("Updated check box is checked");
	   
	    driver.findElement(By.xpath(".//*[@id='form']/div[1]/div[2]/div[3]")).click();
	    driver.findElement(By.xpath(".//*[@id='issues']/div[1]/div[1]/label")).click();
	    Thread.sleep(5000);
	    System.out.println("Created check box is checked");
	    
	    driver.findElement(By.xpath(".//*[@id='issues']/div[1]/div[2]/label")).click();
	    Thread.sleep(5000);
	    System.out.println("Updated check box is checked");
		
	    
	    Select DropB = new Select(driver.findElement(By.xpath(".//*[@id='rooms']")));
		Thread.sleep(10000);
		DropB.selectByIndex(1);
	    DropB.selectByVisibleText("BitBucket");
	    System.out.println("Selecting Spark room .......");
	    Thread.sleep(10000);
	    

	}
}

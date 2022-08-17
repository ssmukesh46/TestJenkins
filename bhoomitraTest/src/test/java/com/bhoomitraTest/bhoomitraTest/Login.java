package com.bhoomitraTest.bhoomitraTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
		String website = "https://dev.smartgms.in";

		driver.get(website);

		driver.findElement(By.id("username")).sendKeys("state_admin");
		driver.findElement(By.id("password")).sendKeys("hMTYJSShhcixDC7");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[2]//div[1]//div[1]//div[2]//button[1]")).click();
		driver.findElement(By.id("3")).click();
		driver.findElement(By.xpath("//h5[normalize-space()='Total Enrollment']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	String currentUrlInDashboard= 	driver.getCurrentUrl();
	System.out.println(currentUrlInDashboard);
		
	//	Thread.sleep(3000);
	//	driver.findElement(By.id("drawerMenu")).click();
//driver.close();
	}

}

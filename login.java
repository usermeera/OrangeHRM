package com.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
@Test
public void login_Test()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
			driver.close();
		
	}

}

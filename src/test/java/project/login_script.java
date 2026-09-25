package project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class login_script extends base_test{
@Test
public void login() {
	driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
	driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("jeffrenblesto@gmail.com");
	driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("Jeffren123!@#");
	driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
	
}

@Test
public void logout() {
	driver.findElement(By.xpath("//a[text()=' Logout']")).click();
}
}

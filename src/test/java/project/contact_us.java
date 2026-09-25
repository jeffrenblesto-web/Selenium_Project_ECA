package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class contact_us extends base_test{
@Test
public void contact() {
	driver.findElement(By.xpath("//a[text()=' Contact us']")).click();
	WebElement element = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
	Assert.assertEquals(element.getText().equalsIgnoreCase("Get In Touch"),true );
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jeffren");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jeffrenblesto@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("ffvfvvegc");
	driver.findElement(By.id("message")).sendKeys("fyhbulbuvufbhcvhuhyvachuhv98i99ubhhuc89dg");
	WebElement element2 = driver.findElement(By.name("upload_file"));
	element2.sendKeys("C:\\Users\\jeffr\\Downloads\\Jeffren_Blesto_Resume.pdf (2) (3).pdf");
	driver.findElement(By.xpath("//input[@value='Submit']")).click();  
	driver.switchTo().alert().accept();
	WebElement element3 = driver.findElement(By.xpath("//div[@style='display: block;']"));
	Assert.assertEquals(element3.getText().equalsIgnoreCase("Success! Your details have been submitted successfully."), true);
	System.out.println(element3.getText());
	driver.findElement(By.xpath("//span[text()=' Home']")).click();
	
	
	
	
	
	
}
}
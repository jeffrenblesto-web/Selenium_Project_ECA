package project;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class verify_all_product extends base_test {
@Test
public void Allproduct(){
	driver.findElement(By.xpath("//a[text()=' Products']")).click();
	
	WebElement element = driver.findElement(By.xpath("//div[text()='All Products']"));
	Assert.assertEquals(element.getText().equalsIgnoreCase("All Products"), true);
	System.out.println(element.getText());
	
	driver.findElement(By.xpath("//a[text()='View Product']")).click();
	
    driver.findElement(By.xpath("(//p[text()='Blue Top'])[1]//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='View Product']"));
	WebElement text1 = driver.findElement(By.xpath("//p[text()='Blue Top']"));
	Assert.assertEquals(text1.getText().equalsIgnoreCase("Blue Top"),true);
	System.out.println(text1.getText());
	
	WebElement text2 = driver.findElement(By.xpath("//span[text()='Rs. 500']"));
	Assert.assertEquals(text2.getText().equalsIgnoreCase("Rs. 500"), true);
	System.out.println(text2.getText());
	
	WebElement element2 = driver.findElement(By.xpath("//span[text()=' In Stock']"));
	Assert.assertEquals(element2.getText().equalsIgnoreCase("In Stock"), true);
	System.out.println(element2.getText());
	
	WebElement element3 = driver.findElement(By.xpath("//b[text()='Brand:']"));
	Assert.assertEquals(element3.getText().equalsIgnoreCase("Brand"), true);
	System.out.println(element3.getText());
	
	
	
	
	
}

}
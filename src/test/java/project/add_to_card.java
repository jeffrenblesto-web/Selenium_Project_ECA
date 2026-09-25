package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.base_test;

public class add_to_card extends base_test {
@Test
public void card() throws Exception {
	
	driver.findElement(By.xpath("//a[@style='color: orange;']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()=' Products']")).click();
	
	driver.findElement(By.xpath("(//p[text()='Men ']//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='Add to cart'])[1]")).click();
		
	driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();
	
	driver.findElement(By.xpath("(//p[text()='Sleeveless ']//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='Add to cart'])[1]")).click();
	driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();
	
	driver.findElement(By.xpath("//i[text()=' Cart']")).click();
	
	WebElement element = driver.findElement(By.xpath("//a[text()='Men Tshirt']"));
    Assert.assertEquals(element.getText().equalsIgnoreCase("Men Tshirt"), true);
    System.out.println("Product 1:"+element.getText());
    
    
    WebElement element1 = driver.findElement(By.xpath("//a[text()='Sleeveless Dress']"));
    Assert.assertEquals(element1.getText().equalsIgnoreCase("Sleeveless Dress"), true);
    System.out.println("Product 2:"+element1.getText());
	
	
	
}

}

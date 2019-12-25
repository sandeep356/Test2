package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonePage {
	
public static WebDriver driver= null;
public static WebElement element= null;
	
	public static WebElement textbox_search(){
		
		element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		return element;
		
	}
	
	public static WebElement button_search(){
		
		element = driver.findElement(By.xpath("//input[@value='Go']"));
		return element;
		
	}
	
	public static WebElement Select_item(){
		element = driver.findElement(By.xpath("//img[@class='s-image']"));
		return element;
	}
	
	public static WebElement Get_price(){
		element = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		return element;
	}


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartPage {
	public static WebDriver driver = null;
	public static WebElement element = null;
	
public static WebElement textbox_search(){
		
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	public static WebElement button_search(){
		
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
		
	}
	
	public static WebElement Select_item(){
		element = driver.findElement(By.xpath("//img[@class='_1Nyybr  _30XEf0']"));
		return element;
	}
	
	public static WebElement Get_price(){
		element = driver.findElement(By.xpath("//div[@class='_1uv9Cb']//div"));
		return element;
	}


	
	
}

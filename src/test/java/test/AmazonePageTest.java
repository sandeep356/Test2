package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AmazonePage;
public class AmazonePageTest extends AmazonePage {
	public static int amazonprice;
	String text = null;

	@BeforeMethod
	public void Initialization() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\ScriptDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.Amazone.com");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 }
	
	@Test
	public  void SearchTest(){
		//serching the mobile model
		AmazonePage.textbox_search().sendKeys("iphone xr 64 gb yellow");
		AmazonePage.button_search().click();
		
	}
	
	@Test
	public void SelectItemTest(){
		//selecting item on product list page
		AmazonePage.Select_item().click();
		
	}
	@Test
	public void GetPrice(){
		//fetchng the product price 
	 text= AmazonePage.Get_price().getText();
	 System.out.println("text"+text);
	  amazonprice=Integer.parseInt(text);
	 System.out.println(""+amazonprice);
		 
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

}

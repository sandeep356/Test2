package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FlipkartPage;

public class FlipkartPageTest extends FlipkartPage {
	
	public static int Flipkartprice;
	 String text1 = null;

	@BeforeMethod
	public void Initialization() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\ScriptDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.get("https://www.Amazone.com");
		 driver.navigate().to("https://www.Amazone.com");
		 Thread.sleep(3000);
		 }
	
	@Test
	public  void SearchTest(){
		FlipkartPage.textbox_search().sendKeys("iphone xr 64 gb yellow");
		FlipkartPage.button_search().click();
		
	}
	
	@Test
	public void SelectItemTest(){
		FlipkartPage.Select_item().click();
		
	}
	
	@Test
	public void GetPriceTest(){
	 text1= FlipkartPage.Get_price().getText();
	  Flipkartprice=Integer.parseInt(text1);
	 System.out.println(""+Flipkartprice);
		 
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	
}

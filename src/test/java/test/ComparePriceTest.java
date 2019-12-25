package test;

import org.testng.annotations.Test;

public class ComparePriceTest {
	
	@Test
	public void comparePrice()
	{
		AmazonePageTest am=new AmazonePageTest();
		FlipkartPageTest fk=new FlipkartPageTest();
		if(am.amazonprice>fk.Flipkartprice)
		{
			System.out.println("Flipkart selling it on less price: "+fk.Flipkartprice);
		}
		else
		{
			System.out.println("Amazon selling it on less price: "+am.amazonprice);
		}

	}

}

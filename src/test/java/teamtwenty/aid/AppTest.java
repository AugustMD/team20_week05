package teamtwenty.aid;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

import teamtwenty.aid.Customer;
import teamtwenty.aid.BillView;
import teamtwenty.aid.BillCalculator;
import teamtwenty.aid.InputClass;

public class AppTest {
	BillView bv;
	Customer customer;
	
	
	/*@BeforeClass
	public void initAppTest() {
		
		
	}*/
	
	@Test
	public void testSilver() {
		customer = new Customer("Conan");
		customer.setUsedInfo("Silver", 1004, 3);
		bv = new BillView(customer);
		 
	}
}

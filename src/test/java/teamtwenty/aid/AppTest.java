package teamtwenty.aid;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

import teamtwenty.aid.*;

public class AppTest {
	BillView bv;
	Customer customer = new Customer("Conan");
	
	
	/*@BeforeClass
	public void initAppTest() {
		
		
	}*/
	
	@Test
	public void testSilver() {
		customer.setUsedInfo("Silver", 1004, 3);
		bv = new BillView(customer);
		 
	}
}

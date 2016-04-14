package teamtwenty.aid;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class AppTest {
	BillView bv;
	Customer customer;
	
	
	@BeforeClass
	public void initAppTest() {
		customer = new Customer("Conan");
		
	}
	
	@Test
	public void testSilver() {
		customer.setUsedInfo("Silver", 1004, 3);
		bv = new BillView(customer);
		 
	}
}

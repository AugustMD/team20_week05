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
	InputClass[] input;
	
	/*@BeforeClass
	public void initAppTest() {
		
		
	}*/
	
	@Test
	public void testSilver() {
		input=new InputClass[4];
		input[0] = new InputClass("Silver",600,4);
		input[1] = new InputClass("Gold",1010,3);
		input[2] = new InputClass("silver",400,1);
		input[3] = new InputClass("gold",900,1);
		
		
		for(int i=0;i<4;i++){
			customer = new Customer(input[i]);
		//customer.setUsedInfo("Silver", 1004, 3);
			bv = new BillView(customer,input[i]);
		}
	}
}

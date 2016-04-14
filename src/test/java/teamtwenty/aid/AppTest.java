package teamtwenty.aid;

import org.junit.Test;
import static org.junit.Assert.*;

import teamtwenty.aid.Customer;
import teamtwenty.aid.BillView;
import teamtwenty.aid.InputClass;

public class AppTest {
	BillView bv;
	Customer customer;
	InputClass[] input;
	Address address;

	
	@Test
	public void testSilver() {
		Main.main(null);
		address=new Address("Korea","Deajeon","585-20");
		input=new InputClass[4];
		input[0] = new InputClass("Silver",600,4);
		input[1] = new InputClass("Gold",1010,3);
		input[2] = new InputClass("silver",400,1);
		input[3] = new InputClass("gold",900,1);
		
		
		for(int i=0;i<4;i++){
			customer = new Customer(input[i],address);
			bv = new BillView(customer,input[i],address);
			bv.printAll();
		}
	}
}

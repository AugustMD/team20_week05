package teamtwenty.aid;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;


public class InputClass {
	private Scanner scan;
	private String planType;
	private int numberOfLines;
	private int usedAmount;
	private Logger log;
	/*
	public InputClass(){
		log = Logger.getLogger("Logger");
		scan=new Scanner(System.in);

		log.log(Level.INFO, "\nInput Plan Type :");
		planType = scan.nextLine();

		log.log(Level.INFO, "\nInput Used Amount :");
		usedAmount = scan.nextInt();

		log.log(Level.INFO, "\nInput Number Of Lines :");
		numberOfLines = scan.nextInt();
	}*/
	
	public InputClass(String plan, int amount, int numberOfLines){
		this.planType = plan;
		this.usedAmount = amount;
		this.numberOfLines = numberOfLines;
	}

	public String getPlanType(){
		return this.planType;
	}

	public int getUsedAmount(){
		return this.usedAmount;
	}

	public int getNumberOfLines(){
		return this.numberOfLines;
	}
}

package teamtwenty.aid;


public class InputClass {
	private String planType;
	private int numberOfLines;
	private int usedAmount;

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

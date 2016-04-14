package teamtwenty.aid;
public class Gold extends Plan{

	private double ratePerAdditionalLine;
	private double ratePerAdditionalMinutes;
	private double includeMinutes;
	private double basicMontlyRate;

	public Gold(){
		this.ratePerAdditionalLine = 14.50;
		this.ratePerAdditionalMinutes = 0.45;
		this.includeMinutes = 1000;
		this.basicMontlyRate = 49.95;
	}
 
	public double getBasicMontlyRate(){
		return this.basicMontlyRate;
	}

	public double getIncludedMinutes(){
		return this.includeMinutes;
	}

	public double getRatePerAdditionalMinutes(){
		return this.ratePerAdditionalMinutes;
	}

	public double getRatePerAdditionalLine(){
		return this.ratePerAdditionalLine;
	}
}

package teamtwenty.aid;
public class Gold extends Plan{

	public Gold(){
		this.ratePerAdditionalLine = 14.50;
		this.ratePerAdditionalMinutes = 0.45;
		this.includedMinutes = 1000;
		this.basicMonthlyRate = 49.95;
	}

	@Override
	public double getIncludedMinutes(){
		return this.includedMinutes;
	}

	@Override
	public double getRatePerAdditionalMinutes(){
		return this.ratePerAdditionalMinutes;
	}

	@Override
	public double getRatePerAdditionalLine(){
		return this.ratePerAdditionalLine;
	}
	
	@Override
	public double getBasicMontlyRate(){
		return this.basicMonthlyRate;
	}
}

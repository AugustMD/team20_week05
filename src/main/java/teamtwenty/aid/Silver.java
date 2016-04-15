package teamtwenty.aid;
/**
 * siver plan extend abstract class plan
 */

public class Silver extends Plan
{
   
    public Silver() {
    	this.basicMonthlyRate = 29.95;
    	this.includedMinutes = 500;
    	this.ratePerAdditionalMinutes = 0.54;
    	this.ratePerAdditionalLine = 21.5;
    }
    /*
     * Get basic monthly rate 29.95
     * @return basicMonthlyRate
     */
    @Override
    public double getBasicMontlyRate() {
        return this.basicMonthlyRate;
    }

    /*
     * Get include minutes 500
     * @return includedMinutes
     */
    @Override
    public double getIncludedMinutes() {
        return this.includedMinutes;
    }

    /*
     * Get rate per additional minutes 0.54
     * @return RatePerAdditionalMinutes
     */
    @Override
    public double getRatePerAdditionalMinutes() {
        return this.ratePerAdditionalMinutes;
    }

    /*
     * Get rate per additional line 21.5
     * @return RatePerAdditionalLine
     */
    @Override
    public double getRatePerAdditionalLine() {
        return this.ratePerAdditionalLine;
    }
}

package teamtwenty.aid;
public abstract class Plan{

    // Instance var.
    double basicMonthlyRate;
    double includedMinutes;
    double ratePerAdditionalMinutes;
    double ratePerAdditionalLine;
    public static final double LINECOSTOVER4 = 5.0;

    // getters
    public abstract double getBasicMontlyRate();

    public abstract double getIncludedMinutes();

    public abstract double getRatePerAdditionalMinutes();

    public abstract double getRatePerAdditionalLine();

}

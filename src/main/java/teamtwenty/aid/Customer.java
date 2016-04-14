package teamtwenty.aid;
public class Customer{
    private Plan planInfo;
    private String name;
    private Address addressInfo;


    private int minutesUsed;
    private int numberOfLines;
    private String planType;
 


   
    public Customer(InputClass input,Address address){

        this.numberOfLines = input.getNumberOfLines();
        this.minutesUsed = input.getUsedAmount();
        this.planType = input.getPlanType();

        if("silver".equals(this.planType) || "Silver".equals(this.planType)){
            this.planInfo = new Silver();
        }else if ("Gold".equals(this.planType) || "gold".equals(this.planType)){
            this.planInfo = new Gold();
        }

        this.addressInfo = address;

    }
    

    public Plan getPlanInfo(){
        return this.planInfo;
    }

    public String getCustomerName(){
        return this.name;
    }


    public Address getAddressInfo(){
        return this.addressInfo;
    }

    public int getMinutesUsed(){
        return this.minutesUsed;
    }

    public int getNumberOfLines(){
        return this.numberOfLines;
    }
}

package teamtwenty.aid;
public class Customer{
    private Plan planInfo;
    private InputClass input;
    private String name;
    private Address addressInfo;

    // Derive from InputClass
    private int minutesUsed;
    private int numberOfLines;
    private String planType;
 


   
    public Customer(InputClass input,Address address){
  //  	this.input = new InputClass("Silver", 1005, 3);

        this.numberOfLines = input.getNumberOfLines();
        this.minutesUsed = input.getUsedAmount();
        this.planType = input.getPlanType();

//        this.name = name;
        if("silver".equals(this.planType) || "Silver".equals(this.planType)){
            this.planInfo = new Silver();
        }else if ("Gold".equals(this.planType) || "gold".equals(this.planType)){
            this.planInfo = new Gold();
        }

        this.addressInfo = address;

    }
    
    /*public void setUsedInfo(String ptype, int used, int lines){
    	this.input = new InputClass(ptype, used, lines);
    }*/

    public Plan getPlanInfo(){
        return this.planInfo;
    }

    public String getCustomerName(){
        return this.name;
    }

    public String getPlanType(){
        return this.planType;
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

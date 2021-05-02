
package Task1;


public class ClockExtended extends Clock{
    private String ampm;
    
    public ClockExtended(){
        super();
        ampm = "A.M.";
    }
    public ClockExtended(int hrs, int min, int sec, String ampm){
        super(hrs, min, sec);
        this.ampm = ampm;
    }
    
    //overriding method
    public void Display(){
        super.Display();
        System.out.println("The time in AM/PM is "+hours+":"+minutes+":"+seconds+" "+ampm);
        System.out.println("The time in 24-hour format is "+hours+minutes+" hours");
    }
}

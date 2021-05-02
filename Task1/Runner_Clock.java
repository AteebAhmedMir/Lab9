
package Task1;


public class Runner_Clock {
    public static void main(String[] args) {
        Clock c1 = new Clock(11, 30, 23);
        c1.Display();
        
        ClockExtended cc1 = new ClockExtended(7, 17, 42, "A.M.");
        cc1.Display();
    }
}

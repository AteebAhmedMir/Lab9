
package Task1;


public class Clock {
    int hours;
    int minutes;
    int seconds;
    public Clock(){
        hours = 23;
        minutes = 59;
        seconds = 59;
    }
    
    public Clock(int hrs, int min, int sec){
        hours = hrs;
        minutes = min;
        seconds = sec;
    }
    
    public void set_hrs(int h){
        hours = h;
    }
    public int get_hrs(){
        return hours;
    }
    
    public void set_min(int m){
        minutes = m;
    }
    public int get_min(){
        return minutes;
    }
    
    public void set_sec(int s){
        seconds = s;
    }
    public int get_sec(){
        return seconds;
    }
    
    public void Display(){
        System.out.println("The entered time is: "+hours+":"+minutes+":"+seconds);
    }
    public void formyease(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}

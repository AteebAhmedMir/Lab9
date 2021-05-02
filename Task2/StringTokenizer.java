
package Task2;



public class StringTokenizer {
    private String count_Tokens_Overide;
    public StringTokenizer(){
        
    }
    public StringTokenizer(String cto){
        count_Tokens_Overide = cto;
        
    }
    
    public void set_count_Tokens_Overide(String ct){
        count_Tokens_Overide = ct;
    }
    public String get_count_Tokens_Overide(){
        return count_Tokens_Overide;
    }
    
    public String countTokens(){
        return "Numeric values Cannot be counted";
    } 
    
    
    
}

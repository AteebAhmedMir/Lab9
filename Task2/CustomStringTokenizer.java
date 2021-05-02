
package Task2;

public class CustomStringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("This runner over rides the default countTokens method");
        st.countTokens();
        System.out.println(st.countTokens());
    }
    
}

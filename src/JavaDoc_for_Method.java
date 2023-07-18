
public class JavaDoc_for_Method {
    /**
     * this is main method and java program start from here
     * @param args this is main method argument a string array
     */

    public static void main(String[] args) {
        System.out.println("this is main method ..");
    }

    /**
     * @deprecated this method is deprecated and now use + instead of this
     * his is and integer adding method
     * @param a this is an argument of first number
     * @param b   this is an argument of second number
     * @return  this return int
     */
    public int adds(int a,int b){
        int c;
        c= a+b;
        return c;
    }
    /**
     * is and integer subtract method
     * @deprecated this method is deprecated and now use - instead of this
     * @param a this is an argument of first number
     * @param b   this is an argument of second number
     * @return  this rerun int
     */
    public int subtract(int a, int b){
        int c;
        c= a+b;
        return c;
    }
}

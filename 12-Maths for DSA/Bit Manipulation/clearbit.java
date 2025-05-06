public class clearbit {
    //one se zero banana hai!
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitmask = ~(bitMask);

        int newnumber = notBitmask & n;
        System.out.println(newnumber);
        
    }
    
}

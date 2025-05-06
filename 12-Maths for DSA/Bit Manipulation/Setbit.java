public class Setbit {
    //zero se one banana hai!
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        int newnumber = bitMask | n;
        System.out.println(newnumber);
        
    }
    
}

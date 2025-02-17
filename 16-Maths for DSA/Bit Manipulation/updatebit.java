import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper =1 : set ; oper=0: clear
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        if (oper == 1) {
            //set
            int newnumber = bitMask | n;
            System.out.println(newnumber);
        } else {
            //clear
            int newbitmask = ~(bitMask);
            int newnumber = newbitmask & n;
            System.out.println(newnumber);

        }
       
    }
    
}

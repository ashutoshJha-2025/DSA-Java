package Exceptions;
public class ThrowsException {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            getNumbersFromArrays(a);
        } catch (Exception e) {
           System.out.println("Catched the Exception "+e.getMessage());
        }
        
    }

    static int getNumbersFromArrays(int[] a) throws ArrayIndexOutOfBoundsException{
        return a[8];
    }
}
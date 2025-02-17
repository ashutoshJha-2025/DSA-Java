package Exceptions;
public class ExceptionHandling {
   
    public static void main(String[] args) {
        
        int[] a = new int[5];

       System.out.println("Hello Guys");


       // Written Type:- 1;
        try {
            System.out.println(a[8]);
            int result = 5/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access the out of bound element");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }


        // Written Type:- 2;
        try {
            System.out.println(a[8]);
            int result = 5/0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Handling the exception");
        } catch (RuntimeException e) {
            
        }


        // Written Type:- 3;
        try {
            System.out.println(a[8]);
            int result = 5/0;
        } catch (Exception e) {
            System.out.println("All exceptions handled");
        } 
    

        // Written Type:- 4;
        try {
            System.out.println(a[8]);
            int result = 5/0;
        } catch (Exception e) {
            System.out.println("All exceptions handled");
        } finally {
            System.out.println("I will run always");
        }


        System.out.println("Bye Guys");
        
    }
}
    

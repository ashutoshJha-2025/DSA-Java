public class MinAndMax{
    public static void main(String[] args) {
      int[] arr = {22, 14, 3, 35, 18};
  
      System.out.print("Minimun number is: ");
      System.out.println(min(arr));
  
      System.out.print("Maximum number is: ");
      System.out.println(max(arr));
    }
  
    static int min(int[] arr) {
      int min = arr[0];
      for (int i=0; i<arr.length; i++) {
        if (arr[i] < min) {
          min = arr[i];
        }
      }
      return min;
    }
  
    static int max(int[] arr) {
      int max = arr[0];
      for (int j=0; j<arr.length; j++) {
        if (arr[j] > max) {
          max = arr[j];
        }
      }
      return max;
    }
  
  
  }

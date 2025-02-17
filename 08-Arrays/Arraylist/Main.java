import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      //  Integer | Float | String | Boolean
      ArrayList<Integer> list = new ArrayList<>();
      Scanner in = new Scanner(System.in);
      
     //   Add elements
      list.add(0);
      list.add(2);
      list.add(5);
      System.out.println(list);   // 0,2,5

     //    get element
     int ans = list.get(1);
     System.out.println(ans);     //2

     // add element in between
     list.add(2, 8);
     System.out.println(list);     // 0,2,8,5

     // set element
     list.set(0, 1);
     System.out.println(list);     //1,2,8,5

     // delete element
     list.remove(2);
     System.out.println(list);    // 1,2,5

     // size of arraylist
     int size = list.size();
     System.out.println(size);   //3

     // input using loops
       for (int i = 0; i < 5; i++) {
        list.add(in.nextInt());
     }

     // Output using loops 
     for(int i=0; i<list.size(); i++) {
        System.out.print(list.get(i));
     }
      System.out.println();

      // sorting
      Collections.sort(list);


    }
}

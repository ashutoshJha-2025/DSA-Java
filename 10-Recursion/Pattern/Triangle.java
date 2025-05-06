package Final.Pattern;

public class Triangle {
   public static void main(String[] args) {
    Draw(4, 0);
    
   }

   static void Draw(int r, int c) {
    if(r == 0) {
        return;
    }
    if(c < r) {
        System.out.print("* ");
        Draw(r, c+1);
    } else {
        System.out.println();
        Draw(r-1, 0);
    }
   }
    
} 
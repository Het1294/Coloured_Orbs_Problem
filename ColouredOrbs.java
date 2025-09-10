import java.util.*;
import java.lang.*;
import java.io.*;

class ColouredOrbs {
   public static void main(String[] args) throws java.lang.Exception {
      // your code goes here
      Scanner sc = new Scanner(System.in);
      int R, B, G;
      R = sc.nextInt();
      B = sc.nextInt();
      G = Math.min(R, B);
      if (R >= 1 && R <= 10 && B >= 1 && B <= 10) {
         int skill = R + 2 * B + 2 * G;
         System.out.println(skill);
      }
   }
}

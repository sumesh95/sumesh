package player;

import java.util.Scanner;

public class ReverseDigit
{
   public static void main(String args[])
   {
      int p, reverse = 0;
      
      Scanner in = new Scanner(System.in);
      p = in.nextInt();
 
      while( n != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + p%10;
          p= p/10;
      }
 
      System.out.println("Reverse of entered number is "+reverse);
   }
}

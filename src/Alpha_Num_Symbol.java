import java.util.Scanner;

public class Alpha_Num_Symbol {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

         System.out.println(" Enter the value ");
          String data;
          data = in.next();

          int len = data.length();
          for ( int i = 0; i < len ; i++) {
              char ch = data.charAt(i);
              if ((ch >= '0' && ch <= '9')) {

                  System.out.println(" NUMBER ");
              }
                 else if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' &&  ch <= 'Z')) {
                   System.out.println(" CHARAECTER ");
              }
                 else {
                     System.out.println(" SYMBOL ");
              }
                  }}
             }
















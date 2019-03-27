import java.util.Scanner;

public class Calculator {
    public static void main(String [] args )
    {  int a,b,add,sub,multi;
      double divide;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = s.nextInt();
        System.out.println(" Enter second number: ");
        b = s.nextInt();

        System.out.println( a + " + " + b + " = " + ( a + b ));

        System.out.println(a + " - "  + b + " = " + ( a - b ));

        System.out.println(a + " * " + b + " = " + (a * b ));

        System.out.println(a +" / " + b + " = " + (a / b ));

    }
}

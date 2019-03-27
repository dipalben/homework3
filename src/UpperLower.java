import java.util.Scanner;

public class UpperLower {
    private int ch;
    void uppercaseAlphabets(){

        // uppercas
        for ( char c = 'A'; c <= 'Z'; ++c)
            System.out.println(" " + c);
        System.out.println("\n ");
    }
    void LowercaseAlphabets(){

        //Lowercase
        for (char c = 'a'; c <= 'z'; ++c)
            System.out.println(" " + c);
         System.out.println("\n");
    }
    public static void main(String [] args){
        int ch;
        System.out.println(" Uppercase Alpabets ");
        UpperLower ob = new UpperLower();
        ob.uppercaseAlphabets();
        System.out.println("lowercase Alphabets ");
        ob.LowercaseAlphabets();

    }
}

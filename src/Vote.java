import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {

        int age;

        Scanner in = new Scanner(System.in);
        System.out.println(" WHAT IS THE AGE ");
    {
            age = in.nextInt();
        } if (age >= 18) {
                System.out.println(" eligible for vote ");
            } else {
                System.out.println(" NOT eligible for vote ");
            }

        }
    }

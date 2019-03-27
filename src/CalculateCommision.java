import java.util.Scanner;

public class CalculateCommision {
    public static void main(String [] args ){

        String name;
        int id;
        double sales_amount, basic_salary;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Employee name:");
        name = sc.next();
        System.out.println(" Enter id: ");
        id = sc.nextInt();
        System.out.println(" Enter basic salary : £ ");
        basic_salary = sc.nextDouble();
        System.out.println(" Enter the sales amount: ");
        sales_amount = sc.nextDouble();

        if (sales_amount >=50000){
            System.out.println(" Sales_commission = " + (50000 * 30) /100);
        } else if ( sales_amount >=30000){
            System.out.println(" Sales_commission = " + (30000 *20) /100);
        } else if (sales_amount >=10000){
            System.out.println(" Sales_commission = " + ( 10000 * 10) /100);
        }


    }
}

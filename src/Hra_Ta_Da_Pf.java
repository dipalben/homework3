import java.util.Scanner;

public class Hra_Ta_Da_Pf {

    public static void main(String[] args) {

        String name;
        int id;
        double basic_salary, HRA, TA, DA, PF, Gross_salary;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Employee name:");
        name = sc.next();
        System.out.println(" Enter id: ");
        id = sc.nextInt();
        System.out.println(" Enter basic salary : £ ");
        basic_salary = sc.nextDouble();
        HRA = (basic_salary * 10) / 100;
        DA = (basic_salary * 8) / 100;
        TA = (basic_salary * 9) / 100;
        PF = (basic_salary * 20) / 100;
        Gross_salary = basic_salary + HRA + TA + DA - PF;
        System.out.println(" HRA  = £" + HRA);
        System.out.println(" DA = £" + DA);
        System.out.println(" TA = £" + TA);
        System.out.println(" PF = £" + PF);
        System.out.println(" Gross_salary = " + Gross_salary);
    }
}
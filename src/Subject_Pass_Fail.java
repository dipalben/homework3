import java.util.Scanner;

public class Subject_Pass_Fail {


    private static Scanner sc;
    public static void main(String [] args) {
        String studentname;
        int geography, science, history, Rollno;
        float total, percentage;
        sc = new Scanner(System.in);
        System.out.println(" Enter student name: ");
        studentname = sc.next();
        System.out.println(" Enter student Roll no: ");
        Rollno = sc.nextInt();
        System.out.println(" Enter geography marks: ");
        geography = sc.nextInt();
        System.out.println(" Enter science marks: ");
        science = sc.nextInt();
        System.out.println(" Enter history marks: ");
        history = sc.nextInt();
        total = geography + science + history;
        percentage = (total / 300) * 100;

        System.out.println(" Total marks = " + total);
        System.out.println(" Percentage = " + percentage);

        if ((geography >=35) && (science >=35) && (history >=35)){

        System.out.println(" STUDENT PASS ");
    } else
        System.out.println(" STUDENT FAIL ");
    }   }
import java.util.Scanner;
import java.util.*;
public class MarkSheet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();

        System.out.print("Enter Your Roll No: ");
        int rollNo = input.nextInt();

        System.out.print("Enter English Mark: ");
        int english = input.nextInt();

        System.out.print("Enter Math Mark: ");
        int math = input.nextInt();

        System.out.print("Enter Urdu Mark: ");
        int urdu = input.nextInt();

        System.out.print("Enter Islamiat Mark: ");
        int islamiat = input.nextInt();

        System.out.print("Enter Science Mark: ");
        int science = input.nextInt();

        int totalMarks = english + math + urdu + islamiat + science;
        double percentage = (totalMarks / 500.0) * 100;

        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        // Print Beautiful MarkSheet
        System.out.println("\n=====================================================");
        System.out.println("|                  STUDENT MARKSHEET                |");
        System.out.println("=====================================================");
        System.out.printf("| %-15s : %-32s |\n", "Name", name);
        System.out.printf("| %-15s : %-32d |\n", "Roll No", rollNo);
        System.out.println("-----------------------------------------------------");
        System.out.printf("| %-20s | %-15s |\n", "Subject", "Marks");
        System.out.println("-----------------------------------------------------");
        System.out.printf("| %-20s | %-15d |\n", "English", english);
        System.out.printf("| %-20s | %-15d |\n", "Math", math);
        System.out.printf("| %-20s | %-15d |\n", "Urdu", urdu);
        System.out.printf("| %-20s | %-15d |\n", "Islamiat", islamiat);
        System.out.printf("| %-20s | %-15d |\n", "Science", science);
        System.out.println("-----------------------------------------------------");
        System.out.printf("| %-20s | %-15d |\n", "Total Marks", totalMarks);
        System.out.printf("| %-20s | %-14.2f%% |\n", "Percentage", percentage);
        System.out.printf("| %-20s | %-15s |\n", "Grade", grade);
        System.out.println("=====================================================");
        System.out.println("|               THANK YOU & BEST OF LUCK!           |");
        System.out.println("=====================================================");
    }
}

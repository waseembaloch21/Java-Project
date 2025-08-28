import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // float pi = 3.14;
        // System.out.println(pi);

        // char lett = 'W';
        // System.out.println(lett);

        // int num = 20;
        // int num1 = 30;
        // System.out.println("number"+(num+num1));

        // String name = "Waseem Baloch";
        // System.out.println(name);

        // int age = 15;
        // if (age == 18 ) {
        //      System.out.println("You are Adult");
        // }else{
        // System.out.println(" You are teenager");
        // }

        // int grade = 85;
        // if (grade >= 80) {
        //     System.out.println("A Grade");
        // } else if (grade >= 70) {
        //     System.out.println(" B Grade");
        // } else {
        //     System.out.println(" C Grade");
        // }

        // for (int i = 2; i <=20; i+=2) {
        //     System.out.println(i);
        // }

        // for (int i = 1; i < 10; i++) {
        //     System.out.println(i);
        // }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer:"); 
        int number1 = input.nextInt();

        System.out.println("Enter Second Integer:");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.println("Sum  is " + sum);

    }
}

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Grade Calculator");
        System.out.println("Enter marks- (out of 100)");
        System.out.println("Enter The Number of Subjects :");

        int totalsubject = sc.nextInt();
        float totalmarks = 0;

        for (int i=0;i<totalsubject;i++) {
            System.out.println("Enter the marks of subject" + ( i + 1 ) );
            int marks = sc.nextInt();
            totalmarks = totalmarks + marks;
        }

        float percent = totalmarks/totalsubject;
        System.out.println("Total marks are" +totalmarks);
        System.out.println("Percentage is :"+percent);
        if(percent>=95)
            System.out.println("Grade is A++");
        else if(percent<=90 && percent>=80)
            System.out.println("Grade is A+");
        else if(percent<=79 && percent>=70)
            System.out.println("Grade is A");
        else if(percent<=69 && percent>=60)
            System.out.println("Grade is B");
        else if(percent<=59 && percent>=50)
            System.out.println("Grade is C");
        else if(percent<=49 && percent>=35) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}

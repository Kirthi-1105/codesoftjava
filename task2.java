import java.util.Scanner;

public class Gradecalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the no.of subjects: ");
        int subjectCount = input.nextInt();


        int  Totalmarks = 0;
        int mark;


        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            mark = input.nextInt();


            while (mark < 0 || mark > 100) {
                System.out.print("Invalid score. Please enter input between 0 and 100: ");
                mark = input.nextInt();
            }

            Totalmarks += mark;
        }


        double average = (double)Totalmarks / subjectCount;


        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

      
        System.out.println("\n--- Report Card ---");
        System.out.println("Total Marks: " + Totalmarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}

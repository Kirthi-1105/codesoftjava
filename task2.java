import java.util.Scanner;

public class Task_2_Student_Grade_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        int totalscore = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter marks scored in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalscore += marks;
        }

        double averagePercentage = (double) totalscore / numOfSubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal score: " + totalscore);
        System.out.println("Average percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

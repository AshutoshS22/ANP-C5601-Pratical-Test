//write a switch case program in java showing student name and student marks as input.user will upload 10 students marks. 85% above marks students will be A grade , 75% to 84% students will be B grade , 65% to 74% will be C grade , 55% to 64%  will be D grade and below 40% will be E grade 

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] studentNames = new String[10];
        double[] studentMarks = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter " + studentNames[i] + "'s marks: ");
            studentMarks[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
        }
        for (int i = 0; i < 10; i++) {
            double marks = studentMarks[i];
            char grade;

            switch ((int) marks / 10) {
                case 9:
                case 10:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'E';
                    break;
            }

            System.out.println(studentNames[i] + " has received grade " + grade);
        }
    }
}

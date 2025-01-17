import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int totalWeightage = 0;
        int totalAssignments;
        Scanner scanner = new Scanner(System.in);
        Boolean bonus = false;
        String var;
        int bonusMarks = 0;
        int bonusGrade = 0;
        double finalAverage = 0.0;
        double weightedSum = 0.0;

    do {
        System.out.print("Begin by entering the amount of tasks you wish to input: ");
        totalAssignments = scanner.nextInt();
        scanner.nextLine();
        if (totalAssignments <= 1) {
            System.out.println("This gradebook only accepts a total amount of assignments greater than 1");
        }
    } while (totalAssignments <= 1);

        String[] assignmentName = new String [totalAssignments];
        int[] assignmentGrade = new int [totalAssignments];
        int[] assignmentWeight = new int [totalAssignments];

        if (bonus == false) {
            System.out.print("Are you given bonus marks in your final grade? (yes/no): ");
            var = scanner.nextLine();
            if (var.equals("yes")) {
                bonus = true;
            } else if (var.equals("no")) {
                bonus = false;
            } else {
                bonus = false;
                System.out.println("Warning: Unknown response, assuming no");
            }
        }

        if (bonus == true) {
            System.out.print("Please enter the additional weighting of bonus marks: ");
            bonusMarks = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Please enter the corresponding grade you received for the bonus: ");
            bonusGrade = scanner.nextInt();
            scanner.nextLine();
        }

    do {
        totalWeightage = 0;
        for (int i = 0; i < totalAssignments; i++) {
            System.out.print("Enter assignment name #" + (i + 1) + ": ");
            assignmentName[i] = scanner.nextLine();

        do {
            System.out.print("Enter the grade received for " + "'" + assignmentName[i] + "': ");
            assignmentGrade[i] = scanner.nextInt();
            scanner.nextLine();
        } while (assignmentGrade[i] > 100);

        do {
            System.out.print("Enter the weightage of " + "'" + assignmentName[i] + "': ");
            assignmentWeight[i] = scanner.nextInt();
            totalWeightage = totalWeightage + assignmentWeight[i];
            scanner.nextLine();
        } while (assignmentWeight[i] <= 0 || assignmentWeight[i] >= 100);
        }

    } while (totalWeightage + bonusMarks < 100);

    if (totalWeightage > 100 + bonusMarks) {
        System.out.println("Error: Weightage exceeded maximum capacity, closing menu.");
        System.exit(0);
    }
    System.out.printf("%-20s %-10s %-10s%n", "Assignment:", "Grade:", "Weight:");
    for (int j = 0; j < totalAssignments; j++) {
        System.out.printf("%-20s %-10s %-10s%n", 
        assignmentName[j], 
        assignmentGrade[j] + "%", 
        assignmentWeight[j] + "%");
   }
    if (bonus == true) {
        System.out.printf("%-20s %-10s %-10s%n", 
        "Bonus", 
        bonusGrade + "%", 
        bonusMarks + "%");
    }

    for (int k = 0; k < totalAssignments; k++) {
        weightedSum += assignmentGrade[k] * (assignmentWeight[k] / 100.0);
    }

    if (bonus == true) {
        weightedSum += bonusGrade * (bonusMarks / 100.0);
    }

    finalAverage = (weightedSum / totalWeightage) * 100;

    System.out.printf("%-20s %-10s %-10s%n", 
    "Bonus", 
    bonusGrade + "%", 
    bonusMarks + "%");

    System.out.printf("Final Average: %.2f%%%n", finalAverage);

    scanner.close();
    }
}

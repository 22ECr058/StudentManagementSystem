package student_basic;

import java.util.Scanner;

// Main class with console menu
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("\n========================================");
        System.out.println("  STUDENT MANAGEMENT SYSTEM");
        System.out.println("  Basic Java OOP - No Database");
        System.out.println("========================================");

        while (running) {
            // Display menu
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Search by Name");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Add Student
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter marks: ");
                    double marks = scanner.nextDouble();
                    scanner.nextLine();
                    manager.addStudent(name, course, marks);
                    break;

                case 2:
                    // View All
                    manager.viewAllStudents();
                    break;

                case 3:
                    // View by ID
                    System.out.print("Enter student ID: ");
                    int viewId = scanner.nextInt();
                    scanner.nextLine();
                    manager.viewStudentById(viewId);
                    break;

                case 4:
                    // Update
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new course: ");
                    String newCourse = scanner.nextLine();
                    System.out.print("Enter new marks: ");
                    double newMarks = scanner.nextDouble();
                    scanner.nextLine();
                    manager.updateStudent(updateId, newName, newCourse, newMarks);
                    break;

                case 5:
                    // Delete
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    manager.deleteStudent(deleteId);
                    break;

                case 6:
                    // Search
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchByName(searchName);
                    break;

                case 7:
                    // Exit
                    running = false;
                    System.out.println("Thank you! Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();
    }
}

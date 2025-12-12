package student_basic;

import java.util.ArrayList;

// Simple Student Management class
public class StudentManager {
    // ArrayList to store students - Collections Framework
    private ArrayList<Student> students;
    private int nextId;

    // Constructor
    public StudentManager() {
        students = new ArrayList<Student>();
        nextId = 1;
    }

    // Add student
    public void addStudent(String name, String course, double marks) {
        Student student = new Student(nextId, name, course, marks);
        students.add(student);
        System.out.println("Student added successfully! ID: " + nextId);
        nextId++;
    }

    // View all students
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        
        System.out.println("\n========== ALL STUDENTS ==========");
        for (Student student : students) {
            student.display();
        }
        System.out.println("Total Students: " + students.size());
    }

    // View student by ID
    public void viewStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("\nStudent found:");
                student.display();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Update student
    public void updateStudent(int id, String name, String course, double marks) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setCourse(course);
                student.setMarks(marks);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Delete student
    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Search by name
    public void searchByName(String name) {
        boolean found = false;
        System.out.println("\nSearch Results:");
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                student.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with name: " + name);
        }
    }
}

# Software Requirements Specification (SRS)
## Student Management System

---

### **Document Information**
- **Project Name:** Student Management System
- **Date:** December 12, 2025
- **Prepared By:** Development Team
- **Technology:** Java (Console-based Application)

---

## **1. Introduction**

### **1.1 Purpose**
This document provides a complete Software Requirements Specification for the Student Management System. It describes the functional and non-functional requirements of the system intended for educational purposes to demonstrate basic Object-Oriented Programming concepts in Java.

### **1.2 Scope**
The Student Management System is a console-based application that allows users to manage student records. The system provides functionalities to add, view, update, delete, and search student information without using any database (in-memory storage using ArrayList).

### **1.3 Definitions, Acronyms, and Abbreviations**
- **SRS:** Software Requirements Specification
- **OOP:** Object-Oriented Programming
- **ID:** Unique Identifier for each student
- **CRUD:** Create, Read, Update, Delete operations

### **1.4 References**
- Java SE Documentation
- Object-Oriented Programming Principles
- Collections Framework (ArrayList)

---

## **2. Overall Description**

### **2.1 Product Perspective**
The Student Management System is a standalone console application designed to manage student records in memory. It does not interact with external databases or systems.

### **2.2 Product Functions**
The system provides the following core functionalities:
1. Add new student records
2. View all student records
3. View individual student by ID
4. Update existing student information
5. Delete student records
6. Search students by name
7. Exit the application

### **2.3 User Characteristics**
The intended users are:
- Students learning Java programming
- Educational institutions for demonstration purposes
- Anyone requiring a simple student record management solution

### **2.4 Constraints**
- Console-based interface only
- No persistent storage (data lost on application exit)
- Single-user system (no concurrent access)
- Limited to in-memory storage capacity

### **2.5 Assumptions and Dependencies**
- Java Runtime Environment (JRE) 8 or higher is installed
- User has basic knowledge of console/terminal operations
- System has sufficient memory to store student records

---

## **3. System Features**

### **3.1 Student Registration**

#### **3.1.1 Description**
Allows users to add new student records to the system.

#### **3.1.2 Functional Requirements**
- **FR-1.1:** System shall accept student name as text input
- **FR-1.2:** System shall accept course name as text input
- **FR-1.3:** System shall accept marks as numeric input (double)
- **FR-1.4:** System shall auto-generate unique student ID
- **FR-1.5:** System shall display confirmation message with assigned ID
- **FR-1.6:** System shall store student data in ArrayList

#### **3.1.3 Input**
- Name (String)
- Course (String)
- Marks (Double)

#### **3.1.4 Output**
- Success message with auto-generated student ID

---

### **3.2 View All Students**

#### **3.2.1 Description**
Displays all student records currently stored in the system.

#### **3.2.2 Functional Requirements**
- **FR-2.1:** System shall display all student records in tabular format
- **FR-2.2:** System shall show ID, Name, Course, and Marks for each student
- **FR-2.3:** System shall display total count of students
- **FR-2.4:** System shall show appropriate message if no students exist

#### **3.2.3 Input**
- None

#### **3.2.4 Output**
- List of all students with their details
- Total student count

---

### **3.3 View Student by ID**

#### **3.3.1 Description**
Allows users to search and view a specific student's details using their ID.

#### **3.3.2 Functional Requirements**
- **FR-3.1:** System shall accept student ID as input
- **FR-3.2:** System shall search for student with matching ID
- **FR-3.3:** System shall display student details if found
- **FR-3.4:** System shall display "not found" message if ID doesn't exist

#### **3.3.3 Input**
- Student ID (Integer)

#### **3.3.4 Output**
- Student details or error message

---

### **3.4 Update Student Information**

#### **3.4.1 Description**
Allows users to modify existing student records.

#### **3.4.2 Functional Requirements**
- **FR-4.1:** System shall accept student ID to identify record
- **FR-4.2:** System shall accept new name, course, and marks
- **FR-4.3:** System shall update the student record if ID exists
- **FR-4.4:** System shall preserve the original student ID
- **FR-4.5:** System shall display confirmation or error message

#### **3.4.3 Input**
- Student ID (Integer)
- New Name (String)
- New Course (String)
- New Marks (Double)

#### **3.4.4 Output**
- Success or failure message

---

### **3.5 Delete Student**

#### **3.5.1 Description**
Allows users to remove student records from the system.

#### **3.5.2 Functional Requirements**
- **FR-5.1:** System shall accept student ID for deletion
- **FR-5.2:** System shall locate and remove student record if exists
- **FR-5.3:** System shall display confirmation or error message
- **FR-5.4:** Deleted records cannot be recovered

#### **3.5.3 Input**
- Student ID (Integer)

#### **3.5.4 Output**
- Success or failure message

---

### **3.6 Search by Name**

#### **3.6.1 Description**
Allows users to search for students using partial or full name matching.

#### **3.6.2 Functional Requirements**
- **FR-6.1:** System shall accept search term (name)
- **FR-6.2:** System shall perform case-insensitive search
- **FR-6.3:** System shall support partial name matching
- **FR-6.4:** System shall display all matching student records
- **FR-6.5:** System shall display message if no matches found

#### **3.6.3 Input**
- Search term (String)

#### **3.6.4 Output**
- List of matching students or "not found" message

---

### **3.7 Exit Application**

#### **3.7.1 Description**
Allows users to safely exit the application.

#### **3.7.2 Functional Requirements**
- **FR-7.1:** System shall close Scanner resource properly
- **FR-7.2:** System shall display goodbye message
- **FR-7.3:** System shall terminate the application
- **FR-7.4:** All data will be lost (no persistence)

---

## **4. Non-Functional Requirements**

### **4.1 Performance Requirements**
- **NFR-1.1:** System shall respond to user input within 1 second
- **NFR-1.2:** System shall support at least 1000 student records in memory
- **NFR-1.3:** Search operations shall complete within 2 seconds

### **4.2 Usability Requirements**
- **NFR-2.1:** Menu options shall be clearly numbered and labeled
- **NFR-2.2:** System shall provide clear prompts for user input
- **NFR-2.3:** Error messages shall be user-friendly and informative
- **NFR-2.4:** System shall handle invalid menu choices gracefully

### **4.3 Reliability Requirements**
- **NFR-3.1:** System shall handle invalid input types without crashing
- **NFR-3.2:** System shall validate all user inputs
- **NFR-3.3:** System shall prevent duplicate processing of operations

### **4.4 Maintainability Requirements**
- **NFR-4.1:** Code shall follow Java naming conventions
- **NFR-4.2:** Classes shall be properly encapsulated
- **NFR-4.3:** Code shall include appropriate comments
- **NFR-4.4:** System shall use standard Java collections (ArrayList)

### **4.5 Portability Requirements**
- **NFR-5.1:** System shall run on any platform with JRE 8+
- **NFR-5.2:** System shall use standard Java libraries only
- **NFR-5.3:** No platform-specific dependencies

---

## **5. System Architecture**

### **5.1 Class Structure**

#### **5.1.1 Student Class**
- **Purpose:** Represents individual student entity
- **Attributes:**
  - `id` (int) - Unique identifier
  - `name` (String) - Student name
  - `course` (String) - Course enrolled
  - `marks` (double) - Academic marks
- **Methods:**
  - Getters and Setters for all attributes
  - `display()` - Displays student information

#### **5.1.2 StudentManager Class**
- **Purpose:** Manages all student operations
- **Attributes:**
  - `students` (ArrayList<Student>) - Collection of students
  - `nextId` (int) - Auto-increment ID counter
- **Methods:**
  - `addStudent()` - Adds new student
  - `viewAllStudents()` - Displays all students
  - `viewStudentById()` - Finds student by ID
  - `updateStudent()` - Updates student information
  - `deleteStudent()` - Removes student
  - `searchByName()` - Searches by name

#### **5.1.3 Main Class**
- **Purpose:** Entry point and user interface
- **Methods:**
  - `main()` - Displays menu and handles user interactions

### **5.2 Data Flow**
1. User inputs choice from menu
2. Main class captures input
3. Appropriate StudentManager method is called
4. StudentManager performs operation on ArrayList
5. Result is displayed to user
6. Menu is displayed again (loop continues)

---

## **6. User Interface**

### **6.1 Main Menu**
```
========================================
  STUDENT MANAGEMENT SYSTEM
  Basic Java OOP - No Database
========================================

----- MENU -----
1. Add Student
2. View All Students
3. View Student by ID
4. Update Student
5. Delete Student
6. Search by Name
7. Exit
Enter choice:
```

### **6.2 Input Prompts**
- Clear and descriptive prompts for each input field
- Consistent format across all operations

### **6.3 Output Format**
- Structured display of student information
- Clear success/error messages
- Formatted lists and tables

### **6.4 Sample Output Examples**

#### **6.4.1 Add Student - Sample Output**
```
Enter choice: 1
Enter name: John Doe
Enter course: Computer Science
Enter marks: 85.5
Student added successfully! ID: 1
```

#### **6.4.2 View All Students - Sample Output**
```
Enter choice: 2

========== ALL STUDENTS ==========
ID: 1 | Name: John Doe | Course: Computer Science | Marks: 85.5
ID: 2 | Name: Jane Smith | Course: Mathematics | Marks: 92.0
ID: 3 | Name: Mike Johnson | Course: Physics | Marks: 78.5
Total Students: 3
```

#### **6.4.3 View All Students (Empty) - Sample Output**
```
Enter choice: 2
No students found.
```

#### **6.4.4 View Student by ID - Sample Output**
```
Enter choice: 3
Enter student ID: 1

Student found:
ID: 1 | Name: John Doe | Course: Computer Science | Marks: 85.5
```

#### **6.4.5 View Student by ID (Not Found) - Sample Output**
```
Enter choice: 3
Enter student ID: 99
Student with ID 99 not found.
```

#### **6.4.6 Update Student - Sample Output**
```
Enter choice: 4
Enter student ID to update: 1
Enter new name: John Smith
Enter new course: Software Engineering
Enter new marks: 88.0
Student updated successfully!
```

#### **6.4.7 Delete Student - Sample Output**
```
Enter choice: 5
Enter student ID to delete: 2
Student deleted successfully!
```

#### **6.4.8 Search by Name - Sample Output**
```
Enter choice: 6
Enter name to search: john

Search Results:
ID: 1 | Name: John Smith | Course: Software Engineering | Marks: 88.0
ID: 3 | Name: Mike Johnson | Course: Physics | Marks: 78.5
```

#### **6.4.9 Search by Name (Not Found) - Sample Output**
```
Enter choice: 6
Enter name to search: alice
No students found with name: alice
```

#### **6.4.10 Invalid Menu Choice - Sample Output**
```
Enter choice: 9
Invalid choice! Try again.
```

#### **6.4.11 Exit Application - Sample Output**
```
Enter choice: 7
Thank you! Goodbye.
```

#### **6.4.12 Complete Session Example**
```
========================================
  STUDENT MANAGEMENT SYSTEM
  Basic Java OOP - No Database
========================================

----- MENU -----
1. Add Student
2. View All Students
3. View Student by ID
4. Update Student
5. Delete Student
6. Search by Name
7. Exit
Enter choice: 1
Enter name: Alice Brown
Enter course: Data Science
Enter marks: 91.5
Student added successfully! ID: 1

----- MENU -----
1. Add Student
2. View All Students
3. View Student by ID
4. Update Student
5. Delete Student
6. Search by Name
7. Exit
Enter choice: 1
Enter name: Bob Wilson
Enter course: Artificial Intelligence
Enter marks: 87.0
Student added successfully! ID: 2

----- MENU -----
1. Add Student
2. View All Students
3. View Student by ID
4. Update Student
5. Delete Student
6. Search by Name
7. Exit
Enter choice: 2

========== ALL STUDENTS ==========
ID: 1 | Name: Alice Brown | Course: Data Science | Marks: 91.5
ID: 2 | Name: Bob Wilson | Course: Artificial Intelligence | Marks: 87.0
Total Students: 2

----- MENU -----
1. Add Student
2. View All Students
3. View Student by ID
4. Update Student
5. Delete Student
6. Search by Name
7. Exit
Enter choice: 7
Thank you! Goodbye.
```

---

## **7. Data Requirements**

### **7.1 Data Storage**
- **Storage Type:** In-memory (ArrayList)
- **Persistence:** None (data lost on exit)
- **Capacity:** Limited by available heap memory

### **7.2 Data Validation**
- Student ID must be unique and auto-generated
- Marks should be numeric (double type)
- Name and Course should be non-empty strings

---

## **8. Error Handling**

### **8.1 Input Validation**

#### **8.1.1 Invalid Menu Choice**
- **Error Type:** Invalid integer selection
- **Validation:** Check if choice is between 1-7
- **Handling:** Display "Invalid choice! Try again." message
- **Recovery:** Return to main menu and re-prompt user
- **Example:** User enters 9 or 0

#### **8.1.2 Invalid Data Type**
- **Error Type:** InputMismatchException
- **Validation:** Scanner type checking for int/double inputs
- **Handling:** Catch exception and clear scanner buffer
- **Recovery:** Prompt user to enter correct data type
- **Example:** User enters text when number is expected

#### **8.1.3 Empty or Null Input**
- **Error Type:** Empty string input
- **Validation:** Check for null or empty strings
- **Handling:** Accept but may lead to empty name/course fields
- **Recovery:** Allow operation but warn user
- **Example:** User presses Enter without typing

#### **8.1.4 Negative or Invalid Marks**
- **Error Type:** Invalid marks value
- **Validation:** Check if marks are within valid range (0-100)
- **Handling:** Currently accepts any double value
- **Recovery:** Store as-is (enhancement needed)
- **Example:** User enters -50 or 150

#### **8.1.5 Non-existent Student ID**
- **Error Type:** ID not found in ArrayList
- **Validation:** Linear search through student list
- **Handling:** Display "Student with ID X not found"
- **Recovery:** Return to main menu
- **Example:** User searches for ID that doesn't exist

#### **8.1.6 Empty Search Results**
- **Error Type:** No matching records
- **Validation:** Check if any student matches search criteria
- **Handling:** Display "No students found with name: X"
- **Recovery:** Return to main menu
- **Example:** Searching for non-existent name

### **8.2 Edge Cases**

#### **8.2.1 Empty Student List**
- **Scenario:** Performing operations on empty list
- **Affected Operations:** View All, Search
- **Handling:** Display "No students found."
- **Impact:** No data processing errors

#### **8.2.2 Duplicate Operations**
- **Scenario:** Deleting already deleted student
- **Validation:** Check if ID exists before deletion
- **Handling:** Display "Student with ID X not found"
- **Prevention:** ID validation before operation

#### **8.2.3 Memory Overflow**
- **Scenario:** Adding too many students
- **Limitation:** Heap memory constraint
- **Handling:** System may throw OutOfMemoryError
- **Prevention:** Monitor ArrayList size (future enhancement)

#### **8.2.4 Scanner Buffer Issues**
- **Scenario:** Multiple nextInt() followed by nextLine()
- **Issue:** Leftover newline characters
- **Handling:** scanner.nextLine() after each nextInt()/nextDouble()
- **Implementation:** Already handled in Main.java

#### **8.2.5 Integer Overflow for ID**
- **Scenario:** Generating IDs beyond Integer.MAX_VALUE
- **Limitation:** ID counter uses int type
- **Handling:** Will overflow after 2,147,483,647 students
- **Probability:** Extremely unlikely in this application

### **8.3 Error Messages**

#### **8.3.1 Standard Error Messages**
| Error Scenario | Message |
|----------------|---------|
| Invalid menu choice | "Invalid choice! Try again." |
| Student not found (by ID) | "Student with ID X not found." |
| Student not found (by name) | "No students found with name: X" |
| No students in system | "No students found." |
| Successful add | "Student added successfully! ID: X" |
| Successful update | "Student updated successfully!" |
| Successful delete | "Student deleted successfully!" |

#### **8.3.2 System Error Messages**
| Error Type | Message | Handling |
|------------|---------|----------|
| InputMismatchException | Scanner internal error | Clear buffer, re-prompt |
| OutOfMemoryError | Java heap space | Application crash (unlikely) |
| NullPointerException | Should not occur | Defensive programming needed |

### **8.4 Exception Handling Strategy**

#### **8.4.1 Current Implementation**
- **Try-Catch Blocks:** Not explicitly implemented
- **Scanner Validation:** Built-in type checking
- **Null Checks:** Minimal validation
- **Error Recovery:** Menu loop allows retry

#### **8.4.2 Recommended Enhancements**
1. **Input Validation:**
   - Add try-catch for InputMismatchException
   - Validate marks range (0-100)
   - Check for empty strings
   
2. **Bounds Checking:**
   - Validate menu choice range
   - Check ArrayList capacity
   
3. **Data Integrity:**
   - Prevent null values
   - Sanitize string inputs
   - Validate ID uniqueness

4. **User Feedback:**
   - More descriptive error messages
   - Color-coded console output (future)
   - Error logging (future)

### **8.5 Error Recovery Mechanisms**

#### **8.5.1 Graceful Degradation**
- Application continues running after errors
- Menu loop provides continuous recovery point
- No data corruption on invalid operations

#### **8.5.2 Data Consistency**
- ArrayList operations are atomic
- Failed operations don't modify data
- ID counter only increments on successful add

#### **8.5.3 User Guidance**
- Clear prompts for expected input format
- Descriptive error messages
- Immediate feedback on operations

---

## **9. Testing Requirements**

### **9.1 Functional Testing**
- Test all CRUD operations
- Test search functionality
- Test menu navigation
- Test input validation

### **9.2 Test Cases**

#### **TC-1: Add Student**
- Input: Valid name, course, marks
- Expected: Student added with auto-generated ID

#### **TC-2: View All (Empty)**
- Input: Option 2 with no students
- Expected: "No students found" message

#### **TC-3: View All (With Data)**
- Input: Option 2 with existing students
- Expected: List of all students displayed

#### **TC-4: Update Student**
- Input: Existing ID and new data
- Expected: Student information updated

#### **TC-5: Delete Student**
- Input: Existing student ID
- Expected: Student removed from list

#### **TC-6: Search by Name**
- Input: Partial or full name
- Expected: Matching students displayed

#### **TC-7: Invalid Menu Choice**
- Input: Number outside 1-7 range
- Expected: Error message and menu re-displayed

---

## **10. Constraints and Limitations**

### **10.1 Technical Constraints**
- No database connectivity
- No file I/O for persistence
- Console-based interface only
- Single-threaded execution

### **10.2 Functional Limitations**
- No user authentication
- No data backup/restore
- No export functionality
- No batch operations
- Limited to basic student information

### **10.3 Future Enhancements**
- Database integration (MySQL/PostgreSQL)
- File-based persistence
- GUI implementation
- Advanced search filters
- Grade calculation features
- Attendance tracking
- Report generation

---

## **11. Glossary**

| Term | Definition |
|------|------------|
| Student | An individual enrolled in a course |
| ID | Auto-generated unique identifier for each student |
| CRUD | Create, Read, Update, Delete operations |
| ArrayList | Java collection class for dynamic arrays |
| Encapsulation | OOP principle of data hiding |
| Scanner | Java class for reading user input |

---

## **12. Appendix**

### **12.1 System Requirements**
- **Operating System:** Windows/Linux/macOS
- **Java Version:** JDK/JRE 8 or higher
- **Memory:** Minimum 128 MB RAM
- **Disk Space:** 10 MB

### **12.2 Installation**
1. Ensure Java is installed
2. Compile all Java files: `javac student_basic/*.java`
3. Run application: `java student_basic.Main`

### **12.3 Package Structure**
```
student_basic/
├── Main.java
├── Student.java
└── StudentManager.java
```

---

**End of Document**

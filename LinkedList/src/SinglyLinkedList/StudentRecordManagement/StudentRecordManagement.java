package SinglyLinkedList.StudentRecordManagement;

public class StudentRecordManagement {

    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        // Adding students
        studentList.addStudentAtBeginning(1, "Alice", 20, "A");
        studentList.addStudentAtEnd(2, "Bob", 21, "B");
        studentList.addStudentAtPosition(2, 3, "Charlie", 22, "A+");

        // Display all students
        studentList.displayAllStudents();

        // Search for a student
        studentList.searchStudentByRollNumber(2);

        // Update a student's grade
        studentList.updateStudentGrade(2, "A");

        // Delete a student
        studentList.deleteStudentByRollNumber(1);

        // Display all students after deletion
        studentList.displayAllStudents();
    }
}

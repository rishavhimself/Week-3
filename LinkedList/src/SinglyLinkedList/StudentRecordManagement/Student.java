package SinglyLinkedList.StudentRecordManagement;

class Student {
    public int rollNumber;
     public String name;
    public int age;
    public String grade;
    public Student next; // Pointer to the next node

    // Constructor to initialize a student node
    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
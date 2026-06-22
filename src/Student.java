public class Student {
    private String name;
    private int rollNumber;
    private String faculty;

    // Constructor
    public Student(String name, int rollNumber, String faculty) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.faculty = faculty;
    }

    // Getters
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public String getFaculty() { return faculty; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Faculty: " + faculty);
    }

    public static void main(String[] args) {
        Student s = new Student("Abhinab", 101, "IT");
        s.displayProfile();
    }
}
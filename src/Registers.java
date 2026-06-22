import java.util.ArrayList;

class Course {
    String courseName;
    Course(String courseName) { this.courseName = courseName; }
}

class Register {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Register(String name) { this.name = name; }

    void registerCourse(Course c) { courses.add(c); }

    void displayCourses() {
        System.out.println(name + "'s courses:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }

    public static void main(String[] args) {
        Register s = new Register("Abhinab");
        s.registerCourse(new Course("OOP"));
        s.registerCourse(new Course("Networking"));
        s.displayCourses();
    }
}
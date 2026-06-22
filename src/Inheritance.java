class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayDetails() {
        System.out.println("Employee: " + name);
    }
}

class Teacher extends Employee {
    Teacher(String name) {
        super(name);
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher: " + name);
    }
}

class AdminStaff extends Employee {
    AdminStaff(String name) {
        super(name);
    }

    @Override
    void displayDetails() {
        System.out.println("Admin Staff: " + name);
    }
}

public class  Inheritance {
    public static void main(String[] args) {
        Teacher t = new Teacher("Ram");
        AdminStaff a = new AdminStaff("Sita");
        t.displayDetails();
        a.displayDetails();
    }
}
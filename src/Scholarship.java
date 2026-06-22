abstract class Scholarship {
    String studentName;
    Scholarship(String name) { this.studentName = name; }
    abstract void checkEligibility(double gpa, double income);
}

class MeritScholarship extends Scholarship {
    MeritScholarship(String name) { super(name); }

    @Override
    void checkEligibility(double gpa, double income) {
        System.out.println(studentName + " Merit: " + (gpa >= 3.5 ? "Eligible" : "Not Eligible"));
    }
}

class NeedBasedScholarship extends Scholarship {
    NeedBasedScholarship(String name) { super(name); }

    @Override
    void checkEligibility(double gpa, double income) {
        System.out.println(studentName + " Need-Based: " + (income < 30000 ? "Eligible" : "Not Eligible"));
    }
}

class ScholarshipMain {
    public static void main(String[] args) {
        Scholarship m = new MeritScholarship("Abhinab");
        Scholarship n = new NeedBasedScholarship("Abhinab");
        m.checkEligibility(3.8, 25000);
        n.checkEligibility(3.8, 25000);
    }
}
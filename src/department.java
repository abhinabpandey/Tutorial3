interface ResultProcessor {
    void calculateGrade(int marks);
}

class EngineeringDepartment implements ResultProcessor {
    public void calculateGrade(int marks) {
        System.out.println("Engineering Grade: " + (marks >= 60 ? "Pass" : "Fail"));
    }
}

class ManagementDepartment implements ResultProcessor {
    public void calculateGrade(int marks) {
        System.out.println("Management Grade: " + (marks >= 50 ? "Pass" : "Fail"));
    }
}

class Main {
    public static void main(String[] args) {
        ResultProcessor eng = new EngineeringDepartment();
        ResultProcessor mgmt = new ManagementDepartment();
        eng.calculateGrade(55);
        mgmt.calculateGrade(55);
    }
}
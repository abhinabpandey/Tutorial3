class UniqueStudent {
    private static int counter = 1000;
    private int studentId;
    private String name;

    UniqueStudent(String name) {
        this.name = name;
        this.studentId = counter++;
    }

    void display() {
        System.out.println("ID: " + studentId + ", Name: " + name);
    }

    public static void main(String[] args) {
        UniqueStudent s1 = new UniqueStudent("Abhinab");
        UniqueStudent s2 = new UniqueStudent("Ram");
        UniqueStudent s3 = new UniqueStudent("Sita");
        s1.display();
        s2.display();
        s3.display();
    }
}
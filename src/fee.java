abstract class StudentFee {
    String name;
    StudentFee(String name) { this.name = name; }
    abstract double calculateFee();
}

class Undergraduate extends StudentFee {
    Undergraduate(String name) { super(name); }
    double calculateFee() { return 50000; }
}

class Graduate extends StudentFee {
    Graduate(String name) { super(name); }
    double calculateFee() { return 75000; }
}

class Main2 {
    public static void main(String[] args) {
        StudentFee u = new Undergraduate("Ram");
        StudentFee g = new Graduate("Sita");
        System.out.println(u.name + " Fee: " + u.calculateFee());
        System.out.println(g.name + " Fee: " + g.calculateFee());
    }
}
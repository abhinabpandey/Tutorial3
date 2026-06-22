class Member {
    String name;
    Member(String name) { this.name = name; }
    int borrowLimit() { return 2; }
}

class StudentMember extends Member {
    StudentMember(String name) { super(name); }
    int borrowLimit() { return 3; }
}

class TeacherMember extends Member {
    TeacherMember(String name) { super(name); }
    int borrowLimit() { return 10; }
}

class LibraryMain {   // ← renamed from Main to LibraryMain
    public static void main(String[] args) {
        Member s = new StudentMember("Abhinab");
        Member t = new TeacherMember("Sir Raj");
        System.out.println(s.name + " can borrow: " + s.borrowLimit());
        System.out.println(t.name + " can borrow: " + t.borrowLimit());
    }
}
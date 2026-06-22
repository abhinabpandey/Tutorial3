class Attendance {
    int present, total;
    Attendance(int present, int total) {
        this.present = present;
        this.total = total;
    }
    double calculateAttendance() { return (present * 100.0) / total; }
}

class EngineeringAttendance extends Attendance {
    EngineeringAttendance(int present, int total) { super(present, total); }

    @Override
    double calculateAttendance() {
        double percent = (present * 100.0) / total;
        System.out.println("Engineering Attendance: " + percent + "%");
        return percent;
    }
}

class MedicalAttendance extends Attendance {
    MedicalAttendance(int present, int total) { super(present, total); }

    @Override
    double calculateAttendance() {
        double percent = (present * 100.0) / total;
        System.out.println("Medical Attendance: " + percent + "%");
        return percent;
    }
}

class AttendanceMain {
    public static void main(String[] args) {
        new EngineeringAttendance(45, 60).calculateAttendance();
        new MedicalAttendance(78, 80).calculateAttendance();
    }
}



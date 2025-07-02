package Java_Inheritance;

class Course {
    String courseName;
    int duration; // in weeks
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}

public class CourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse();
        poc.courseName = "Advanced Java";
        poc.duration = 6;
        poc.platform = "Udemy";
        poc.isRecorded = true;
        poc.fee = 200;
        poc.discount = 20;
        poc.displayCourseDetails();
    }
}
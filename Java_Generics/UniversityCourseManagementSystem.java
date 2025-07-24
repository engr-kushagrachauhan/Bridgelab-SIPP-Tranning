package Java_Generics;
abstract class CourseType {
    String title;
    public CourseType(String title) {
        this.title = title;
    }
    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    public ExamCourse(String title) { super(title); }
    public void evaluate() { System.out.println("Exam based: " + title); }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) { super(title); }
    public void evaluate() { System.out.println("Assignment based: " + title); }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title) { super(title); }
    public void evaluate() { System.out.println("Research based: " + title); }
}

class Course<T extends CourseType> {
    private T courseType;
    public Course(T courseType) {
        this.courseType = courseType;
    }
    public void showEvaluation() {
        courseType.evaluate();
    }
}
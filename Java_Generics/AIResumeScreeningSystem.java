package Java_Generics;
abstract class JobRole {
    String candidateName;
    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }
    public abstract void review();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) { super(name); }
    public void review() { System.out.println("Reviewing for SE: " + candidateName); }
}

class DataScientist extends JobRole {
    public DataScientist(String name) { super(name); }
    public void review() { System.out.println("Reviewing for DS: " + candidateName); }
}

class ProductManager extends JobRole {
    public ProductManager(String name) { super(name); }
    public void review() { System.out.println("Reviewing for PM: " + candidateName); }
}

class Resume<T extends JobRole> {
    private T role;
    public Resume(T role) { this.role = role; }
    public void process() { role.review(); }

    public static void reviewAll(java.util.List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            role.review();
        }
    }
}
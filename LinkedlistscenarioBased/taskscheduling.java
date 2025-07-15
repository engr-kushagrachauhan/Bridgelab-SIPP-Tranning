package LinkedlistscenarioBased;
import java.util.LinkedList;
import java.util.ListIterator;

public class taskscheduling {

    interface Task { void execute(); }

    static class EmailTask implements Task {
        private final String to; EmailTask(String to) { this.to = to; }
        public void execute() { System.out.println("📧  Sending email to " + to); }
        @Override public String toString() { return "Email(" + to + ")"; }
    }
    static class BackupTask implements Task {
        public void execute() { System.out.println("💾  Running database backup"); }
        @Override public String toString() { return "Backup"; }
    }

    static class TaskScheduler {
        private final LinkedList<Task> tasks = new LinkedList<>();

        public void addTask(Task t) { tasks.addLast(t); }
        public void addTaskAt(int index, Task t) {
            if (index < 0 || index > tasks.size()) throw new IndexOutOfBoundsException();
            tasks.add(index, t);
        }

        public void removeTask(int index) { tasks.remove(index); }

        public void reprioritize(int fromIndex, int toIndex) {
            if (fromIndex == toIndex) return;
            Task t = tasks.remove(fromIndex);
            tasks.add(toIndex, t);
        }

        public void executeNextTask() {
            if (tasks.isEmpty()) { System.out.println("No tasks."); return; }
            Task t = tasks.removeFirst();
            t.execute();
        }

        public void listTasks() {
            ListIterator<Task> it = tasks.listIterator();
            while (it.hasNext())
                System.out.println(it.nextIndex() + ": " + it.next());
        }
    }

    public static void main(String[] args) {
        TaskScheduler s = new TaskScheduler();
        s.addTask(new BackupTask());
        s.addTask(new EmailTask("alice@example.com"));
        s.addTaskAt(1, new EmailTask("bob@example.com"));

        System.out.println("Initial queue:");
        s.listTasks();

        s.reprioritize(2, 0);   
        System.out.println("\nAfter reprioritize:");
        s.listTasks();

        System.out.println("\nExecuting tasks:");
        while (true) s.executeNextTask();
    }
}

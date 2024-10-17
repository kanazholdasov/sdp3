import java.util.List;

public interface TaskMediator {
    void addTask(Task task);
    void removeTask(Task task);
    void processTasks();
    List<Task> getTasks();  // To return list of tasks for iterator
}

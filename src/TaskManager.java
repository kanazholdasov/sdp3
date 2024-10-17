import java.util.ArrayList;
import java.util.List;

public class TaskManager implements TaskMediator {
    private TaskHandler firstHandler;
    private List<Task> tasks;

    public TaskManager(TaskHandler firstHandler) {
        this.firstHandler = firstHandler;
        this.tasks = new ArrayList<>();
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public void processTasks() {
        for (Task task : tasks) {
            firstHandler.handleTask(task);
        }
    }

    @Override
    public List<Task> getTasks() {
        return tasks;
    }
}

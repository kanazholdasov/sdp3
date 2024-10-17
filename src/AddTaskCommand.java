public class AddTaskCommand implements Command {
    private Task task;
    private TaskManager taskManager;

    public AddTaskCommand(Task task, TaskManager taskManager) {
        this.task = task;
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        taskManager.addTask(task);
        System.out.println("Task added: " + task.getName());
    }
}

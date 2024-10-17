public class RemoveTaskCommand implements Command {
    private Task task;
    private TaskManager taskManager;

    public RemoveTaskCommand(Task task, TaskManager taskManager) {
        this.task = task;
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        taskManager.removeTask(task);
        System.out.println("Task removed: " + task.getName());
    }
}

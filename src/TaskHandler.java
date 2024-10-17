public abstract class TaskHandler {
    protected TaskHandler nextHandler;

    public void setNextHandler(TaskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleTask(Task task) {
        if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}

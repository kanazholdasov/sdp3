public class HighPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Priority.HIGH) {
            System.out.println("High priority task processed: " + task.getName());
        } else {
            super.handleTask(task);
        }
    }
}

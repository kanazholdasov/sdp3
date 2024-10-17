public class LowPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Priority.LOW) {
            System.out.println("Low priority task processed: " + task.getName());
        } else {
            super.handleTask(task);
        }
    }
}

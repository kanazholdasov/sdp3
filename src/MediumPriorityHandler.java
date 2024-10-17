public class MediumPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Priority.MEDIUM) {
            System.out.println("Medium priority task processed: " + task.getName());
        } else {
            super.handleTask(task);
        }
    }
}

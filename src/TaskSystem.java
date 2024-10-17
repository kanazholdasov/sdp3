public class TaskSystem {
    public static void main(String[] args) {
        TaskHandler lowPriorityHandler = new LowPriorityHandler();
        TaskHandler mediumPriorityHandler = new MediumPriorityHandler();
        TaskHandler highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNextHandler(mediumPriorityHandler);
        mediumPriorityHandler.setNextHandler(highPriorityHandler);

        TaskManager taskManager = new TaskManager(lowPriorityHandler);

        Task task1 = new Task("Task 1", Priority.LOW);
        Task task2 = new Task("Task 2", Priority.HIGH);

        Command addTask1 = new AddTaskCommand(task1, taskManager);
        Command addTask2 = new AddTaskCommand(task2, taskManager);

        addTask1.execute();
        addTask2.execute();

        taskManager.processTasks();

        TaskIterator iterator = new TaskListIterator(taskManager.getTasks());
        System.out.println("Iterating over tasks:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}

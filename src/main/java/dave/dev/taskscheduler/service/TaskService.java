package dave.dev.taskscheduler.service;

import dave.dev.taskscheduler.model.Task;

import java.util.List;

public interface TaskService {
    Task schedulerTask(Task task);

    Task scheduleTask(Task task);

    List<Task> getAllTasks();
    Task getTaskById(Long id);
    void deleteTask(Long id);
}

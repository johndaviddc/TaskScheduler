package dave.dev.taskscheduler.service;

import dave.dev.taskscheduler.model.Task;
import dave.dev.taskscheduler.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task scheduleTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new CustomException("Task not found"));
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

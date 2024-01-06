package dave.dev.taskscheduler.controller;

import dave.dev.taskscheduler.model.Task;
import dave.dev.taskscheduler.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task scheduleTask(@RequestBody Task task) {
        return taskService.schedulerTask(task);
    }
}

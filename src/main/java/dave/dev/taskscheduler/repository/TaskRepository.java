package dave.dev.taskscheduler.repository;

import dave.dev.taskscheduler.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

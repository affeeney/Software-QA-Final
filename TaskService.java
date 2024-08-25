import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    //add a new task
    public Task addTask(String id, String name, String description) {
        Task task = new Task(id, name, description);
        tasks.add(task);
        return task;
    }

    //update a task by id
    public Optional<Task> updateTaskById(String id, String name, String description) {
        Optional<Task> taskOptional = tasks.stream().filter(task -> task.getId().equals(id)).findFirst();
        taskOptional.ifPresent(task -> {
            task.setName(name);
            task.setDescription(description);
        });
        return taskOptional;
    }

    //delete a task by id
    public boolean deleteTask(String id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }
}

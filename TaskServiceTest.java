import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

public class TaskServiceTest {
    private TaskService taskService;

    @BeforeEach
    public void setUp() {
        taskService = new TaskService();
    }

    @Test
    public void testAddTask() {
        Task task = taskService.addTask("1", "name", "desc");
        assertNotNull(task);
        assertEquals("1", task.getId());
        assertEquals("name", task.getName());
        assertEquals("desc", task.getDescription());
    }

    @Test
    public void testUpdateTask() {
        taskService.addTask("1", "name", "desc");
        Optional<Task> updatedTask = taskService.updateTaskById("1", "new name", "new desc");
        assertTrue(updatedTask.isPresent());
        assertEquals("new name", updatedTask.get().getName());
        assertEquals("new desc", updatedTask.get().getDescription());
    }

    @Test
    public void testUpdateTaskNonExistentId() {
        Optional<Task> updatedTask = taskService.updateTaskById("999", "new name", "new desc");
        assertFalse(updatedTask.isPresent());
    }

    @Test
    public void testDeleteTask() {
        taskService.addTask("1", "name", "desc");
        boolean isDeleted = taskService.deleteTask("1");
        assertTrue(isDeleted);
    }

    @Test
    public void testDeleteTaskNonExistentId() {
        boolean isDeleted = taskService.deleteTask("999");
        assertFalse(isDeleted);
    }
}

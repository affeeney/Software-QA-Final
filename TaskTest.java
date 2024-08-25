import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    
    @Test
    public void testTaskCreation() {
        Task task = new Task("1", "name", "desc");
        assertEquals("1", task.getId());
        assertEquals("name", task.getName());
        assertEquals("desc", task.getDescription());
    }

    @Test
    public void testSetName() {
        Task task = new Task("1", "name", "desc");
        task.setName("new name");
        assertEquals("new name", task.getName());
    }

    @Test
    public void testSetNameInvalid() {
        Task task = new Task("1", "name", "desc");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            task.setName(null);
        });
        assertEquals("invalid name", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            task.setName("this name is too long");
        });
        assertEquals("invalid name", exception.getMessage());
    }

    @Test
    public void testSetDescription() {
        Task task = new Task("1", "name", "desc");
        task.setDescription("new desc");
        assertEquals("new desc", task.getDescription());
    }

    @Test
    public void testSetDescriptionInvalid() {
        Task task = new Task("1", "name", "desc");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            task.setDescription(null);
        });
        assertEquals("invalid description", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            task.setDescription("this description is way too long for the task");
        });
        assertEquals("invalid description", exception.getMessage());
    }
}

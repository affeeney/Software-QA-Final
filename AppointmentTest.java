import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class AppointmentTest {

    @Test
    public void testAppointmentCreation() {
        String id = "1234567890";
        Date date = new Date(System.currentTimeMillis() + 1000); 
        String description = "This is a description";

        Appointment appointment = new Appointment(id, date, description);

        assertNotNull(appointment);
        assertEquals(id, appointment.getId());
        assertEquals(date, appointment.getDate());
        assertEquals(description, appointment.getDescription());
    }

    @Test
    public void testInvalidIdCreation() {

        try {
            String id = "1234567890123"; //invalid id
            Date date = new Date(System.currentTimeMillis() + 1000); 
            String description = "This is a description";
            new Appointment(id, date, description);
            fail("Exception not thrown for invalid ID");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Invalid id", e.getMessage());
        }
    }
}    


    
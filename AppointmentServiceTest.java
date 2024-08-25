import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class AppointmentServiceTest {

    @Test
    public void testAddAppointment() {
        AppointmentService service = new AppointmentService();
        String id = "1234567890";
        Date date = new Date(System.currentTimeMillis() + 1000); 
        String description = "This is a description";

        Appointment appointment = new Appointment(id, date, description);
        service.addAppointment(id, appointment);

        assertNotNull(service.getAppointments().get(id));
    }


    @Test
    public void testDeleteAppointmentById() {
        AppointmentService service = new AppointmentService();
        String id = "1234567890";
        Date date = new Date(System.currentTimeMillis() + 1000); 
        String description = "This is a description";

        Appointment appointment = new Appointment(id, date, description);
        service.addAppointment(id, appointment);

        service.deleteAppointmentById(id);
        assertNull(service.getAppointments().get(id));
    }
}

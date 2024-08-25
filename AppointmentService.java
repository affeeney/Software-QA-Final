import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private Map<String, Appointment> appointments; 

    public AppointmentService() {
        appointments = new HashMap<>();        
    }

    public void addAppointment(String id, Appointment appointment) {
        if (appointments.containsKey(appointment.getId())) {
            throw new IllegalArgumentException("id in use");
        }
        appointments.put(appointment.getId(), appointment);
    }

    public void deleteAppointmentById(String id) {
        if (!appointments.containsKey(id)) {
            throw new IllegalArgumentException("Does not exist");
        }
        appointments.remove(id);
    }

    public Map<String, Appointment> getAppointments() {
        return appointments;
    }
    
}

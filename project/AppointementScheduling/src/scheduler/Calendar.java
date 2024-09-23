package scheduler;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Appointment> appointments;

    public Calendar() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Appointments:\n");
        for (Appointment appointment : appointments) {
            sb.append(appointment.toString()).append("\n");
        }
        return sb.toString();
    }
}

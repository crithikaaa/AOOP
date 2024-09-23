package scheduler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentScheduler {
    private Calendar calendar;
    private List<Reminder> reminders;

    public AppointmentScheduler() {
        this.calendar = new Calendar();
        this.reminders = new ArrayList<>();
    }

    public void createAppointment(String title, String description, LocalDateTime dateTime) {
        Appointment appointment = new Appointment(title, description, dateTime);
        calendar.addAppointment(appointment);
    }

    public void createReminder(Appointment appointment, LocalDateTime reminderTime) {
        Reminder reminder = new Reminder(appointment, reminderTime);
        reminders.add(reminder);
    }

    public List<Appointment> getAppointments() {
        return calendar.getAppointments();
    }

    public List<Reminder> getReminders() {
        return reminders;
    }

    public Calendar getCalendar() {
        return calendar;
    }
}

package scheduler;

import java.time.LocalDateTime;

public class Reminder {
    private Appointment appointment;
    private LocalDateTime reminderTime;

    public Reminder(Appointment appointment, LocalDateTime reminderTime) {
        this.appointment = appointment;
        this.reminderTime = reminderTime;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public LocalDateTime getReminderTime() {
        return reminderTime;
    }

    @Override
    public String toString() {
        return "Reminder for " + appointment.getTitle() + " at " + reminderTime;
    }
}

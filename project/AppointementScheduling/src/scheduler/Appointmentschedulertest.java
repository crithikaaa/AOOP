package scheduler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentSchedulerTest {

    private AppointmentScheduler scheduler;

    @BeforeEach
    void setUp() {
        scheduler = new AppointmentScheduler();
    }

    @Test
    void testCreateAppointment() {
        scheduler.createAppointment("Doctor's Appointment", "Visit Dr. Smith", LocalDateTime.of(2024, 8, 20, 10, 30));
        assertEquals(1, scheduler.getAppointments().size(), "Appointment list should contain 1 appointment");
    }

    @Test
    void testCreateReminder() {
        Appointment appointment = new Appointment("Doctor's Appointment", "Visit Dr. Smith", LocalDateTime.of(2024, 8, 20, 10, 30));
        scheduler.createReminder(appointment, LocalDateTime.of(2024, 8, 20, 9, 30));
        assertEquals(1, scheduler.getReminders().size(), "Reminder list should contain 1 reminder");
    }

    @Test
    void testAppointmentInCalendar() {
        scheduler.createAppointment("Doctor's Appointment", "Visit Dr. Smith", LocalDateTime.of(2024, 8, 20, 10, 30));
        assertTrue(scheduler.getCalendar().getAppointments().contains(scheduler.getAppointments().get(0)), "Appointment should be in calendar");
    }
}

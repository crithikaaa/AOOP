package scheduler;

import java.time.LocalDateTime;

public class Appointment {
    private String title;
    private String description;
    private LocalDateTime dateTime;

    public Appointment(String title, String description, LocalDateTime dateTime) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Appointment: " + title + " on " + dateTime + " - " + description;
    }
}

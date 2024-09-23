package scheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        while (true) {
            System.out.println("\nAppointment Scheduler");
            System.out.println("1. Create Appointment");
            System.out.println("2. Create Reminder");
            System.out.println("3. View Calendar");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
           int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Create Appointment
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter date and time (yyyy-MM-dd HH:mm): ");
                    String dateTimeStr = scanner.nextLine();
                    LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
                    scheduler.createAppointment(title, description, dateTime);
                    System.out.println("Appointment created.");
                    break;

                case 2:
                    // Create Reminder
                    List<Appointment> appointments = scheduler.getAppointments();
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments available to set a reminder.");
                    } else {
                        System.out.println("Select an appointment to set a reminder:");
                        for (int i = 0; i < appointments.size(); i++) {
                            System.out.println((i + 1) + ". " + appointments.get(i));
                        }
                        int appointmentIndex = scanner.nextInt() - 1;
                        scanner.nextLine();  // Consume newline

                        if (appointmentIndex >= 0 && appointmentIndex < appointments.size()) {
                            Appointment selectedAppointment = appointments.get(appointmentIndex);
                            System.out.print("Enter reminder time (yyyy-MM-dd HH:mm): ");
                            String reminderTimeStr = scanner.nextLine();
                            LocalDateTime reminderTime = LocalDateTime.parse(reminderTimeStr, formatter);
                            scheduler.createReminder(selectedAppointment, reminderTime);
                            System.out.println("Reminder set.");
                        } else {
                            System.out.println("Invalid appointment selection.");
                        }
                    }
                    break;

                case 3:
                    // View Calendar
                    System.out.println(scheduler.getCalendar());
                    System.out.println("Reminders:");
                    for (Reminder reminder : scheduler.getReminders()) {
                        System.out.println(reminder);
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}

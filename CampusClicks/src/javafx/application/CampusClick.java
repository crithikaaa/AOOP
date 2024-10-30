package com.campusclick;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CampusClick {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, User> users = new HashMap<>();
    private static final List<Event> events = new ArrayList<>();
    private static final Map<String, List<Event>> studentAttendance = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome to CampusClick!");
        while (true) {
            System.out.println("\n1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    signUp();
                    break;
                case 3:
                    System.out.println("Thank you for using CampusClick!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void signUp() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter role (admin/student): ");
        String role = scanner.nextLine().toLowerCase();

        if (!role.equals("admin") && !role.equals("student")) {
            System.out.println("Invalid role. Please choose 'admin' or 'student'.");
            return;
        }

        users.put(username, new User(username, password, role));
        System.out.println("Sign-up successful! You can now log in.");
    }

    private static void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = users.get(username);
        if (user != null && user.password.equals(password)) {
            System.out.println("Login successful! Welcome, " + username);
            if (user.role.equals("admin")) {
                adminMenu();
            } else if (user.role.equals("student")) {
                studentMenu(username);
            }
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void adminMenu() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEvent();
                    break;
                case 2:
                    viewEvents();
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEvent() {
        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();
        System.out.print("Enter event date (e.g., 2024-10-20): ");
        String eventDate = scanner.nextLine();
        events.add(new Event(eventName, eventDate));
        System.out.println("Event added successfully!");
    }

    private static void viewEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
        } else {
            System.out.println("\nUpcoming Events:");
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }

    private static void studentMenu(String username) {
        while (true) {
            System.out.println("\nStudent Menu:");
            System.out.println("1. Mark Attendance for an Event");
            System.out.println("2. View Your Event Calendar");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    markAttendance(username);
                    break;
                case 2:
                    viewStudentCalendar(username);
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void markAttendance(String username) {
        if (events.isEmpty()) {
            System.out.println("No events available to mark attendance.");
            return;
        }
        System.out.println("Available Events:");
        for (int i = 0; i < events.size(); i++) {
            System.out.println((i + 1) + ". " + events.get(i));
        }
        System.out.print("Select an event number to mark attendance: ");
        int eventIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (eventIndex >= 0 && eventIndex < events.size()) {
            Event selectedEvent = events.get(eventIndex);
            studentAttendance.putIfAbsent(username, new ArrayList<>());
            studentAttendance.get(username).add(selectedEvent);
            System.out.println("Attendance marked for event: " + selectedEvent.eventName);
        } else {
            System.out.println("Invalid event selection.");
        }
    }

    private static void viewStudentCalendar(String username) {
        List<Event> attendedEvents = studentAttendance.get(username);
        if (attendedEvents == null || attendedEvents.isEmpty()) {
            System.out.println("You have not attended any events yet.");
        } else {
            System.out.println("Your Event Calendar:");
            for (Event event : attendedEvents) {
                System.out.println(event);
            }
        }
    }
}

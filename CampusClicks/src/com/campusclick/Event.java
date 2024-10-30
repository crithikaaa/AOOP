package com.campusclick;

class Event {
    String eventName;
    String eventDate;

    Event(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Event: " + eventName + " on " + eventDate;
    }
}

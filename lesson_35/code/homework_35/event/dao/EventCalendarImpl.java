package homework_35.event.dao;

import jdk.jfr.Event;

import java.time.LocalDateTime;


public class EventCalendarImpl implements EventCalendar {

    private Event[] events;
    private Event[] size;

    public EventCalendarImpl(int capacity) {
        this.size = new Event[capacity];
        // this.size = 0;
    }

    @Override
    public boolean addEvent(Event event) {
        return false;
    }

    @Override
    public boolean removeEvent(int eventId) {
        return false;
    }

    @Override
    public boolean updateEvent(int eventId, String url) {
        return false;
    }

    @Override
    public Event getEventInCalendar(int eventId) {

        return null;
    }

    @Override
    public Event[] getEventBetweenDate(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return new Event[0];
    }

    @Override
    public int size() {
        return 0;
    }
}

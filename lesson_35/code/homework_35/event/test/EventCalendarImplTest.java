package homework_35.event.test;

import homework_35.event.dao.EventCalendar;
import homework_35.event.dao.EventCalendarImpl;
import homework_35.event.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class EventCalendarImplTest {

    EventCalendar eventCalendar;
    Event[] events;

    LocalDateTime now = LocalDateTime.now();

    // Comparator sort  by eventId
    Comparator<Event> comparator = (e1, e2) -> {
        int res = Integer.compare(e1.getEventId(), e2.getEventId());
        return res;
    };


    @BeforeEach
    void setUp() {

        eventCalendar = new EventCalendarImpl(7);
        events = new Event[6];
        events[0] = new Event(1, "Event 1", "http://event1.com", now.minusDays(10));
        events[1] = new Event(4, "Event 4", "http://event4.com", now.minusDays(9));
        events[2] = new Event(3, "Event 3", "http://event3.com", now.minusDays(20));
        events[3] = new Event(2, "Event 2", "http://event2.com", now.minusDays(5));
        events[4] = new Event(5, "Event 5", "http://event5.com", now.minusDays(30));
        events[5] = new Event(6, "Event 6", "http://event6.com", now.minusDays(15));

        // TODO add events to eventCalendar

        for (int i = 0; i < events.length; i++) {
            eventCalendar.addEvent(events[i]);
        }
    }

    @Test
    void testAddEvent() {
        assertFalse(eventCalendar.addEvent(null));
        // assertFalse(eventCalendar.addEvent(events[1]));
        Event event = new Event(7, "Event7", "http://event7.com", now.minusDays(15));
        assertTrue(eventCalendar.addEvent(event));
        assertEquals(7, eventCalendar.size());
        event = new Event(8, "Event8", "http://event8.com", now.minusDays(15));
        assertFalse(eventCalendar.addEvent(event));
    }

    @Test
    void testRemoveEvent() {
        assertTrue(eventCalendar.removeEvent(1));
        assertFalse(eventCalendar.removeEvent(9));
        assertEquals(5, eventCalendar.size());
    }

    @Test
    void testUpdateEvent() {
        assertTrue(eventCalendar.updateEvent(3, "newUrl"));
        assertFalse(eventCalendar.updateEvent(8, "http://event8.com"));
    }

    @Test
    void testGetEventInCalendar() {
        assertEquals(events[0], eventCalendar.getEventInCalendar(1));
        assertNull(eventCalendar.getEventInCalendar(9));

    }

    @Test
    void testGetEventBetweenDate() {
        LocalDate today = LocalDate.now();
        Event[] actual = eventCalendar.getEventBetweenDate(today.minusDays(5),today.minusDays(20));
        Arrays.sort(events,comparator);
        Event[]expected = {events[0], events[1],events[2],events[3],events[5]};
        Arrays.sort(expected,comparator);
        assertEquals(expected,actual);
    }

    @Test
    void testSize() {
        assertEquals(6, eventCalendar.size());
    }
}
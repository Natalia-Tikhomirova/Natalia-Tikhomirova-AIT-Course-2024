package homework_35.event.dao;

import jdk.jfr.Event;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface EventCalendar {

    boolean addEvent(Event event);
    boolean removeEvent (int eventId);
    boolean updateEvent(int eventId,String url);
    Event getEventInCalendar(int eventId);
    Event[]getEventBetweenDate(LocalDateTime dateFrom, LocalDateTime dateTo);
    int size();


} // end of class

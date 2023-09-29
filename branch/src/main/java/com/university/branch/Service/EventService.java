package com.university.branch.Service;

import com.university.branch.Model.Event;
import com.university.branch.Repo.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;


    public String addEvent(Event event) {
        // Implement validation and business logic here
        eventRepository.save(event);
        return "Added";
    }

    public String updateEvent(Long eventId, Event event) {
        // Implement validation and business logic here
        Event existingEvent = getEventById(eventId);
        existingEvent.setEventName(event.getEventName());
        existingEvent.setLocationOfEvent(event.getLocationOfEvent());
        existingEvent.setDate(event.getDate());
        existingEvent.setStartTime(event.getStartTime());
        existingEvent.setEndTime(event.getEndTime());
        eventRepository.save(existingEvent);
        return "updated";
    }

    public String deleteEvent(Long eventId) {
        // Implement validation and business logic here
        eventRepository.deleteById(eventId);
        return "Deleted";
    }

    public List<Event> getAllEventsByDate(LocalDateTime date) {
        return eventRepository.findAllByDate(date);
    }


    public Event getEventById(Long eventId) {
        return eventRepository.findById(eventId)
                .orElseThrow(() -> new EventNotFoundException(eventId));
    }
}

import com.university.branch.Controller.Valid;
import com.university.branch.Model.Event;
import com.university.branch.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/events")
@Validated
public class EventController {


    @Autowired
    EventService eventService;


    @PostMapping
    public String addEvent(@Valid @RequestBody Event event) {

        return  eventService.addEvent(event);
    }

    @PutMapping("/{eventId}")
    public String updateEvent(@PathVariable Long eventId, @Valid @RequestBody Event event) {

        return  eventService.updateEvent(eventId, event);
    }

    @DeleteMapping("/{eventId}")
    public String deleteEvent(@PathVariable Long eventId) {

        return eventService.deleteEvent(eventId);
    }

    @GetMapping("/by-date")
    public List<Event> getAllEventsByDate(@RequestParam LocalDateTime date) {
        List<Event> events = eventService.getAllEventsByDate(date);
        return events;
    }
}

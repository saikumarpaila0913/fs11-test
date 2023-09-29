package com.university.branch.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="Event")
@Entity
public class Event {

    @Id

    private Long eventId;

    @NotBlank(message = "Event name is required")
    private String eventName;

    @NotBlank(message = "Location of event is required")
    private String locationOfEvent;

    @NotNull(message = "Date is required")
    private LocalDateTime date;

    @NotNull(message = "Start time is required")
    private LocalDateTime startTime;

    @NotNull(message = "End time is required")
    private LocalDateTime endTime;

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocationOfEvent() {
        return locationOfEvent;
    }

    public void setLocationOfEvent(String locationOfEvent) {
        this.locationOfEvent = locationOfEvent;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    // getters and setters

    public Long getEventId() {
        return eventId;
    }
}
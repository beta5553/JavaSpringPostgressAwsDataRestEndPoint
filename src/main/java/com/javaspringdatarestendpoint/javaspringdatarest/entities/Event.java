package com.javaspringdatarestendpoint.javaspringdatarest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "EVENT", schema = "PUBLIC")
public class Event {

    @Id
    @Column(name = "event_name")
    private String eventName;

    @Column(name = "event_date")
    private String eventDate;

    public Event() {
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
}

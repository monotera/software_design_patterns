package com.appointment_scheduling.model;
import java.util.Calendar;

import com.appointment_scheduling.model.entities.User;

public class Appointment {
    User user;
    Calendar date;
    Calendar time;

    public Appointment(User user, Calendar date, Calendar time) {
        this.user = user;
        this.date = date;
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }
}

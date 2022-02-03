package com.appointment_scheduling.model.entities;

import com.appointment_scheduling.model.Appointment;

public class AppointmentCreationRequest {

    private User user;
    private Appointment appointment;

    public AppointmentCreationRequest() {
    }

    public AppointmentCreationRequest(User user, Appointment appointment) {
        this.user = user;
        this.appointment = appointment;
    }

    public User getUser() {
        return user;
    }

    public Appointment getAppointment() {
        return appointment;
    }

}

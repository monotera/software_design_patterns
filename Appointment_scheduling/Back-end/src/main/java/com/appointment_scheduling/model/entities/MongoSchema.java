package com.appointment_scheduling.model.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "appointment")
public class MongoSchema {
    @Id
    private String _id;
    private String dateKey;
    private List<Appointment> appointments;
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public List<Appointment> getAppointments() {
        return appointments;
    }
    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
    public String getDateKey() {
        return dateKey;
    }
    public void setDateKey(String dateKey) {
        this.dateKey = dateKey;
    }
    public MongoSchema(String dateKey, List<Appointment> appointments) {
        this.dateKey = dateKey;
        this.appointments = appointments;
    }
    public MongoSchema() {
    }
    
   
    
}

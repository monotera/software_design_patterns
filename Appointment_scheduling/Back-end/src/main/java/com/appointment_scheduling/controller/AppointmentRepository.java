package com.appointment_scheduling.controller;

import java.util.List;

import com.appointment_scheduling.model.entities.Appointment;
import com.appointment_scheduling.model.entities.MongoSchema;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<MongoSchema,String>{
    List<MongoSchema> findByDateKey(String date);
}

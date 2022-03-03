package com.appointment_scheduling.repository;

import com.appointment_scheduling.model.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, String> {
}

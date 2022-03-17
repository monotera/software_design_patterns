package com.appointment_scheduling.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.appointment_scheduling.model.entities.Appointment;
import com.appointment_scheduling.model.entities.MongoSchema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    public boolean create_appointment(Appointment appointment) {
        boolean found = false;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        String date = format.format(appointment.getDate().getTime()).replaceAll("/", "");
        try {
            List<MongoSchema> folders = appointmentRepository.findAll();
            List<Appointment> appointments = new ArrayList<>();
            MongoSchema folder = new MongoSchema();
            for (MongoSchema mongoSchema : folders) {
                if (mongoSchema.getDateKey().equals(date)) {
                    folder = mongoSchema;
                    appointments = mongoSchema.getAppointments();
                    found = true;
                }
            }
            if (!found) {
                folder.setDateKey(date);
            }
            appointments.add(appointment);
            folder.setAppointments(appointments);
            appointmentRepository.save(folder);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    public List<Appointment> fetch_appoinments(String date) {
        List<MongoSchema> data = appointmentRepository.findByDateKey(date);
        if (data.size() == 0) {
            return null;
        }
        return data.get(0).getAppointments();
    }

}

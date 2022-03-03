package com.appointment_scheduling.controller;

import java.util.ArrayList;

import com.appointment_scheduling.model.Appointment;

import com.appointment_scheduling.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
@CrossOrigin(value = "http://localhost:3000")
public class AppointmentController {
//    @Autowired
//    Environment env;

    @Autowired
    private AppointmentRepository repo;

    @PostMapping("/appointment")
    public ResponseEntity<Appointment> create_appointment(@RequestBody Appointment newAppointment) {
        if (repo.save(new Appointment(newAppointment.getUserId(), newAppointment.getDate(), newAppointment.getId())) == null)
            return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(newAppointment, null, HttpStatus.OK);
    }

    @GetMapping("/appointment")
    public ResponseEntity<ArrayList<Appointment>> fetch_appointments_by_date(@RequestParam String date) {
        ArrayList<Appointment> response = new ArrayList<>();
        repo.findAll().forEach((a) -> response.add(a));
        return new ResponseEntity<>(response, null, HttpStatus.OK);
    }
}

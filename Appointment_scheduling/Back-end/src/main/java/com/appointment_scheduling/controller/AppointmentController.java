package com.appointment_scheduling.controller;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.appointment_scheduling.model.entities.Appointment;
import com.appointment_scheduling.model.entities.User;
import java.text.SimpleDateFormat;

import com.google.gson.Gson;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/appointment")
    public ResponseEntity<Appointment> create_appointment(@RequestBody Appointment newAppointment) {
        Boolean valid = appointmentService.create_appointment(newAppointment);
        if (!valid)
            return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(newAppointment, null, HttpStatus.OK);
    }

    @GetMapping("/appointment")
    public ResponseEntity<List<Appointment>> fetch_appointments_by_date(@RequestParam String date) {
        List<Appointment> response = appointmentService.fetch_appoinments(date);
        if (response == null) {
            return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(response, null, HttpStatus.OK);
    }

}

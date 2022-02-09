package com.appointment_scheduling.controller;

import java.util.ArrayList;

import com.appointment_scheduling.model.Appointment;
import com.appointment_scheduling.model.entities.AppointmentCreationRequest;
import com.appointment_scheduling.model.entities.User;

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

    @PostMapping("/appointment")
    public ResponseEntity<Boolean> create_appointment(@RequestBody AppointmentCreationRequest newAppointment) {
        // TODO: funcion para crear cita, se debe retornar un booleano
        // cambiar el primer null por lo que debe de retornar
        User user = newAppointment.getUser();
        Appointment appointment = newAppointment.getAppointment();

        return new ResponseEntity<>(null, null, HttpStatus.OK);
    }

    @GetMapping("/appointment")
    public ResponseEntity<ArrayList<Appointment>> fetch_appointments_by_date(@RequestParam String date) {
        // TODO: funcion que retorna las citas de una fecha (ArrayList<Appointment>)
        // Cambiar el primer null por lo que debe retornar
        return new ResponseEntity<>(null, null, HttpStatus.OK);
    }
}

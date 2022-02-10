package com.appointment_scheduling.controller;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.appointment_scheduling.model.db.Persister;
import com.appointment_scheduling.model.entities.Appointment;
import com.appointment_scheduling.model.entities.User;
import java.text.SimpleDateFormat;

import com.google.gson.Gson;
import org.apache.tomcat.util.json.JSONParser;
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

    Persister persister = new Persister();

    @PostMapping("/appointment")
    public ResponseEntity<Appointment> create_appointment(@RequestBody Appointment newAppointment) {

        persister.write_data(newAppointment);
        // TODO: funcion para crear cita, se debe retornar un booleano
        // cambiar el primer null por lo que debe de retornar
        /*
         * SimpleDateFormat format = new SimpleDateFormat("\"yyyy/MM/dd\"");
         * String dateName;
         * String directoryName;
         * User user = newAppointment.getUser();
         * Appointment appointment = newAppointment.getAppointment();
         * Gson new_appointment = new Gson();
         * String appointmentJson = new_appointment.toJson(appointment);
         * dateName = format.format(appointment.getDate());
         * directoryName = date(dateName); //20220201
         * String filename = appointment.getUser().getId();
         * if(existsDirectory("./"+directoryName)){
         * saveJson(appointmentJson, filename, "./"+directoryName);
         * }else{
         * saveJson(appointmentJson,filename, "./"+directoryName);
         * }
         */
        return new ResponseEntity<>(newAppointment, null, HttpStatus.OK);
    }

    @GetMapping("/appointment")
    public ResponseEntity<ArrayList<Appointment>> fetch_appointments_by_date(@RequestParam String date)
            throws IOException {
        // TODO: funcion que retorna las citas de una fecha (ArrayList<Appointment>)
        /*
         * ArrayList<AppointmentCreationRequest> appointmentsOfADay = new
         * ArrayList<AppointmentCreationRequest>();
         * String dateDirectory = "./" + date;
         * File directory = new File(dateDirectory);
         * if (!directory.exists()) {
         * return new ResponseEntity<>(null, null, HttpStatus.OK);
         * } else {
         * File folder = new File(dateDirectory);
         * for (File file : folder.listFiles()) {
         * String json = "";
         * BufferedReader br = new BufferedReader(new FileReader(file + ".json"));
         * String linea;
         * while ((linea = br.readLine()) != null) {
         * json += linea;
         * }
         * br.close();
         * Gson gson = new Gson();
         * AppointmentCreationRequest appointment = gson.fromJson(json,
         * AppointmentCreationRequest.class);
         * appointmentsOfADay.add(appointment);
         * }
         */
        // Cambiar el primer null por lo que debe retornar
        // ARREGLAR LO QUE SE DEBE RETORNAR
        return new ResponseEntity<>(null, null, HttpStatus.OK);
    }

    public boolean existsDirectory(String path) {
        File directory = new File(path);
        if (!directory.exists()) {
            return directory.mkdir();
        } else {
            return false;
        }
    }

    public String date(String date) {
        String div[] = date.split("/");
        String year = div[0];
        String month = div[1];
        String day = div[2];
        String directoryName = year + month + day;
        return directoryName;
    }

    public void saveJson(String appointment, String fileName, String directory) {
        try {
            FileWriter file = new FileWriter(directory + "./" + fileName);
            file.write(appointment);
            file.flush();
            file.close();

        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}

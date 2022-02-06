package com.appointment_scheduling.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.appointment_scheduling.model.Appointment;
import com.appointment_scheduling.model.entities.AppointmentCreationRequest;
import com.appointment_scheduling.model.entities.User;
import java.text.SimpleDateFormat;
import java.io.FileWriter;

import com.google.gson.Gson;
import java.io.File;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class AppointmentController {


   /* public boolean createDirectrory(){
        File directory = new File("Appointment_scheduling/Back-end/src/main/java/com/appointment_scheduling/controller/AppointmentDirectory");
        if(!directory.exists()){
            if(directory.mkdir()){
                return true;
            }else{
                return false;
            }
        }
    }
    */

    public boolean existsDirectory(String path){
        File directory = new File(path);
        if(!directory.exists()){
            return directory.mkdir();
        }else{
            return false;
        }
    }

    public String date(String date){
        String div[] = date.split("/");
        String year =  div[0];
        String month = div[1];
        String day = div[2];
        String directoryName = year+month+day;
        return directoryName;
    }

    public void saveJson(String appointment, String fileName, String directory){
        try {
            FileWriter file = new FileWriter(directory + "./"+fileName);
            file.write(appointment);
            file.flush();
            file.close();

        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }


    @PostMapping("/appointment")
    public ResponseEntity<Boolean> create_appointment(@RequestBody AppointmentCreationRequest newAppointment) {
        // TODO: funcion para crear cita, se debe retornar un booleano
        // cambiar el primer null por lo que debe de retornar
        SimpleDateFormat format = new SimpleDateFormat("\"yyyy/MM/dd\"");
        String dateName;
        String directoryName;
        User user = newAppointment.getUser();
        Appointment appointment = newAppointment.getAppointment();
        Gson new_appointment = new Gson();
        String appointmentJson = new_appointment.toJson(appointment);
        dateName = format.format(appointment.getDate());
        directoryName = date(dateName); //20220201
        String filename = appointment.getUser().getId();
        if(existsDirectory("./"+directoryName)){
            saveJson(appointmentJson, filename, "./"+directoryName);
            }else{
            saveJson(appointmentJson,filename, "./"+directoryName);
        }

        return new ResponseEntity<>(null, null, HttpStatus.OK);
    }

    @GetMapping("/appointment")
    public ResponseEntity<ArrayList<Appointment>> fetch_appointments_by_date(@RequestParam String date) {
        // TODO: funcion que retorna las citas de una fecha (ArrayList<Appointment>)
        // Cambiar el primer null por lo que debe retornar
        return new ResponseEntity<>(null, null, HttpStatus.OK);
    }
}

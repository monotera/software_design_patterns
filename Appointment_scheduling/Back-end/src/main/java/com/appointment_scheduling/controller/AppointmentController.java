package com.appointment_scheduling.controller;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.appointment_scheduling.model.Appointment;
import com.appointment_scheduling.model.entities.AppointmentCreationRequest;
import com.appointment_scheduling.model.entities.User;
import java.text.SimpleDateFormat;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minidev.json.JSONObject;
import org.apache.tomcat.util.json.JSONParser;
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
            Writer writer = new FileWriter(fileName +".json");
            writer.write(appointment);
            Gson gson = new GsonBuilder().create();
            gson.toJson(directory,writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }


    @PostMapping("/appointment")
    public ResponseEntity<Boolean> create_appointment(@RequestBody Appointment newAppointment) {
        SimpleDateFormat format = new SimpleDateFormat("\"yyyy/MM/dd\"");
        String dateName = format.format(newAppointment.getDate().getTime());
        String directoryName;
        Gson new_appointment = new Gson();
        String appointmentJson = new_appointment.toJson(newAppointment);
        directoryName = date(dateName); //20220201
        String filename = newAppointment.getUser().getId();
        if(existsDirectory("./"+directoryName)){
            saveJson(appointmentJson, filename, "./"+directoryName);
            }else{
            saveJson(appointmentJson,filename, "./"+directoryName);
        }
        return new ResponseEntity(dateName, null, HttpStatus.OK);
    }

    /*@GetMapping("/appointment")
    public ResponseEntity<ArrayList<Appointment>> fetch_appointments_by_date(@RequestParam String date) throws IOException {
        // TODO: funcion que retorna las citas de una fecha (ArrayList<Appointment>)
        ArrayList<Appointment> appointmentsOfADay= new ArrayList<Appointment>();
        String dateDirectory=date(date);
        dateDirectory="./"+dateDirectory;
        File directory = new File(dateDirectory);
        if(!directory.exists()){
            return new ResponseEntity<>(null, null, HttpStatus.OK);
        }else{
            File folder=new File(dateDirectory);
            for (File file : folder.listFiles()) {
                String json="";
                BufferedReader br= new BufferedReader(new FileReader(file+".json"));
                String linea;
                while((linea=br.readLine())!=null){
                    json+=linea;
                }
                br.close();
                Gson gson=new Gson();
                Appointment appointment=gson.fromJson(json,Appointment.class);
                appointmentsOfADay.add(appointment);
            }
            // Cambiar el primer null por lo que debe retornar
            //ARREGLAR LO QUE SE DEBE RETORNAR
            return new ResponseEntity<>(appointmentsOfADay, null, HttpStatus.OK);
        }
    }*/

    @GetMapping("/appointment")
    public ResponseEntity<ArrayList<Appointment>> fetch_appointments_by_date(@RequestParam String date) throws IOException {
        // TODO: funcion que retorna las citas de una fecha (ArrayList<Appointment>)
        //ArrayList<Appointment> appointmentsOfADay= new ArrayList<Appointment>(){};
        String dateDirectory=date(date);
        dateDirectory="./"+dateDirectory;
        File directory = new File(dateDirectory);
        JsonReader dataAppointment;
        Gson g = new Gson();
        Type appointmentListType = new TypeToken<ArrayList<Appointment>>() {
        }.getType();
        ArrayList<Appointment>appointmentsOfADay = null;
        if(!directory.exists()){
            return new ResponseEntity<>(null, null, HttpStatus.OK);
        }else{
            File folder=new File(dateDirectory);
            for (File file : folder.listFiles()) {
                dataAppointment=new JsonReader((new FileReader(file+".json")));
                appointmentsOfADay=g.fromJson(dataAppointment,appointmentListType);
            }
            return new ResponseEntity<>(appointmentsOfADay, null, HttpStatus.OK);
        }
    }

}

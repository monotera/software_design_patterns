package com.appointment_scheduling.model.db;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.appointment_scheduling.model.entities.Appointment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persister {

    public Boolean write_data(Appointment newAppointment) {
        // Nombre del archivo es la cedula
        // Nombre de la carpeta es la fecha
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(newAppointment);
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

        String date = format.format(newAppointment.getDate().getTime()).replaceAll("/", "");
        File file = new File("data/" + date, newAppointment.getUser().getId().toString());
        File dir = new File("data/" + date);
        dir.mkdir();
        try {
            if (file.exists()) {
                FileWriter fr = new FileWriter(file);
                fr.write(prettyJson);
                fr.close();
            } else {
                FileWriter fr = new FileWriter(file);
                fr.write(prettyJson);
                fr.close();
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return true;
    }
}

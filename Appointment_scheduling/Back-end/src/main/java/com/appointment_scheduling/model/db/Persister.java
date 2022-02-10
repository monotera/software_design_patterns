package com.appointment_scheduling.model.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
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
        File file = new File("data/" + date, newAppointment.getUser().getId().toString() + ".json");
        File dir = new File("data/" + date);
        dir.mkdir();
        try {

            FileWriter fr = new FileWriter(file);
            fr.write(prettyJson);
            fr.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public ArrayList<Appointment> retrieveData(String date) {
        File folder = new File("data/" + date);
        File[] listOfFiles = folder.listFiles();
        ArrayList<Appointment> appointments = new ArrayList<>();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                Gson gson = new Gson();
                try {
                    Appointment appointment = gson.fromJson(
                            new FileReader("data/" + date + "/" + file.getName()),
                            Appointment.class);
                    appointments.add(appointment);

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return null;
                }
            }
        }

        return appointments;
    }
}

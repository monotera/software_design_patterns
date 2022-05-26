package com.parcial.adapter.adaptador.local;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.parcial.adapter.entities.User;

public class ControllerLocal {
    public User retrieveData(String _id) {
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("user.json"));

            // convert JSON string to User object
            User[] user = gson.fromJson(reader, User[].class);

            // print user object
            // System.out.println(user);

            // close reader
            reader.close();
            List<User> users = Arrays.asList(user);
            for (User u : users) {
                if (u.getCedula().equals(_id))
                    return u;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}

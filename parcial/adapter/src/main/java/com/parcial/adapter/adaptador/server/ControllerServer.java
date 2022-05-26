package com.parcial.adapter.adaptador.server;

import java.util.Arrays;
import java.util.List;

import com.parcial.adapter.entities.User;

import org.springframework.web.client.RestTemplate;

public class ControllerServer {
    public User get_users(String _id) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:3000";
        User[] response = restTemplate.getForObject(fooResourceUrl, User[].class);
        List<User> users = Arrays.asList(response);
        for (User u : users) {
            if (u.get_id().equals(_id))
                return u;
        }
        return null;
    }
}

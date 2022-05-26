package com.parcial.adapter.adaptador.database;

import com.parcial.adapter.entities.User;
import com.parcial.adapter.entities.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerDataBase {

    @Autowired
    private UserRepository userRepository;

    public User fetch_user(String cedula) {
        return userRepository.findByCedula(cedula).get();
    }
}

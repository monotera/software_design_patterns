package com.parcial.adapter;

import java.util.List;

import com.parcial.adapter.adaptador.Seeker;
import com.parcial.adapter.adaptador.local.ControllerLocal;
import com.parcial.adapter.adaptador.local.ControllerLocalAdapter;
import com.parcial.adapter.adaptador.server.ControllerServer;
import com.parcial.adapter.adaptador.server.ControllerServerAdapter;
import com.parcial.adapter.entities.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {

    @GetMapping("/local/{_id}")
    public User get_users_local(@PathVariable String _id) {
        Seeker seeker = new ControllerLocalAdapter();
        return seeker.search(_id);
    }

    @GetMapping("/server/{_id}")
    public User get_users_server(@PathVariable String _id) {
        Seeker seeker = new ControllerServerAdapter();
        return seeker.search(_id);
    }
}

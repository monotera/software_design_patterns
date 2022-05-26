package com.parcial.adapter;

import com.parcial.adapter.adaptador.Seeker;
import com.parcial.adapter.adaptador.database.ControllerDataBase;
import com.parcial.adapter.adaptador.database.ControllerDataBaseAdapter;
import com.parcial.adapter.adaptador.local.ControllerLocalAdapter;
import com.parcial.adapter.adaptador.server.ControllerServerAdapter;
import com.parcial.adapter.entities.User;
import com.parcial.adapter.entities.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {

    /*
     * @Autowired
     * UserRepository repository;
     */
    private ControllerDataBase base;

    @Autowired
    public ControllerRest(ControllerDataBase cBase) {
        this.base = cBase;
    }

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

    @GetMapping("/db/{_id}")
    public User get_users_db(@PathVariable String _id) {
        Seeker seeker = new ControllerDataBaseAdapter(base);
        return seeker.search("I0");
    }

}

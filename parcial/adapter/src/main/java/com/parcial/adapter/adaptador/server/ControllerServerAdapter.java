package com.parcial.adapter.adaptador.server;

import com.parcial.adapter.adaptador.Seeker;
import com.parcial.adapter.entities.User;

public class ControllerServerAdapter implements Seeker {
    private ControllerServer seekerProvider = new ControllerServer();

    @Override
    public User search(String _id) {
        return this.seekerProvider.get_users(_id);
    }

}

package com.parcial.adapter.adaptador.local;

import com.parcial.adapter.adaptador.Seeker;
import com.parcial.adapter.entities.User;

public class ControllerLocalAdapter implements Seeker {
    private ControllerLocal seekerProvider = new ControllerLocal();

    @Override
    public User search(String _id) {
        return seekerProvider.retrieveData(_id);
    }
}

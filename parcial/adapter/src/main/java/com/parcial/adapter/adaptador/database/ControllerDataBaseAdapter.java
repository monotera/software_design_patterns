package com.parcial.adapter.adaptador.database;

import com.parcial.adapter.adaptador.Seeker;
import com.parcial.adapter.entities.User;

public class ControllerDataBaseAdapter implements Seeker {

    private ControllerDataBase base;

    public ControllerDataBaseAdapter(ControllerDataBase cBase) {
        this.base = cBase;
    }

    @Override
    public User search(String _id) {
        return base.fetch_user(_id);
    }

}

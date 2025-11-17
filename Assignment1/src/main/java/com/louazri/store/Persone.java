package com.louazri.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component

public class Persone {

    private Vhecle vhecle;

    public  Persone( Vhecle vhecle){
        this.vhecle = vhecle;
    }

    public void useVhecle() {
        vhecle.start();
    }

    public Vhecle getVhecle() {
        return vhecle;
    }




}

package com.louazri.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vhecle {
    private String name = "MYcar";
    private  VhecleServices vhecleServices;

    public Vhecle( VhecleServices vhecleServices) {
        this.vhecleServices = vhecleServices;
    }
   public void start(){
       vhecleServices.moveTayers();
       vhecleServices.playSound();
   }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

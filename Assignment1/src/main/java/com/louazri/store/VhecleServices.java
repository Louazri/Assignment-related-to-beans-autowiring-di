package com.louazri.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class VhecleServices {
    @Autowired
    private Sound Sound;
    @Autowired
    private Tayers Tayers;

    public void playSound(){
        System.out.println(Sound.MakeSound());
    }
    public void moveTayers(){
       System.out.println(Tayers.Rotate());
    }
}

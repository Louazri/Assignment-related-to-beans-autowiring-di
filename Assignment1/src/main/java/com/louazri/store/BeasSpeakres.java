package com.louazri.store;

import org.springframework.stereotype.Component;

@Component("BeasSpeakers")
public class BeasSpeakres implements Sound {
    @Override
    public String  MakeSound() {
        return "playing sound using beas speakres";
    }
}

package com.louazri.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakres implements Sound {
    @Override
    public String MakeSound() {
        return "playing sound using sony speakres";
    }
}

package com.louazri.store;

import org.springframework.stereotype.Component;

@Component
public class MichelingTayers implements Tayers {
    @Override
    public String Rotate() {
        return "moving using michling tayers";
    }
}

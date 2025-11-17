package com.louazri.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgStoneTayers implements Tayers {
    @Override
    public String Rotate() {
        return "moving using bridgstone tayers";
    }
}

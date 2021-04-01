package com.tematihonov;

import java.util.HashMap;
import java.util.Map;

public class HabitatFactory {

    static Map<String, Habitat> habitats = new HashMap<>();

    public static Habitat getHabitat(String name) {
        Habitat hb = habitats.get(name);
        if (hb == null) {
            hb = new Habitat(name);
            habitats.put(name, hb);
        }
        return hb;
    }
}

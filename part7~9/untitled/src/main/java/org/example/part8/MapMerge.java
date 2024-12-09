package org.example.part8;

import java.util.HashMap;
import java.util.Map;

public class MapMerge {
    public static void main(String[] args) {

        Map<String,String> family = Map.ofEntries(
                Map.entry("Teo","Star Wars"),
                Map.entry("Cristina","James Bond")
        );
        Map<String,String> friends = Map.ofEntries(
                Map.entry("Raphael","Star Wars"),
                Map.entry("Teo","meteo"),
                Map.entry("Cristina","Matrix")
        );
        Map<String,String> everyone = new HashMap<>(family);

        everyone.putAll(friends);
        System.out.println(everyone);

        System.out.println("---------------------------");

        everyone = new HashMap<>(family);

        Map<String,Long> m =new HashMap<>();
        m.merge("abcd",1L,(key,val)->val+1L);
        m.merge("abcd",1L,(key,val)->val+1L);
        System.out.println(m);




    }
}

package org.example.part8;

import java.util.HashMap;
import java.util.Map;

public class MapChangerPattern {
    public static void main(String[] args) {
        Map<String,String> f=new HashMap<>();
        f.put("Raphael","Star Wars");
        f.put("Olivia","james bond");
        f.replaceAll((friend,movie)->movie.toUpperCase());
        System.out.println(f);
    }
}

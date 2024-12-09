package org.example.part8;

import java.util.Map;

public class MapandFactory {
    public static void main(String[] args) {
        Map<String, Integer> ageOfFriends = Map.ofEntries(
                Map.entry("Raphael",30),
                Map.entry("Olivia",25),
                Map.entry("Thibaut",26)
        );

        ageOfFriends.forEach((friend,age)-> System.out.println(friend+" is "+age));

        System.out.println("---------------------------");
        //값또는 key기준으로 정렬
        Map<String,String> favouriteMoveies = Map.ofEntries(
                Map.entry("Raphael","Star Wars"),
                Map.entry("Cristina","Matrix"),
                Map.entry("Olivia","James Bond"));

        favouriteMoveies
                .entrySet()
                .stream().sorted(Map.Entry.comparingByKey())
                .forEachOrdered(System.out::println);


    }
}

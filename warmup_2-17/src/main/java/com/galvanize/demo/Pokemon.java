package com.galvanize.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
class controller {
    public HashMap<Integer, String> pairs = new HashMap<>();

    public controller() {
        pairs.put(1, "Bulbasaur");
        pairs.put(2, "Ivysaur");
        pairs.put(3, "Venusaur");
        pairs.put(4, "Charmander");
        pairs.put(5, "Charmeleon");
        pairs.put(6, "Charizard");
        pairs.put(7, "Squirtle");
        pairs.put(8, "Wartortle");
        pairs.put(9, "Blastoise");
    }

    @GetMapping("/pokemon/{id}")
    public String getId(@PathVariable int id) {
        return pairs.get(id);
    }

    @GetMapping("/pokemon")
    public HashMap getMons() {
        return pairs;
    }
}
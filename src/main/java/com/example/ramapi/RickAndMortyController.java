package com.example.ramapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RickAndMortyController {

    RickAndMortyService rickAndMortyService;

    public RickAndMortyController(RickAndMortyService rickAndMortyService) {
        this.rickAndMortyService = rickAndMortyService;
    }

    @GetMapping
    public List<RickAndMortyModel> getAllCharacters() {
        return rickAndMortyService.getAllCharacters();
    }

    @GetMapping("/alive")
    public List<RickAndMortyModel> getAllAliveCharacters() { return rickAndMortyService.getAllAliveCharacters(); }

    @GetMapping("/man")
    public List<RickAndMortyModel> getAllManCharacters() { return rickAndMortyService.getAllManCharacters(); }

    @GetMapping("/aliveman")
    public List<RickAndMortyModel> getAllAliveManCharacters() { return rickAndMortyService.getAllAliveManCharacters(); }

}
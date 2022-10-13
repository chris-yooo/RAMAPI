package com.example.ramapi;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Service
public class RickAndMortyService {
    public static RickAndMortyModel getAllCharacters;
    public static RickAndMortyModel getAllAliveCharacters;
    private WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public List<RickAndMortyModel> getAllCharacters() {
        RickAndMortyResponseElement response = webClient
            .get()
            .uri("/character")
            .retrieve()
            .toEntity(RickAndMortyResponseElement.class)
            .block()
            .getBody();
        return response.getResults();
}

public List<RickAndMortyModel> getAllAliveCharacters() {
        RickAndMortyResponseElement response = webClient
            .get()
            .uri("/character?status=alive")
            .retrieve()
            .toEntity(RickAndMortyResponseElement.class)
            .block()
            .getBody();
        return response.getResults();
}
}
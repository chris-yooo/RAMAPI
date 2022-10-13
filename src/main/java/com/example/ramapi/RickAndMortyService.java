package com.example.ramapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Service
public class RickAndMortyService {
    public static RickAndMortyModel getAllCharacters;
    public static RickAndMortyModel getAllAliveCharacters;
    public static RickAndMortyModel getAllManCharacters;
    public static RickAndMortyModel getAllAliveManCharacters;

    @Value("${url}")
    private String url;

    private WebClient webClient = WebClient.create();

    public List<RickAndMortyModel> getAllCharacters() {
        RickAndMortyResponseElement response = webClient
            .get()
            .uri(url + "/character")
            .retrieve()
            .toEntity(RickAndMortyResponseElement.class)
            .block()
            .getBody();
        return response.getResults();
}

public List<RickAndMortyModel> getAllAliveCharacters() {
        RickAndMortyResponseElement response = webClient
            .get()
            .uri(url + "/character?status=alive")
            .retrieve()
            .toEntity(RickAndMortyResponseElement.class)
            .block()
            .getBody();
        return response.getResults();
}

    public List<RickAndMortyModel> getAllManCharacters() {
        RickAndMortyResponseElement response = webClient
                .get()
                .uri(url + "/character?gender=male")
                .retrieve()
                .toEntity(RickAndMortyResponseElement.class)
                .block()
                .getBody();
        return response.getResults();
    }

    public List<RickAndMortyModel> getAllAliveManCharacters() {
        RickAndMortyResponseElement response = webClient
                .get()
                .uri(url + "/character?status=alive&gender=male")
                .retrieve()
                .toEntity(RickAndMortyResponseElement.class)
                .block()
                .getBody();
        return response.getResults();
    }
}
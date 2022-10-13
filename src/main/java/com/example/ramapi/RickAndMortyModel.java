package com.example.ramapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RickAndMortyModel {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
}
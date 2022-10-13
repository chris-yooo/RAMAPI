package com.example.ramapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RickAndMortyResponseElement {

    List<RickAndMortyModel> results;

}
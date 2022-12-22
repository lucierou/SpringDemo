package com.example.demo.service;

import com.example.demo.entity.Personne;
import com.example.demo.interfaces.IPersonneService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Personne2Service implements IPersonneService {
    @Override
    public List<Personne> getPersonnes() {
        return Arrays.asList(new Personne(3, "Père", "Noël"), new Personne(4, "Mère", "Noël"));
    }
}

package com.example.demo.controller;

import com.example.demo.entity.Personne;
import com.example.demo.interfaces.IPersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/personne")
public class PersonneController {

    @Autowired
    @Qualifier("personne2Service")
    private IPersonneService personneService;

    @GetMapping("/")
//    public String getListePersonnes() {
//        return "Liste de personnes";
//    }
    public List<Personne> getListePersonnes() {
        return personneService.getPersonnes();
    }

    @PostMapping("/post")
    public String postPersonne() {
        return "une personne postée";
    }

    @GetMapping("/{id}")
    public String getUneSeulePersonne(@PathVariable Integer id) {
        return "Une seule personne avec l'id " + id;
    }

    @PostMapping("")
    public Personne postPersonne(@RequestBody Personne personne) {
        return personne;
    }

//    @PostMapping("")
//    public Personne postPersonne(@RequestParam String nom, @RequestParam String prenom) {
//        return new Personne(3, nom, prenom);
//    }

}

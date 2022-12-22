package com.example.demo.controller;

import com.example.demo.entity.Produit;
import com.example.demo.interfaces.IDAO;
import com.example.demo.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/produit")
public class ProduitController {

    @Autowired
//    @Qualifier("produitService")
    private ProduitService produitService;

    @GetMapping("/")
    public List<Produit> getAllProduits() {
        return produitService.findAll();
    }

    @GetMapping("/{id}")
    public Produit getProduit(@PathVariable Integer id) {
//        List<Produit> produits = produitService.findAll();
//        Produit produit = new Produit();
//        for (Produit p : produits) {
//            if (p.getId() == id) {
//                produit = p;
//            }
//        }
        return produitService.findById(id);
    }

    @PostMapping("")
    public Produit postProduit(@RequestBody Produit produit) {
        if (produitService.create(produit)) {
            return produit;
        }
        return null;
    }

    @PostMapping("/remove{id}")
    public String postProduit(@PathVariable Integer id) {
        Produit produit = produitService.findById(id);
        produitService.delete(produit);
        return "Le produit" + produit + "a été supprimé";
    }

//    @PostMapping("")
//    public Produit postProduit(
//            @RequestParam int id,
//            @RequestParam String marque,
//            @RequestParam String reference,
////            @RequestParam Date dateAchat,
//            @RequestParam double prix,
//            @RequestParam int stock
//            ) {
//        return new Produit(id, marque, reference, new Date(), prix, stock);
//    }



}

package com.slimani.medicospot.service;

import com.slimani.medicospot.dao.MedecinRepository;
import com.slimani.medicospot.model.Medecin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MedecinController {

    @Autowired
    private MedecinRepository medecinRepository;


    @GetMapping(value = "/doctors")
    public List<Medecin> getAll(){

        return medecinRepository.findAll();
    }
}

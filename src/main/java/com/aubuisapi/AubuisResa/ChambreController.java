package com.aubuisapi.AubuisResa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class ChambreController {

    @Autowired
    ChambreRepository chambreRepository;

    public ChambreController(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }
    @GetMapping("/chambres")
    List<Chambre> findAll() {
        return chambreRepository.findAll();
    }


}

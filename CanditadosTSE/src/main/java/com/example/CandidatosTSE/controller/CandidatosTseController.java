package com.example.CandidatosTSE.controller;

import com.example.CandidatosTSE.service.CandidatosTseService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class CandidatosTseController {
    
    private final CandidatosTseService candidatosTseService;

    public CandidatosTseController(CandidatosTseService candidatosTseService){
        this.candidatosTseService = candidatosTseService;
    };

    @GetMapping("/")
    public String index(
        @RequestParam(required = false) String cargo,
        @RequestParam(required = false) String partido,
        @RequestParam(required = false) String texto,
        Model model)
        {
            return "Cargo: " + cargo + "Partido: " + partido + "texto: " + texto;
        }
}

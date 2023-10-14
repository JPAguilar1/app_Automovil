package com.company.intecap.Automovil.controller;

import com.company.intecap.Automovil.model.Automovil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class AutomovilController {

    @GetMapping("/Automoviles")

    public List<Automovil> getAutomoviles(){

        Automovil A1 = new Automovil(1,"Toyota","2006", "Azul", "PJT2004", 1000);
        Automovil A2 = new Automovil(2, "Honda", "2010", "Gris", "KLM2012",  9000);
        Automovil A3 = new Automovil(3, "Ford", "2018",  "Rojo",  "BFRW18",  15000);
        Automovil A4 = new Automovil(4, "Chevrolet",  "2015",  "Negro",  "CNZL15",  12000);
        Automovil A5 = new Automovil(5, "Volkswagen", "2017",  "Blanco",  "VWLT17",  14000);
        Automovil A6 = new Automovil(6, "Nissan",  "2014",  "Plateado",  "NSN2014",  11500);

        return List.of(A1,A2,A3,A4,A5,A6);
    }
}

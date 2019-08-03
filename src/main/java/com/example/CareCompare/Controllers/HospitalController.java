package com.example.CareCompare.Controllers;

import com.example.CareCompare.Models.Hospital;
import com.example.CareCompare.Repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class HospitalController {
    @Autowired
    private HospitalRepository hospitalRepository;

    @GetMapping(path="/allhospitals")
    public Iterable <Hospital> findallhospitals(){

        return hospitalRepository.findAll();
    }
    @PostMapping(path="/hospital/add")
    public String addHospital(@RequestBody Hospital hosp){
       hospitalRepository.save(hosp);
        return "Saved";
    }
}

package com.example.CareCompare.Controllers;

import com.example.CareCompare.Models.Hospital;
import com.example.CareCompare.Repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

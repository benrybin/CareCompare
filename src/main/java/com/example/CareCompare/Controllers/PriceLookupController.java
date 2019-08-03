package com.example.CareCompare.Controllers;


import com.example.CareCompare.Models.Hospital;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PriceLookup {
    @PostMapping(path="/hospital/add")
    public String addHospital(@RequestBody Hospital hosp){
        hospitalRepository.save(hosp);
        return "Saved";
    }
}

package com.example.CareCompare.Controllers;


import com.example.CareCompare.Models.Distance;
import com.example.CareCompare.Models.Hospital;
import com.example.CareCompare.Models.PriceLookup;
import com.example.CareCompare.Models.Procedures;
import com.example.CareCompare.Repositories.PriceLookupRepository;
import com.example.CareCompare.Services.PriceLookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@CrossOrigin
public class PriceLookupController {
    @Autowired
    private PriceLookupService priceLookupService;



    @PostMapping(path="/pricelookup/add")
    public String addPrice(@RequestParam Integer hospid,@RequestParam Integer procId,@RequestParam Double price){

        priceLookupService.storePrice(hospid, procId, price);
        return "Saved";
    }
    @GetMapping(path="/pricerequest")
    public List<PriceLookup> findallprices(@RequestParam String code,@RequestParam Integer zip){
        String zipUrl = "https://www.zipcodeapi.com/rest/1S8VbZ23W8a1okx7o1XJnkDioLCdzkPuCQtBwZTYwFAu9nIA3aVPouPUzdZh5JLG/distance.json/";
        Procedures temp =  priceLookupService.findProcbyDescrip(code);
       List <PriceLookup> distanceFinder =  priceLookupService.findbyProc(temp);
        RestTemplate restTemplate = new RestTemplate();

        for (PriceLookup pl: distanceFinder) {

            Distance response = restTemplate.getForObject(zipUrl + zip + "/" + pl.getHosp().getZip() + "/mile", Distance.class);
            pl.getHosp().setDistance(response.getDistance());
            System.out.println(pl.getHosp().getDistance());
        }
        Collections.sort(distanceFinder, new CustomComparator());

        return distanceFinder;

    }
    public class CustomComparator implements Comparator<PriceLookup> {
        @Override
        public int compare(PriceLookup o1, PriceLookup o2) {
            return o1.getHosp().getDistance().compareTo(o2.getHosp().getDistance());
        }
    }

}

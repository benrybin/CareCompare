package com.example.CareCompare.Controllers;


import com.example.CareCompare.Models.Hospital;
import com.example.CareCompare.Models.PriceLookup;
import com.example.CareCompare.Repositories.PriceLookupRepository;
import com.example.CareCompare.Services.PriceLookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(path="/allprices")
    public List<PriceLookup> findallprices(){

        return priceLookupService.findAll();
    }
}

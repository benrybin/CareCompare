package com.example.CareCompare.Controllers;

import com.example.CareCompare.Models.DescripHolder;
import com.example.CareCompare.Models.Hospital;
import com.example.CareCompare.Models.PriceLookup;
import com.example.CareCompare.Models.Procedures;
import com.example.CareCompare.Repositories.ProceduresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ProceduresController {
    @Autowired
    private ProceduresRepository repoprocs;
    @PostMapping(path="/procedures/add")
    public String addProcedure(@RequestBody Procedures proc){
        repoprocs.save(proc);
        return "Saved";
    }
    @GetMapping(path="/procedures/search")
    public DescripHolder descripSearch(@RequestParam String search){
            List<Procedures> temp =  repoprocs.getByDescripContains(search);
            List<String>  holder = new ArrayList<>();

        for (Procedures proc: temp) {
            holder.add(proc.getDescrip());


        }

        return new DescripHolder(holder);
    }
}

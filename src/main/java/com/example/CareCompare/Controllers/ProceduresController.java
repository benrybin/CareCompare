package com.example.CareCompare.Controllers;

import com.example.CareCompare.Models.Hospital;
import com.example.CareCompare.Models.PriceLookup;
import com.example.CareCompare.Models.Procedures;
import com.example.CareCompare.Repositories.ProceduresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(path="/procedures/search/")
    public List<Procedures> descripSearch(@RequestParam String search){

        return repoprocs.getByDescripContains(search);
    }
}

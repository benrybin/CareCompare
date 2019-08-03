package com.example.CareCompare.Controllers;

import com.example.CareCompare.Models.Hospital;
import com.example.CareCompare.Models.Procedures;
import com.example.CareCompare.Repositories.ProceduresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}

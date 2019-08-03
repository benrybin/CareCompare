package com.example.CareCompare.Services;

import com.example.CareCompare.Models.Hospital;
import com.example.CareCompare.Models.PriceLookup;
import com.example.CareCompare.Models.Procedures;
import com.example.CareCompare.Repositories.HospitalRepository;
import com.example.CareCompare.Repositories.PriceLookupRepository;
import com.example.CareCompare.Repositories.ProceduresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceLookupService {
    @Autowired
    ProceduresRepository proceduresRepository;
    @Autowired
    HospitalRepository hospitalRepository;
    @Autowired
    PriceLookupRepository priceLookupRepository;

    public Hospital findHosp(Integer id){
        return hospitalRepository.findById(id).get();
    }

    public Procedures findProc(Integer id){

        return proceduresRepository.findById(id).get();
    }
    public void storePrice(Integer hospid,Integer procId,Double price){
        PriceLookup test = new PriceLookup();
        test.setHosp(hospitalRepository.findById(hospid).get());
        test.setProc(proceduresRepository.findById(procId).get());
        test.setPrice(price);

        priceLookupRepository.save(test);

    }
    public List <PriceLookup> findAll(){

        return priceLookupRepository.findAll();
    }

}

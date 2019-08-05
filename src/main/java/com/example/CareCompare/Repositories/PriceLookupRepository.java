package com.example.CareCompare.Repositories;

import com.example.CareCompare.Models.PriceLookup;
import com.example.CareCompare.Models.Procedures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceLookupRepository extends JpaRepository<PriceLookup,Integer> {
List<PriceLookup> getByProc(Procedures proc);

}

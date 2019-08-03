package com.example.CareCompare.Repositories;

import com.example.CareCompare.Models.PriceLookup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceLookupRepository extends JpaRepository<PriceLookup,Integer> {


}

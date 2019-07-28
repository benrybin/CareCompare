package com.example.CareCompare.Repositories;

import com.example.CareCompare.Models.Hospital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital,Integer> {
}

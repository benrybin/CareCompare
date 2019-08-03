package com.example.CareCompare.Repositories;

import com.example.CareCompare.Models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Integer> {


    @Override
    List<Hospital> findAllById(Iterable<Integer> iterable);
}

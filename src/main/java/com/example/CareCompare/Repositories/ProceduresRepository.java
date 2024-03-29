package com.example.CareCompare.Repositories;

import com.example.CareCompare.Models.Procedures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProceduresRepository extends JpaRepository<Procedures,Integer> {


    @Override
    List<Procedures> findAllById(Iterable<Integer> iterable);
    Procedures getByCode(String code);
    Procedures getByDescrip(String search);
    List<Procedures> getByDescripContains(String search);

}

package com.aubuisapi.AubuisResa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    List<Chambre> findAll();
}

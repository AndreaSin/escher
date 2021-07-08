package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Stampa;

public interface StampaRepository extends JpaRepository<Stampa,Integer> {

	
}

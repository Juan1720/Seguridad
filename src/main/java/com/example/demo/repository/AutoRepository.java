package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Autos;

public interface AutoRepository extends JpaRepository<Autos, Integer> {

}

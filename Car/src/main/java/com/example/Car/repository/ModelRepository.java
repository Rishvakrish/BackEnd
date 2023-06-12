package com.example.Car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Car.model.Model;


@Repository
public interface ModelRepository extends JpaRepository<Model,Integer> {

}

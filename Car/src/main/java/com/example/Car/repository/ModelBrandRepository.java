package com.example.Car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Car.model.ModelBrand;

@Repository
public interface ModelBrandRepository extends JpaRepository<ModelBrand,Integer>{

}

package com.example.Car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Car.model.ModelBrand;
import com.example.Car.repository.ModelBrandRepository;

@Service

public class ModelBrandService {
	@Autowired
	ModelBrandRepository b;
	public List<ModelBrand> fetchAllDetails()
	{
		return b.findAll();
	}
	public ModelBrand postModelBrand(ModelBrand j)
	{
		return b.save(j);
	}
	public void deleteModelBrand(int id)
	{
		b.deleteById(id);
	}
}

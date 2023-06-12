package com.example.Car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Car.model.ModelBrand;
import com.example.Car.service.ModelBrandService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class ModelBrandController {
	@Autowired
	ModelBrandService ao;
	//127.0.0.1:8080/fetchModelBrand
	@Tag(name="Get",description="get data")
	@GetMapping("/fetchModelBrand")
	public List<ModelBrand> fetchModelBrand()
	{
		return ao.fetchAllDetails();
	}
	@Tag(name="Post",description="save data")
	@PostMapping("/postModelBrand")
	public ModelBrand postModelBrand(@RequestBody ModelBrand k)
	{
		return ao.postModelBrand(k);
	}
	@Tag(name="Delete",description="delete data")
	@DeleteMapping(value="/deleteModelBrand/{id}")
	public void deleteModelBrand(@PathVariable int id)
	{
		ao.deleteModelBrand(id);
	}
}
	
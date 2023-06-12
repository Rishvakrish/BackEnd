package com.example.Car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Car.repository.ModelRepository;

@Service

public class ModelService {
	@Autowired
	ModelRepository k;
}

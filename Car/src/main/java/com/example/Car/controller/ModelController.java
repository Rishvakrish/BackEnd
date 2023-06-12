package com.example.Car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Car.service.ModelService;

@RestController
public class ModelController {
	@Autowired
	ModelService klo;
}

package com.example.Car.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ModelBrand {
	@Id
	@GeneratedValue
	private int id;
	private String brand;
	private String model;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="modelCount_id")
	private Model modelCount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Model getModelCount() {
		return modelCount;
	}
	public void setModelCount(Model modelCount) {
		this.modelCount = modelCount;
	}
}

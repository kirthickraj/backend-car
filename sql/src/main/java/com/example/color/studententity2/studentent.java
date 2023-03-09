package com.example.color.studententity2;

import jakarta.persistence.*;

@Entity
@Table(name="Car")
public class studentent {

	@Id
	private int id;
	private String name;
	private String brand;
	private int price;
	private String rating;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	public studentent(int id, String name, String brand, int price, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
	}
	public studentent() {
	
	}
	
}

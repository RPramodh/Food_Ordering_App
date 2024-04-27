package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FOOD_APP")

public class DemoEntity {
	
	public DemoEntity() {
		
	}
	
	
	
	public DemoEntity(String food, int price) {
		super();
		this.food = food;
		this.price = price;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	
	@Column(name="FOOD")
	private String food;
	
	@Column(name="PRICE")
	private int price;

	public String getFood() {
		return food;
	}



	public void setFood(String food) {
		this.food = food;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	

}

package com.example.caps.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="category_id", referencedColumnName = "category_id")
	private Category category;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Long id, String name, Category category, double price, String cloth_type, String description,
			String imageName) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.cloth_type = cloth_type;
		this.description = description;
		this.imageName = imageName;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", cloth_type="
				+ cloth_type + ", description=" + description + ", imageName=" + imageName + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getCategory()=" + getCategory() + ", getPrice()=" + getPrice()
				+ ", getCloth_type()=" + getCloth_type() + ", getDescription()=" + getDescription()
				+ ", getImageName()=" + getImageName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCloth_type() {
		return cloth_type;
	}
	public void setCloth_type(String cloth_type) {
		this.cloth_type = cloth_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	private String cloth_type;
	private String description;
	private String imageName;

}

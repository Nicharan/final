package com.example.caps.dta;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.caps.model.Category;

import lombok.Data;

@Data
public class ProductDTO {

	
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(Long id, String name, int categoryId, double price, String cloth_type, String description,
			String imageName) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.price = price;
		this.cloth_type = cloth_type;
		this.description = description;
		this.imageName = imageName;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", categoryId=" + categoryId + ", price=" + price
				+ ", cloth_type=" + cloth_type + ", description=" + description + ", imageName=" + imageName
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getCategoryId()=" + getCategoryId()
				+ ", getPrice()=" + getPrice() + ", getCloth_type()=" + getCloth_type() + ", getDescription()="
				+ getDescription() + ", getImageName()=" + getImageName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
	private Long id;
	private String name;
	private int categoryId;
	private double price;
	private String cloth_type;
	private String description;
	private String imageName;

	}



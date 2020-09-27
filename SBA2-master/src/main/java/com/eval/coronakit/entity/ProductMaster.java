package com.eval.coronakit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class ProductMaster {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotEmpty(message = "Please enter Product Name")
	@Length(min = 2, message = "** name should be a min of 2 chars")
	private String productName;

	@NotNull(message = "Please enter Cost ")
	@Min(value = 10, message = "** min cost should start from 10")
	private Integer cost;

	@NotEmpty(message = "Please enter Description")
	@Length(min = 5, message = "** desc should have a min of 5 chars")
	private String productDescription;
	
	public ProductMaster() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductMaster(int id, String productName, Integer cost, String productDescription) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.productDescription = productDescription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "ProductMaster [id=" + id + ", productName=" + productName + ", cost=" + cost + ", productDescription="
				+ productDescription + "]";
	}

}

	



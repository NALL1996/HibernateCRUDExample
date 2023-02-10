package com.sivasoft.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Product_Tab")
public class Product {
	
	@Id
	@Column(name="p_id")
	private int productId;
	@Column(name="p_name")
	private String name;
	private Double price;
	private Date mDate;

	public Product() {
	}

	public Product(int productId, String name, Double price, Date mDate) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.mDate = mDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getmDate() {
		return mDate;
	}

	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", mDate=" + mDate + "]";
	}

}

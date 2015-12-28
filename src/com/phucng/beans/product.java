package com.phucng.beans;

public class product {
	private int product_id;
	private String product_name;
	private double product_price;
	private double product_price_promotion;
	private String description;
	private int product_category_id;
	private String product_image;
	private String maker_date;
	private String maker;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public double getProduct_price_promotion() {
		return product_price_promotion;
	}
	public void setProduct_price_promotion(double product_price_promotion) {
		this.product_price_promotion = product_price_promotion;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProduct_category_id() {
		return product_category_id;
	}
	public void setProduct_category_id(int product_category_id) {
		this.product_category_id = product_category_id;
	}
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
	public String getMaker_date() {
		return maker_date;
	}
	public void setMaker_date(String maker_date) {
		this.maker_date = maker_date;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public product(int product_id, String product_name, double product_price,
			double product_price_promotion, String description,
			int product_category_id, String product_image, String maker_date,
			String maker) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_price_promotion = product_price_promotion;
		this.description = description;
		this.product_category_id = product_category_id;
		this.product_image = product_image;
		this.maker_date = maker_date;
		this.maker = maker;
	}
	
	
	
}

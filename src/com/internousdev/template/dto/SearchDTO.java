package com.internousdev.template.dto;

public class SearchDTO {

private String item_name;
	private int product_id;
	private String product_name;
	private String product_description;
	private int category_id;
	private int price;
	private String image_file_path;
	private String image_file_name;
	private int release_data;
	private String release_company;
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
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage_file_path() {
		return image_file_path;
	}
	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}
	public String getImage_file_name() {
		return image_file_name;
	}
	public void setImage_file_name(String image_file_name) {
		this.image_file_name = image_file_name;
	}
	public int getRelease_data() {
		return release_data;
	}
	public void setRelease_data(int release_data) {
		this.release_data = release_data;
	}
	public String getRelease_company() {
		return release_company;
	}
	public void setRelease_company(String release_company) {
		this.release_company = release_company;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}



}

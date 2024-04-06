//package com.rensquare.finance.BillingSoftware.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//
//public class InvoiceItem {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private Product product;
//    private double itemPrice;
//    private int quantity;
//
//    public InvoiceItem(String itemName, double itemPrice, int quantity) {
//        this.product=product;
//        this.itemPrice = itemPrice;
//        this.quantity = quantity;
//    }
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//
//	public double getItemPrice() {
//		return itemPrice;
//	}
//
//	public void setItemPrice(double itemPrice) {
//		this.itemPrice = itemPrice;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//}
package com.W12;

public class Barang {
	
	BarangStatus status;
	BarangService servicePackage;
	BarangCity city;
	
	int weight;
	int quantity;
	int priceItem;
	String productName;
	
	public class BarangStatus{
			int code;
			String description;
	}
		
	public class BarangService{
			String service;
			int value;
	}	
	
	public class BarangCity{
			String origin;
			String destination;
	}

}

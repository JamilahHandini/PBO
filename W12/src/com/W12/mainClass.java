package com.W12;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.ArrayList;


import com.google.gson.Gson;
import com.google.gson.reflect.*;

public class mainClass {
	public static void main(String[] args) {
		List<Barang> listBarang= new ArrayList<>();
		
		Gson gson = new Gson();
		
		try (Reader reader = new FileReader("C:\\KULIAH\\Semester 3\\PBO\\PBO Praktikum\\Tugas\\W12\\W12\\src\\com\\W12\\barang.json")) {

            // Convert JSON File to Java Object
            Type listType = new TypeToken<ArrayList<Barang>>(){}.getType();
              listBarang = gson.fromJson(reader, listType);

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		System.out.println("Barang 1");
		System.out.println("|"+listBarang.get(0).productName +
						   "|"+listBarang.get(0).quantity+
						   "|"+listBarang.get(0).weight+
						   "|"+ listBarang.get(0).city.destination+
						   "|"+ listBarang.get(0).servicePackage.service+
						   "|"+ listBarang.get(0).servicePackage.value+
						   "|"+ (listBarang.get(0).quantity*listBarang.get(0).priceItem));
		
		//total merupakan total harga yang diambil dari hasil kali quantity dan price item
		System.out.println(" ");
		System.out.println("Barang 2");
		System.out.println("|"+listBarang.get(1).productName +
				   "|"+listBarang.get(1).quantity+
				   "|"+listBarang.get(1).weight+
				   "|"+ listBarang.get(1).city.destination+
				   "|"+ listBarang.get(1).servicePackage.service+
				   "|"+ listBarang.get(1).servicePackage.value+
				   "|"+ (listBarang.get(1).quantity*listBarang.get(1).priceItem));
		
	} 
	
}

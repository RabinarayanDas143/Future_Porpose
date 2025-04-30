package com.example.WebDevelopment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AvenueRead {

	public static void main(String[] args) {
		String filePath = "D:/DLB_ej file/Avenues_Corporate_30-DEC-24.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line;
			String[] lines = null;
			while ((line = br.readLine()) != null) {
				lines = line.split("\\|");
				List<String> list = new ArrayList<>();
				for (int i = 0; i < 9; i++) {
				    list.add((lines.length > i && lines[i] != null) ? lines[i].trim() : "NA");
				}
				System.out.println("List is :"+ list);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

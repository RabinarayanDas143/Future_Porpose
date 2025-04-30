package com.example.WebDevelopment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SbiEPay {

	public static void main(String[] args) {
		String filePath = "D:/DLB_ej file/SBIePAY_DLBCorp_Recon_Plain_Text_22032025-07.59.51.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line;
			String[] lines = null;
			int count =1;
			while ((line = br.readLine()) != null) {
				if(count>2 && !line.contains("rows selected") && line.length()!=0) {
					count++;
					lines = line.split("\\^");
					List<String> list = new ArrayList<>();
					for (int i = 0; i < 6; i++) {
					    list.add((lines.length > i && lines[i] != null) ? lines[i].trim() : "NA");
					}
					System.out.println("List is :"+ list);
				}
				count++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

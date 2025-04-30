package com.example.WebDevelopment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DlbIccW {

	public static void main(String[] args) {

		String filePath = "D:/DLB_ej file/UPINFSRAWDATAACQDLB230225_1C.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			String[] lines = null;
			while ((line = br.readLine()) != null) {
				lines = line.split(",");
				List<String> list = new ArrayList<>();
				if(lines.length>=6) {
					list.add(lines[0] == null ? "NA" : lines[0].trim());
					list.add(lines[1] == null ? "NA" : lines[1].trim());
					list.add(lines[2] == null ? "NA" : lines[2].trim());
					list.add(lines[3] == null ? "NA" : lines[3].trim());
					list.add(lines[4] == null ? "NA" : lines[4].trim());
					list.add(lines[5] == null ? "NA" : lines[5].trim());
					list.add(lines[6] == null ? "NA" : lines[6].trim());
					list.add(lines[7] == null ? "NA" : lines[7].trim());
					list.add(lines[8] == null ? "NA" : lines[8].trim());
					list.add(lines[9] == null ? "NA" : lines[9].trim());
					list.add(lines[10] == null ? "NA" : lines[10].trim());
					list.add(lines[11] == null ? "NA" : lines[11].trim());
					list.add(lines[12] == null ? "NA" : lines[12].trim());
					list.add(lines[13] == null ? "NA" : lines[13].trim());
					list.add(lines[14] == null ? "NA" : lines[14].trim());
					list.add(lines[15] == null ? "NA" : lines[15].trim());
					list.add(lines[16] == null ? "NA" : lines[16].trim());
					list.add(lines[17] == null ? "NA" : lines[17].trim());
					list.add(lines[18] == null ? "NA" : lines[18].trim());
					list.add(lines[19] == null ? "NA" : lines[19].trim());
					list.add(lines[20] == null ? "NA" : lines[20].trim());
					list.add(lines[21] == null ? "NA" : lines[21].trim());
					list.add(lines[22] == null ? "NA" : lines[22].trim());
					list.add(lines[23] == null ? "NA" : lines[23].trim());
					list.add(lines[24] == null ? "NA" : lines[24].trim());
					list.add(lines[25] == null ? "NA" : lines[25].trim());
					
					System.out.println(list);
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

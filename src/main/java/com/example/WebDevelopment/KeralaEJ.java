package com.example.WebDevelopment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KeralaEJ {
	public static void main(String[] args) {

		String filePath = "D:/Kerala_EJ file/EJ 130125/92264001/20250111.jrn";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String lines;
			List<List<String>> records = new ArrayList<>();
			List<String> record = new ArrayList<>();
			while ((lines = br.readLine()) != null) {
				if (lines.startsWith("---")) {
					lines = br.readLine();
					Pattern pattern = Pattern.compile("^\\d");
					Matcher matcher = pattern.matcher(lines);
                    boolean flag = matcher.find();
					if (flag) {
						continue;
					}  
						String date = null, year = null, time = null, atm_id = null, ref_no = null, crd_no = null,
								acc_no = null, txn_no = null, disp = null, desp = null, resp_code = null, req = null;

						String[] parts = lines.split("[,\\s]+");
						date = parts[0].concat(" " + parts[1]);
						year = parts[2];
						time = parts[3];
						atm_id = parts[4];

						lines = br.readLine();
						if (lines.startsWith("REF")) {
							String[] REF = lines.split(" ");
							ref_no = REF[1];
						}

						lines = br.readLine();
						if (lines.startsWith("CRD")) {
							String[] CRD = lines.split(" ");
							crd_no = CRD[1];
						}

						lines = br.readLine();
						if (lines.startsWith("ACC")) {
							String[] ACC = lines.split(" ");
							acc_no = ACC[1];
						}

						lines = br.readLine();
						if (lines.startsWith("TXN")) {
							String[] TXN = lines.split(" ");
							txn_no = TXN[1].concat(" " + TXN[2]);
						}

						lines = br.readLine();
						if (lines.startsWith("DISP")) {
							String regex = "[0-9]+(?:\\.[0-9]+)?";
							Pattern pattern1 = Pattern.compile(regex);
							Matcher matcher1 = pattern1.matcher(lines);
							if (matcher1.find()) {
								disp = matcher1.group();
							}

							lines = br.readLine();
							if (lines.startsWith("DESC") || lines.startsWith(" ")) {
								if (lines.startsWith("DESC")) {
									String[] DESC = lines.split(" ");
									desp = DESC[1].concat(" "+DESC[2]);
								} else if (lines.startsWith(" ")) {
									desp = lines.toString();
								}
							}

							lines = br.readLine();
							String[] RESP = lines.split(" ");
							resp_code = RESP[1];

							lines = br.readLine();
							req = lines.toString();
						} else if (lines.startsWith("RESP")) {
							String[] RESP = lines.split(" ");
							crd_no = RESP[1];

							lines = br.readLine();
							req = lines.toString();
						}

						record.add(date);
						record.add(year);
						record.add(time);
						record.add(atm_id);
						record.add(ref_no);
						record.add(crd_no);
						record.add(acc_no);
						record.add(txn_no);
						record.add(disp);
						record.add(desp);
						record.add(resp_code);
						record.add(req);

						// Add the record list to the main list
						records.add(record);
						System.out.println(record);
						record = new ArrayList<>();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

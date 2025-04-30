package com.example.WebDevelopment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DLBEjFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:/DLB_ej file/DAP12063_ej28112024";

		String date = "", time = "", atm_id = "", res = "", location = "", card_no = "", res_code = "", status = "",
				amount = "", txn = "", fr = "", resp = "", ac = "";
		String[] coumnArray = { date, time, atm_id, res, location, card_no, res_code, status, amount, txn, fr, resp,
				ac };
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			int count = 0;
			List<List<String>> arraylist = new ArrayList<>();
			while ((line = br.readLine()) != null) {
				List<String> list = new ArrayList<>();

				boolean flag = false;
				if (line.contains("DAP")) {
					flag = true;
					if (flag) {
						String[] lines = line.split("\\s+");
						if (lines.length <= 3) {
							date = lines[0];
							time = lines[1];
							atm_id = lines[2];
//							list.add(date);
//							list.add(time);
//							list.add(atm_id);
//							list.add(res);
//							System.out.println("Date :" + date);
//							System.out.println("time :" + time);
//							System.out.println("atm_id :" + atm_id);
//							System.out.println("resp :" + res);
						} else if (lines.length > 3) {
							date = lines[0];
							time = lines[1];
							atm_id = lines[2];
							res = lines[3];
//							list.add(date);
//							list.add(time);
//							list.add(atm_id);
//							list.add(res);
//							System.out.println("Date :" + date);
//							System.out.println("time :" + time);
//							System.out.println("atm_id :" + atm_id);
//							System.out.println("resp :" + res);
						}
//						date = "";
//						time = "";
//						atm_id = "";
//						res = "";
					}
					line = br.readLine();
					if (line.contains("LOC")) {
						String[] locLines = line.split("\\s+");
						location = locLines[2];
						line = br.readLine();
					}
					// matches CARD NO and REC
					if (line.contains("CARD NO") || line.contains("REC")) {
						if (line.contains("CARD NO") && !line.contains("REC")) {
							String[] CARD_lines = line.split("\\s+");
							if (CARD_lines.length == 3) {
								card_no = CARD_lines[2];
								res_code = " ";
//								list.add(card_no);
//								list.add(res_code);
//								System.out.println("card_no :" + card_no);
//								System.out.println("res_code :" + res_code);
//								card_no = " ";
//								res_code = " ";
							} else if (CARD_lines.length == 2) {
								card_no = " ";
								res_code = " ";
//								list.add(card_no);
//								list.add(res_code);
//								System.out.println("card_no :" + card_no);
//								System.out.println("res_code :" + res_code);
//								card_no = " ";
//								res_code = " ";
							}
						} else if (!line.contains("CARD NO") && line.contains("REC") && !line.contains("INCORRECT")) {
							String[] CARD_lines = line.split("\\s+");
							if (CARD_lines.length == 3) {
								card_no = CARD_lines[0];
								res_code = CARD_lines[2];
//								list.add(card_no);
//								list.add(res_code);
//								System.out.println("card_no :" + card_no);
//								System.out.println("res_code :" + res_code);
//								card_no = " ";
//								res_code = " ";
							}
						}

						///////// CARD NO and REC end here ///////

						line = br.readLine();

						if (line.contains("WITHDRAWAL") && line.contains("RS")) {
							String[] RS_lines = line.split("\\s+");
							status = RS_lines[0];
							amount = RS_lines[2];
							txn = " ";
//							list.add(status);
//							list.add(amount);
//							list.add(txn);
//							System.out.println("status :" + status);
//							System.out.println("amount :" + amount);
//							System.out.println("txn :" + txn);
//							status = " ";
//							amount = " ";
//							txn = " ";
						} else if (line.contains("CASH WDL") && line.contains("RS")) {
							String[] RS_lines = line.split("\\s+");
							status = RS_lines[0].concat(RS_lines[1]);
							amount = RS_lines[3];
							txn = " ";
//							list.add(status);
//							list.add(amount);
//							list.add(txn);
//							System.out.println("status :" + status);
//							System.out.println("amount :" + amount);
//							System.out.println("txn :" + txn);
//							status = " ";
//							amount = " ";
//							txn = " ";
						} else if (line.contains("RS") && line.contains("TXN")) {
							String[] RS_lines = line.split("\\s+");
							status = " ";
							amount = RS_lines[1];
							txn = RS_lines[3];
//							list.add(status);
//							list.add(amount);
//							list.add(txn);
//							System.out.println("status :" + status);
//							System.out.println("amount :" + amount);
//							System.out.println("txn :" + txn);
//							status = " ";
//							amount = " ";
//							txn = " ";
						} else if (line.contains("MINI STATEME") && line.contains("RS")) {
							String[] RS_lines = line.split("\\s+");
							status = RS_lines[0].concat(RS_lines[1]);
							amount = RS_lines[3];
							txn = " ";
//							list.add(status);
//							list.add(amount);
//							list.add(txn);
//							System.out.println("status :" + status);
//							System.out.println("amount :" + amount);
//							System.out.println("txn :" + txn);
//							status = " ";
//							amount = " ";
//							txn = " ";
						} else if (line.contains("BAL INQ")) {
							status = " ";
							amount = " ";
							txn = " ";
//							list.add(status);
//							list.add(amount);
//							list.add(txn);
//							System.out.println("status :" + status);
//							System.out.println("amount :" + amount);
//							System.out.println("txn :" + txn);
//							status = " ";
//							amount = " ";
//							txn = " ";
						} else if (line.contains("PIN CHG") && line.contains("RS")) {
							String[] RS_lines = line.split("\\s+");
							status = RS_lines[0].concat(RS_lines[1]);
							amount = RS_lines[3];
							txn = " ";
//							list.add(status);
//							list.add(amount);
//							list.add(txn);
//							System.out.println("status :" + status);
//							System.out.println("amount :" + amount);
//							System.out.println("txn :" + txn);
//							status = " ";
//							amount = " ";
//							txn = " ";
						} else if (line.contains("RS") && !line.contains("PIN CHG") && !line.contains("BAL INQ")
								&& !line.contains("MINI STATEME") && !line.contains("CASH WDL")
								&& !line.contains("WITHDRAWAL") && !line.contains("TXN")) {
							String[] RS_lines = line.split("\\s+");
							status = " ";
							amount = RS_lines[2];
							txn = " ";
//							list.add(status);
//							list.add(amount);
//							list.add(txn);
//							System.out.println("status :" + status);
//							System.out.println("amount :" + amount);
//							System.out.println("txn :" + txn);
//							status = " ";
//							amount = " ";
//							txn = " ";
						}
						line = br.readLine();
						if (line.contains("FR")) {
							String[] frlines = line.split("\\s+");
							if (frlines.length == 2) {
								fr = null;
							} else {
								fr = frlines[2];
							}
//							list.add(fr);
//							System.out.println("FR :" + fr);
//							fr = "";

							line = br.readLine();
							if (line.contains("RESP")) {
								String[] resplines = line.split("\\s+");
								resp = resplines[1];
//								list.add(resp);
//								System.out.println("RESP :" + resp);
//								resp = "";
							} else {
								resp = line.trim();
//								list.add(resp);
//								System.out.println("RESP :" + resp);
//								resp = "";
							}
						} else {
							// Regular expression to match the two parts
							Pattern pattern = Pattern.compile("^(.*?)\\s+A/C(.*)$");

							// Create a matcher
							Matcher matcher = pattern.matcher(line);

							if (matcher.find()) {
								resp = matcher.group(1).trim();
								ac = matcher.group(2).trim();

//								System.out.println("resp :" + resp);
//								System.out.println("ac :" + ac);
//								list.add(resp);
//								list.add(ac);
							}
						}
						list.add(date);
						list.add(time);
						list.add(atm_id);
						list.add(res);
						list.add(location);
						list.add(card_no);
						list.add(res_code);
						list.add(status);
						list.add(amount);
						list.add(txn);
						list.add(fr);
						list.add(resp);
						list.add(ac);

						arraylist.add(list);
						list = new ArrayList<>();
						date = "";
						time = "";
						atm_id = "";
						res = "";
						location = "";
						card_no = "";
						res_code = "";
						status = "";
						amount = "";
						txn = "";
						fr = "";
						resp = "";
						ac = "";
						System.out.println("list is :" + arraylist);
						// System.out.println("==============================================");

					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.example.WebDevelopment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DLBEjFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:/DLB_ej file/DAP12063_ej03022025";

		String date = "", time = "", atm_id = "", res = "", location = "", card_no = "", res_code = "", status = "",
				amount = "", txn = "", fr = "", resp = "", ac = "", cdmError = "", recError = "";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			int count = 0;
			List<List<String>> arraylist = new ArrayList<>();
			while ((line = br.readLine()) != null) {
				List<String> list = new ArrayList<>();

				boolean flag = false;
				if (line.contains("TRANSACTION START")) {
					while ((line = br.readLine()) != null) {
						if (line.contains("CDM ERROR")) {
							StringBuilder sb = new StringBuilder();
							String[] error = line.split("\\s+");
							sb.append(error[3].concat(" ").concat(error[4]).concat(" ").concat(error[5]));

							line = br.readLine();
							sb.append(" "+line);

							line = br.readLine();
							String output = line.substring(line.indexOf(" ") + 1);
							sb.append(" "+output);

							cdmError = sb.toString();

							line = br.readLine();
						}

						if (line.contains("REC ERROR")) {
							StringBuilder sb = new StringBuilder();
							String[] error = line.split("\\s+");
							sb.append(error[3].concat(" ").concat(error[4]).concat(" ").concat(error[5]));

							line = br.readLine();
							String output = line.substring(line.indexOf(" ") + 2);
							sb.append(" "+output);

							recError = sb.toString();

							line = br.readLine();
						}

						if ((line.contains("DAP") || line.contains("DKL") || line.contains("DCN")
								|| line.contains("DGJ") || line.contains("DHY") || line.contains("DKA")
								|| line.contains("DMH") || line.contains("DMP") || line.contains("DMU")
								|| line.contains("DNC") || line.contains("DPB") || line.contains("DRJ")
								|| line.contains("DTN") || line.contains("DUP") || line.contains("DWB"))
								&& !line.contains("DHANLAXMI")) {
							flag = true;

							if (flag) {
								line = line.trim();
								String[] lines = line.split("\\s+");

								if (lines.length == 3) {
									date = lines[0];
									time = lines[1];
									atm_id = lines[2];
									res = null;
								} else if (lines.length == 4) {
									date = lines[0];
									time = lines[1];
									atm_id = lines[2];
									res = lines[3];
								}
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
										//
									} else if (CARD_lines.length == 2) {
										card_no = " ";
										res_code = " ";
										//
									}
								} else if (!line.contains("CARD NO") && line.contains("REC")
										&& !line.contains("INCORRECT")) {
									String[] CARD_lines = line.split("\\s+");
									if (CARD_lines.length == 3) {
										card_no = CARD_lines[0];
										res_code = CARD_lines[2];
										//
									}
								}

								///////// CARD NO and REC end here ///////

								line = br.readLine();

								if (line.contains("WITHDRAWAL") && line.contains("RS")) {
									String[] RS_lines = line.split("\\s+");
									status = RS_lines[0];
									amount = RS_lines[2];
									txn = " ";
									//
								} else if (line.contains("CASH WDL") && line.contains("RS")) {
									String[] RS_lines = line.split("\\s+");
									status = RS_lines[0].concat(RS_lines[1]);
									amount = RS_lines[3];
									txn = " ";
									//
								} else if (line.contains("RS") && line.contains("TXN")) {
									String[] RS_lines = line.split("\\s+");
									status = " ";
									amount = RS_lines[1];
									txn = RS_lines[3];
									//
								} else if (line.contains("MINI STATEME") && line.contains("RS")) {
									String[] RS_lines = line.split("\\s+");
									status = RS_lines[0].concat(RS_lines[1]);
									amount = RS_lines[3];
									txn = " ";
									//
								} else if (line.contains("BAL INQ")) {
									status = " ";
									amount = " ";
									txn = " ";
									//
								} else if (line.contains("PIN CHG") && line.contains("RS")) {
									String[] RS_lines = line.split("\\s+");
									status = RS_lines[0].concat(RS_lines[1]);
									amount = RS_lines[3];
									txn = " ";
									//
								} else if (line.contains("RS") && !line.contains("PIN CHG") && !line.contains("BAL INQ")
										&& !line.contains("MINI STATEME") && !line.contains("CASH WDL")
										&& !line.contains("WITHDRAWAL") && !line.contains("TXN")) {
									String[] RS_lines = line.split("\\s+");
									status = " ";
									amount = RS_lines[2];
									txn = " ";
									//
								}
								line = br.readLine();
								if (line.contains("FR")) {
									String[] frlines = line.split("\\s+");
									if (frlines.length == 2) {
										fr = null;
									} else {
										fr = frlines[2];
									}
									//

									line = br.readLine();
									if (line.contains("RESP")) {
										String[] resplines = line.split("\\s+");
										resp = resplines[1];
										//
									} else {
										resp = line.trim();
										//
									}
								} else {
									// Regular expression to match the two parts
									Pattern pattern = Pattern.compile("^(.*?)\\s+A/C(.*)$");

									// Create a matcher
									Matcher matcher = pattern.matcher(line);

									if (matcher.find()) {
										resp = matcher.group(1).trim();
										ac = matcher.group(2).trim();

										//
									}
								}
								boolean entry = true;
								while (entry) {
									line = br.readLine();
									if (line.contains("CDM ERROR")) {
										StringBuilder sb = new StringBuilder();
										String[] error = line.split("\\s+");
										sb.append(error[3].concat(" ").concat(error[4]).concat(" ").concat(error[5]));

										line = br.readLine();
										sb.append(" "+line);

										line = br.readLine();
										String output = line.substring(line.indexOf(" ") + 1);
										sb.append(" "+output);

										cdmError = sb.toString();

										line = br.readLine();
									}

									if (line.contains("REC ERROR")) {
										StringBuilder sb = new StringBuilder();
										String[] error = line.split("\\s+");
										sb.append(error[3].concat(" ").concat(error[4]).concat(" ").concat(error[5]));

										line = br.readLine();
										String output = line.substring(line.indexOf(" ") + 2);
										sb.append(" "+output);

										recError = sb.toString();

										line = br.readLine();
									}

									if (line.contains("TRANSACTION END")) {
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
										list.add(cdmError);
										list.add(recError);

										arraylist.add(list);
										System.out.println("List is : = " + list);
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
										cdmError = "";
										recError = "";

										entry = false;
									}
								}
							}

						} else if (line.contains("TRANSACTION END")) {

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
							list.add(cdmError);
							list.add(recError);

							arraylist.add(list);
							System.out.println("List is : = " + list);
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
							cdmError = "";
							recError = "";

						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

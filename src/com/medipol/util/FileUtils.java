package com.medipol.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	
	public static final String FILE_NAME = "Ogrenciler.csv";

	public static void writeFile(String str) {
		try {
			FileWriter fr = new FileWriter(FILE_NAME,true);
			fr.write(str+"\n");
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static String readFile() {
		StringBuilder stringBuilder = new StringBuilder();
		try {
            FileReader fr = new FileReader(FILE_NAME);
            BufferedReader br = new BufferedReader(fr);
            while(br.ready()){
                String satir = br.readLine();
                stringBuilder.append(satir+"\n");
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return stringBuilder.toString();
	}
}

package com.daicent;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFile {
	public static void main(String[] args) {
		// Cách 1: Dùng BufferedReader đọc từng dòng
		System.out.println("Cách 1: Dùng BufferedReader");
		File file = new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\exam1.txt");
		try {
			BufferedReader bufferReader = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
			String line =null;
			while (true) {
				line = bufferReader.readLine();
				if(line==null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Cách 2: Files.readAllLines: đọc hết file
		System.out.println("Cách 2: Files.readAllLines");
		try {
			List<String> allText= Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
			for(String line: allText) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}

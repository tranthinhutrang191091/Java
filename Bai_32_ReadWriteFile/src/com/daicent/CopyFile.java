package com.daicent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
	public static void main(String[] args) {
		try {
			File file_input = new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\exam1.txt");
			File file_targer = new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\exam2.txt");

			BufferedReader bufferedReader = new BufferedReader(new FileReader(file_input));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_targer));
			int line;
			int count = 0;
			while ((line = bufferedReader.read()) != -1) {
				bufferedWriter.write((char) line);
				count++;
			}
			bufferedWriter.close();
			System.err.println("Số ký tự là : " + count);
		} catch (Exception e) {
			System.err.println("Lỗi");
		}
	}
}

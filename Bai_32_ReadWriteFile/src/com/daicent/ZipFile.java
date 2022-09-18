package com.daicent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example.txt";
		FileOutputStream fos;
		fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Exam.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		File fileToZip = new File(path);
		FileInputStream fis = new FileInputStream(fileToZip);
		ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		zipOut.putNextEntry(zipEntry);
		byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zipOut.write(bytes, 0, length);
		}
		zipOut.close();
		fis.close();
		fos.close();

	}
}

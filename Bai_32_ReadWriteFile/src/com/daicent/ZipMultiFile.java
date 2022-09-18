package com.daicent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultiFile {
	public static void main(String[] args) throws IOException {
		List<String> listFile = Arrays.asList(
				"C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\exam1.txt",
				"C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\exam2.txt");
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example\\exam.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		for (String srcFile : listFile) {
			File filetoZip = new File(srcFile);
			FileInputStream fis = new FileInputStream(filetoZip);
			ZipEntry zipEntry = new ZipEntry(filetoZip.getName());
			zipOut.putNextEntry(zipEntry);
			byte[] bytes = new byte[1024];
			int length;
			while ((length = fis.read(bytes)) >= 0) {
				zipOut.write(bytes, 0, length);
			}

			fis.close();

		}
		zipOut.close();
		fos.close();
	}
}

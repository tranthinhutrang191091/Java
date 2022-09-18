package com.daicent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipFile {
	public static void main(String[] args) throws IOException {
		String fileZip = "C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\Example.zip";
		File destDir= new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_32_ReadWriteFile\\UnExample");
		byte[] buffer= new byte[1024];
		ZipInputStream zis= new ZipInputStream(new FileInputStream(fileZip));
		ZipEntry zipEntry= zis.getNextEntry();
		while (zipEntry!=null) {
			File newFile= newFile(destDir,zipEntry);
			if(zipEntry.isDirectory()) {
				if(!newFile.isDirectory()&&!newFile.mkdir()) {
					throw new IOException("Lỗi tạo folder "+newFile);
				}
			}else {
				File parent = newFile.getParentFile();
				if(!parent.isDirectory()&&!parent.mkdir()) {
					throw new IOException("Lỗi tạo folder "+parent);
					
				}
				FileOutputStream fos= new FileOutputStream(newFile);
				int length;
				while ((length=zis.read(buffer))>=0) {
					fos.write(buffer,0,length);
				}
				fos.close();
			}
			zipEntry= zis.getNextEntry();
		}
		zis.closeEntry();
		zis.close();
		
	}

	private static File newFile(File destDir, ZipEntry zipEntry) throws IOException {
		File destFile = new File(destDir, zipEntry.getName());
		String destDirPath = destDir.getCanonicalPath();
		String destFilePath = destFile.getCanonicalPath();
		if(!destFilePath.startsWith(destDirPath +File.separator)) {
			throw new IOException("Lỗi " + zipEntry.getName());
		}
		return destFile;
	}
}

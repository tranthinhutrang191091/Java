import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileExample {
	private File file;

	public FileExample(String nameFile) {
		this.file = new File(nameFile);
	}

	// Kiểm tra file có thực thi hay ko
	public boolean testFileExecute() {
		// canExecute(): Kiểm tra file có phải là file exe ko
		return this.file.canExecute();
	}

	// Kiểm tra file có thể đọc
	public boolean testFileRead() {
		// canRead(): Kiểm tra file có đọc đc ko
		return this.file.canRead();
	}

	// Kiểm tra file có thể ghi
	public boolean testFileWrite() {
		// canWrite(): Kiểm tra file có thể ghi ko
		return this.file.canWrite();
	}

	public void printPathFile() {
		// getAbsolutePath(): in ra đường dẫn của file
		System.out.println(this.file.getAbsolutePath());
	}

	public void printNameFile() {
		// getName(): in tên file
		System.out.println(this.file.getName());
	}

	public void testFileOrFolder() {
		// isDirectory(): kiểm tra là thư mực ko
		// isFile(): kiểm tra xem là file ko
		if (this.file.isDirectory()) {
			System.out.println("Đây là thư mục");
		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}
	}

	public void printListSubFile() {
		// listFiles(): Lấy danh sách file trong thư mục
		if (this.file.isDirectory()) {
			System.out.println("Đây là thư mục có tập tin hay thư mục con:");
			File[] subFile = this.file.listFiles();
			for (File x : subFile) {
				System.out.println(x.getAbsolutePath());
			}

		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin không có file con bên trong.");
		}
	}

	// Hiện cây thư mục
	public void printTreeFolder() {
		this.printTreeFolderDetail(this.file, 1);
	}

	public void printTreeFolderDetail(File file, int level) {

		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(file.getName());
		if (file.canRead() && file.isDirectory()) {
			File[] subArray = file.listFiles();

			for (File x : subArray) {
				printTreeFolderDetail(x, level + 1);
			}
		}
	}

	// Xóa thư mục và file
	public void deleteFolder(File file) {
		if (file.isFile()) {
			// Nếu là tập tin thì xóa luôn
			file.delete();
		} else if (file.isDirectory()) {
			// Nếu là thư mục thì lấy file con
			File[] subFile = file.listFiles();
			for (File x : subFile) {
				// Xóa file con
				deleteFolder(x);
			}
			// Xóa thư mục
			file.delete();
		}

	}

	public void renameFile(File file) {
		// renameTo(file): đổi tên file hoặc di chuyển file
		this.file.renameTo(file);
	}

	public void moveFiles(Path p1, Path p2) {
		// Sử dụng Files để thay đổi tên file hoặc di chuyển file
		try {
			Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void copyAll(File f1, File f2) {
		try {
			// Copy bản thân nó
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (f1.isDirectory()) {
			// Nếu là thư mục thì copy lần lượt
			File[] subFile = f1.listFiles();
			for (File file : subFile) {
				File fileNew = new File(f2.getAbsoluteFile() + "\\" + file.getName());
				copyAll(file, fileNew);
			}
		}
	}

}

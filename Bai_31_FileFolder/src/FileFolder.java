import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileFolder {

	public static void main(String[] args) {
		/*
		 * Lưu ý: MS Window: \ => \\ Ví dụ: "C:\\Folder1\\Folder2...\\File.xxx" Linux,
		 * MacOs: / Ví dụ: "/Folder1/Folder2/../File.xxx"
		 */
		// Hàm exists(): Kiểm tra thư mục hoặc tập tin có tồn tại

		File folder1 = new File("C:\\Users\\Admin\\Desktop\\Java");
		File folder2 = new File("C:\\Users\\Admin\\Desktop\\Java1");
		System.out.println("Kiểm tra folder1 có tồn tại không :" + folder1.exists());
		System.out.println("Kiểm tra folder2 có tồn tại không :" + folder2.exists());

		// Tạo thư mục
		// Cách 1: mkdir() => Tạo 1 thư mục
		File folder3 = new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_31_FileFolder\\Directory_1");
		folder3.mkdir();

		// Cách 2: mkdirs() => Tạo nhiều thư mục cùng lúc
		File folder4 = new File(
				"C:\\Users\\Admin\\Desktop\\Java\\Bai_31_FileFolder\\Directory_1\\Directory_2\\Directory_3");
		folder4.mkdirs();

		// Tạo tập tin File (có phần mở rộng: .exe, .txt)
		// Hàm createNewFile()
		File file1 = new File("C:\\Users\\Admin\\Desktop\\Java\\Bai_31_FileFolder\\Directory_1\\exam.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// Không có quyền tạo tập tin
			// Ổ cứng bị đầy
			// Đường dẫn bị sai
			// ...
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		int option = 0;
		String nameFile = "";
		System.out.print("Nhập file: ");
		nameFile = sc.nextLine();
		System.out.println();
		FileExample fileExample = new FileExample(nameFile);
		File fileOld = new File(nameFile);
		System.out.print("Nhập file mới: ");
		String t = sc.nextLine();
		System.out.println();
		File fileNew = new File(t);
		do {
			System.out.println("__________MENU________");
			System.out.println("0. Thoát! ");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. Đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra file là thư mục hay tập tin: ");
			System.out.println("7. In ra danh sách file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("9. Xóa file hoặc folder: ");
			System.out.println("10. Đổi tên file hặc di chuyển file: ");
			System.out.println("11. Copy: ");
			System.out.println("12. Đổi tên file hặc di chuyển file: ");

			System.out.print("Chọn: ");
			option = sc.nextInt();

			switch (option) {
			case 1: {
				System.out.println("File: " + nameFile + " có thể thực thi:" + fileExample.testFileExecute());
				break;
			}
			case 2: {
				System.out.println("File: " + nameFile + " có thể đọc:" + fileExample.testFileRead());
				break;
			}
			case 3: {
				System.out.println("File: " + nameFile + " có thể ghi:" + fileExample.testFileWrite());
				break;
			}
			case 4: {
				fileExample.printPathFile();
				break;
			}
			case 5: {
				fileExample.printNameFile();
				break;
			}
			case 6: {
				fileExample.testFileOrFolder();
				break;
			}
			case 7: {
				fileExample.printListSubFile();
				break;
			}
			case 8: {
				fileExample.printTreeFolder();
				break;
			}
			case 9: {
				fileExample.deleteFolder(fileOld);
				break;
			}
			case 10: {
				fileExample.renameFile(fileNew);
				break;
			}
			case 11: {
				fileExample.copyAll(fileOld, fileNew);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);

			}

		} while (option != 0);

	}
}

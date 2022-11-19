package day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateAndDel {
	public static void main(String[] args) {
//		write1();
//		createDir();
//		deleteFile();
		deleteDir();
		
	}

	private static void deleteDir()  {
		Path deleteDirPath = Path.of("src/day19/Delete_Or_Create");
		if(Files.exists(deleteDirPath)) {
			try {
				Files.delete(deleteDirPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			try {
				Files.createDirectories(deleteDirPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	private static void deleteFile() {
		Path delFilePath = Path.of("src/day19/write1_data.txt");
		try {
			Files.delete(delFilePath);
			System.out.println("File deleted!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void createDir() {
		Path path2 = Path.of("src/day19/text_dir");
		try {
			Files.createDirectories(path2);
			System.out.println("Created Dir");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void write1() {
		Path path1 = Path.of("src/day19/write1_data.txt");

		try {
			Files.createFile(path1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Created");
	}
}

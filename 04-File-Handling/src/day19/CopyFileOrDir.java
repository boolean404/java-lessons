package day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyFileOrDir {
	public static void main(String[] args) {
//		copyFile();
		
	}

	private static void copyFile() {
		Path source = Path.of("src/day19/cop_file.txt");
		Path dest = Path.of("src/day19/data/copied_file.txt");

		try {
			Files.copy(source, dest);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

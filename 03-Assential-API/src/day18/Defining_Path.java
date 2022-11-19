package day18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Defining_Path {
	public static void main(String[] args) throws IOException {
		Path path1 = Path.of("./src/day18/test.txt");
		Path path2 = Path.of("./src/day18/Test_Dir");

		// create file
//		if(!Files.exists(path1)) {
//			Files.createFile(path1);
//			System.out.println("created file");
//		}

		// create dir
//		if(!Files.exists(path2)) {
//			Files.createDirectories(path2);
//			System.out.println("Created Director!");
//		}
		if (Files.exists(path1)) {
			Files.delete(path1);
			System.out.println("File path1 deleted");
		}
		if (Files.exists(path2)) {
			Files.delete(path2);
			System.out.println("Director path2 deleted");
		}
	}

}
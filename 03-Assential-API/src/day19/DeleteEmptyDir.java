package day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteEmptyDir {
	public static void main(String[] args) throws IOException {
//		delEmpDir();
//		delNonEmpDir();
	}

	private static void delNonEmpDir() throws IOException {
		Path path2 = Path.of("src/day19/Test_Dir1");
		if(Files.exists(path2))	{
			Files.walk(path2)
			.map(p->p.toFile())
			.forEach(f->f.delete());
			
			Files.delete(path2);
		}
		
	}

	private static void delEmpDir() {
		Path path1 = Path.of("src/day19/Test_Dir2");

		try {
			boolean bol = Files.deleteIfExists(path1);
			System.out.println(bol ? "Deleted" : "No Dir");
		} catch (IOException e) {
			e.getMessage();
		}
	}
}

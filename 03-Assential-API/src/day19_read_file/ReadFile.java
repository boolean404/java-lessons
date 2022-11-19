package day19_read_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
	public static void main(String[] args) throws IOException {
//		Files.createFile(Path.of("src/day19_read_file/test1.txt"));
		readFileWithFiles_Line();

	}

	private static void readFileWithFiles_Line() throws IOException {
		Path path1 = Path.of("src/day19_read_file/test1.txt");
		// read file
		System.out.println("Read file with Files.line");
		try (Stream<String> data = Files.lines(path1)) {
//			List<String> dataList = data.toList();
			List<String> dataList = data.filter(f -> f.contains("Hello")).collect(Collectors.toList());

			dataList.forEach(a -> System.out.println(a));
			System.out.println("readed");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// with charset
		System.out.println("with charset with upper case");
		try (Stream<String> data = Files.lines(path1, StandardCharsets.UTF_8)) {
			data.map(d -> d.toUpperCase()).forEach(System.out::println);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// using parallel stream
		System.out.println("Using parallel stram");
		Stream<String> data = Files.lines(path1).parallel();
		List<String> list = data.collect(Collectors.toList());
		System.out.println(list);

		// using BufferedReader
		System.out.println("Using BufferReader");
		try (BufferedReader reader = Files.newBufferedReader(path1)) {
			String currentLine = null;
			while ((currentLine = reader.readLine()) != null) {
				System.out.println(currentLine);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}

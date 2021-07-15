package ui;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FileIOApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String dirString = "/Users/matt/temp/subfolder2";
		Path dirPath = Paths.get(dirString);
		
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("Directories created.");
		}
		
		// Create file if it doesn't exist
		String fileString = "items.txt";
		Path filePath = Paths.get(dirString, fileString);
		
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println("File Created!");
		}
		
		// Create file using relative path
		fileString = "test-file.txt";
		filePath = Paths.get(fileString);
		 if (Files.notExists(filePath)) {
			 Files.createFile(filePath);
			 System.out.println("File Created!!");
		 }
		 
		 // Info about a file
		 System.out.println("File name: " + filePath.getFileName());
		 System.out.println("Absolute Path: " + filePath.toAbsolutePath());
		 System.out.println("Is Writable: " + Files.isWritable(filePath));

		 
		 // Display files in a directory
		 if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			 System.out.println("Directory: " + dirPath.toAbsolutePath());
			 System.out.println("Files: ");
			 DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			 for (Path p : dirStream) {
				 if (Files.isRegularFile(p)) {
					 System.out.println("    " + p.getFileName());
				 }
			 }
			 
		 }
		

	}

}

package borea_editor.data_manager;


import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.HashMap;

public class FileManipulator {

	public static HashMap<String,Boolean> loadedFiles = new HashMap<String,Boolean>();






	public static ArrayList<String> LoadFile(File file) {


		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		ArrayList<String> lines = null;

		try {

			fileReader = new FileReader(file.getAbsolutePath());
			bufferedReader = new BufferedReader(fileReader);

			lines = new ArrayList<String>();


			String current=null;

			while((current=bufferedReader.readLine())!=null) {
				lines.add(current);
			}


		} catch(Exception e) {

			e.printStackTrace();

		} finally {

			CloseReaderStreams(fileReader,bufferedReader);

		}

		return lines;


	}


	public static void SaveEditedFile(String editedFileContent,String filepath) {

		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter(filepath);
			fileWriter.write(editedFileContent);

		} catch(Exception e) {

		} finally {
			CloseWriterStreams(fileWriter);
		}




	}





	private static void CloseReaderStreams(FileReader fileReader,BufferedReader bufferedReader) {

		try {bufferedReader.close();} catch(Exception e) {}
		try {fileReader.close();} catch(Exception e) {}

	}


	private static void CloseWriterStreams(FileWriter fileWriter) {
		try {fileWriter.close();} catch (Exception e) {}
	}


}
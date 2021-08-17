package borea_editor.controller;

import javax.swing.JFileChooser;
import java.io.File;
import java.util.ArrayList;

import borea_editor.data_manager.FileManipulator;
import borea_editor.output.panels.EditorArea;

public class RelatedToolBarController {


	public static void OnOpenFileItem() {


		Runnable runnable = new Runnable() {

			@Override
			public void run(){
		
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				fileChooser.showOpenDialog(null);

				File selectedFile=fileChooser.getSelectedFile();

				if(selectedFile!=null) {

					ArrayList<String> lines = null;

					lines = FileManipulator.LoadFile(selectedFile);

					if(lines!=null) {

						EditorArea.DisplayFile(selectedFile.getAbsolutePath(),selectedFile.getName(),lines);

					}

				}



			}

		};

		Thread th = new Thread(runnable);
		th.start();

		
		
	}


	public static void OnExitItem() {
		System.exit(0);
	}



}
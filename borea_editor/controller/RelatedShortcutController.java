package borea_editor.controller;

import borea_editor.output.components.StatusBar;
import borea_editor.output.panels.EditorArea;
import borea_editor.data_manager.FileManipulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class RelatedShortcutController {




	public static void OnSaveFile() {

		StatusBar.ShowSave(true);

		FileManipulator.SaveEditedFile(EditorArea.GetEditedFileContent(),EditorArea.current_file_edited_path);



		Timer timer = new Timer(1000,new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				StatusBar.ShowSave(false);

			}


		});
	
		timer.setRepeats(false);
		timer.start();


		

	}


	public static void OnCallRename() {

		StatusBar.RenameShow();

	}


}
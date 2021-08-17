package borea_editor.output.panels;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.util.ArrayList;


import borea_editor.output.main.VisualMain;
import borea_editor.output.preferences.PreferencesBoard;
import borea_editor.output.utilities.Metrics;
import borea_editor.output.components.TitleBar;

public class EditorArea extends JPanel {



	private static JTabbedPane tabbedPane;
	private static JScrollPane scrollPane;
	public static String current_file_edited_path = null;

	public EditorArea() {

		Build();
		LoadComponents();

	}


	public void Build() {

		this.setBounds(
			PreferencesBoard.editorArea_left,
			PreferencesBoard.editorArea_top,
			PreferencesBoard.editorArea_width,
			PreferencesBoard.editorArea_height
		);

		this.setLayout(null);
		this.setBackground(PreferencesBoard.editorArea_background);
		

	}



	public void LoadComponents() {

		tabbedPane = new JTabbedPane();
		


		tabbedPane.setBounds(
			0,
			0,
			this.getWidth(),
			this.getHeight()
		);

		tabbedPane.setVisible(false);
		
		this.add(tabbedPane);

	}



	public static void DisplayFile(String path,String filename,ArrayList<String> fileContent) {

	
		JTextArea textArea = new JTextArea();
		textArea.setBackground(PreferencesBoard.editorArea_background);
		textArea.setForeground(PreferencesBoard.toolBar_menu_foreground);
		textArea.setFont(PreferencesBoard.textArea_font);
		textArea.setTabSize(4);
		textArea.setCaretColor(PreferencesBoard.toolBar_menu_foreground);

		textArea.addKeyListener(VisualMain.keyControl);


		for(String linea:fileContent) {
			textArea.append(linea+"\n");
		}


		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(0,0,PreferencesBoard.editorArea_width,PreferencesBoard.editorArea_height);

		tabbedPane.addTab(filename,scrollPane);


		FocusEditorTab(scrollPane,path);

		tabbedPane.setVisible(true);

	}



	public static void FocusEditorTab(JScrollPane scroll,String path) {

		tabbedPane.setSelectedComponent(scroll);
		current_file_edited_path = path;
		TitleBar.ChangeTitle(path);
	
	}



	public static String GetEditedFileContent() {

		String editedFileContent = null;

		if(tabbedPane.getTabCount()!=0) {
			
			editedFileContent =((JTextArea) ((JScrollPane)tabbedPane.getSelectedComponent()).getViewport().getView()).getText();
		}

		return editedFileContent;

	}


}
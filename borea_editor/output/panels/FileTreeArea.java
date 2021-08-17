package borea_editor.output.panels;

import javax.swing.JPanel;

import borea_editor.output.preferences.PreferencesBoard;
import javax.swing.JTree;
import javax.swing.JScrollPane;



public class FileTreeArea extends JPanel {


	public FileTreeArea() {

		Build();
		LoadComponents();

	}


	public void Build() {

		this.setBounds(
			PreferencesBoard.fileTreeArea_left,
			PreferencesBoard.fileTreeArea_top,
			PreferencesBoard.fileTreeArea_width,
			PreferencesBoard.fileTreeArea_height
		);

		this.setLayout(null);
		this.setBackground(PreferencesBoard.window_background);

	}


	public void LoadComponents() {

		JTree fileTree = new JTree();


		JScrollPane scrollPane = new JScrollPane(fileTree);
		scrollPane.setBounds(

			10,40,(this.getWidth()-20),(this.getHeight()-50)

		);

		scrollPane.getViewport().getView().setBackground(PreferencesBoard.toolBar_background);
		this.add(scrollPane);

	}


}
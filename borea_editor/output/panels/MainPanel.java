package borea_editor.output.panels;

import javax.swing.JPanel;
import borea_editor.output.preferences.PreferencesBoard;
import borea_editor.output.components.TitleBar;
import borea_editor.output.components.ToolBar;
import borea_editor.output.components.StatusBar;
import borea_editor.output.panels.EditorArea;
import borea_editor.output.panels.FileTreeArea;



public class MainPanel extends JPanel {

	private TitleBar titleBar;
	private ToolBar toolBar;
	private StatusBar statusBar;
	private EditorArea editorArea;
	private FileTreeArea fileTreeArea;

	public MainPanel() {

		Build();
		LoadComponents();


	}


	public void Build() {
	
		this.setBounds(
			PreferencesBoard.mainPanel_left,
			PreferencesBoard.mainPanel_top,
			PreferencesBoard.mainPanel_width,
			PreferencesBoard.mainPanel_height
		);

		this.setBackground(PreferencesBoard.window_background);


		this.setLayout(null);


	}

	public void LoadComponents() {

		titleBar = new TitleBar();
		this.add(titleBar);


		toolBar = new ToolBar();
		this.add(toolBar);


		statusBar = new StatusBar();
		this.add(statusBar);

		editorArea = new EditorArea();
		this.add(editorArea);

		fileTreeArea = new FileTreeArea();
		this.add(fileTreeArea);


	}



}
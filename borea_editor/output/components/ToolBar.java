package borea_editor.output.components;


import javax.swing.JPanel;
import borea_editor.output.components.MenuBar;



import borea_editor.output.preferences.PreferencesBoard;

public class ToolBar extends JPanel {


	private MenuBar menuBar;


	public ToolBar() {

		Build();
		LoadComponents();

	}



	public void Build() {

		this.setBounds(
			PreferencesBoard.toolBar_left,
			PreferencesBoard.toolBar_top,
			PreferencesBoard.toolBar_width,
			PreferencesBoard.toolBar_height
		);

		this.setLayout(null);
		this.setBorder(PreferencesBoard.topAndBottom_border);
		this.setBackground(PreferencesBoard.toolBar_background);

	}


	public void LoadComponents() {
		
		menuBar = new MenuBar();

		this.add(menuBar);


	}


}
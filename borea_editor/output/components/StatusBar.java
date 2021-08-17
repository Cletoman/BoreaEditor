package borea_editor.output.components;

import javax.swing.JPanel;
import javax.swing.JLabel;

import borea_editor.output.preferences.PreferencesBoard;
import borea_editor.output.utilities.Metrics;
import borea_editor.data_manager.ResourceManipulator;


public class StatusBar extends JPanel{


	private static JLabel handIcon;
	private static JLabel floppySave;

	public StatusBar() {

		Build();
		LoadComponents();

	}



	public void Build() {


		this.setBounds(
			PreferencesBoard.statusBar_left,
			PreferencesBoard.statusBar_top,
			PreferencesBoard.statusBar_width,
			PreferencesBoard.statusBar_height
		);

		this.setLayout(null);
		this.setBorder(PreferencesBoard.statusBar_border);
		this.setBackground(PreferencesBoard.statusBar_background);

	}



	public void LoadComponents() {



		handIcon = new JLabel();
		handIcon.setBounds(
			30,
			0,
			62,
			33
		);
		ResourceManipulator.LoadIcon(handIcon,"hand.gif");
		handIcon.setVisible(false);

		this.add(handIcon);




		floppySave = new JLabel();
		floppySave.setBounds(

			30,0,30,30

		);

		floppySave.setVisible(false);
		ResourceManipulator.LoadIcon(floppySave,"floppy.gif");
		this.add(floppySave);

	}




	public static void RenameShow() {

		handIcon.setVisible(true);

	}


	public static void ShowSave(boolean type) {

		floppySave.setVisible(type);

	}


}
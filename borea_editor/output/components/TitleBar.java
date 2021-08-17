package borea_editor.output.components;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

import borea_editor.output.preferences.PreferencesBoard;
import borea_editor.output.utilities.Metrics;


public class TitleBar extends JPanel {

	private static JLabel title;


	public TitleBar() {

		Build();
		LoadComponents();

	}



	public void Build() {


		this.setBounds(
			PreferencesBoard.titleBar_left,
			PreferencesBoard.titleBar_top,
			PreferencesBoard.titleBar_width,
			PreferencesBoard.titleBar_height
		);

		this.setBackground(PreferencesBoard.titleBar_background);

		this.setLayout(null);

	}


	public void LoadComponents() {


		JPanel panelShadow = new JPanel();


		panelShadow.setBounds(
			PreferencesBoard.titleBar_shadow_left,
			PreferencesBoard.titleBar_shadow_top,
			PreferencesBoard.titleBar_shadow_width,
			PreferencesBoard.titleBar_shadow_height
		);

		panelShadow.setBackground(PreferencesBoard.titleBar_shadow_background);

		this.add(panelShadow);

		title = new JLabel("Borea Editor",SwingConstants.CENTER);

		title.setBounds(
			Metrics.PercentageOfComponentWidth(this,20),
			0,
			Metrics.PercentageOfComponentWidth(this,60),
			this.getHeight()
		);

		title.setFont(PreferencesBoard.title_font);
		title.setForeground(PreferencesBoard.title_foreground);

		this.add(title);



	}



	public static void ChangeTitle(String path) {
		title.setText("Borea Editor - "+path);
	}


}
/*
*
*@author Cris Taisigue Alvarez
*
*Aug 2021
*
*Alpha 1.1
*
*/


package borea_editor.output.main;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Insets;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;

import borea_editor.output.preferences.PreferencesBoard;
import borea_editor.output.panels.MainPanel;
import borea_editor.input.KeyControl;

public class VisualMain extends JFrame {

	private MainPanel mainPanel;
	public static KeyControl keyControl;

	public VisualMain() {

		Build();
		LoadComponents();

		this.setVisible(true);


	}



	public void Build() {


		this.setTitle("Borea Editor");
		this.setSize(PreferencesBoard.window_width,PreferencesBoard.window_height);


		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);

		mainPanel = new MainPanel();
		this.setContentPane(mainPanel);


		keyControl = new KeyControl();

		this.setFocusable(true);
		this.requestFocusInWindow();

		this.addKeyListener(VisualMain.keyControl);
		this.setOpacity(PreferencesBoard.window_transparency);



	}



	public void LoadComponents() {


	}



	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable(){

			public void run() {

				SetupLookAndFeel();

				new VisualMain();


			}

		});

	}



	private static void SetupLookAndFeel(){

		try {

			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			UIManager.put("MenuItem.background",PreferencesBoard.toolBar_background);
			UIManager.put("MenuItem.opaque",true);
			UIManager.put("MenuItem.foreground",PreferencesBoard.toolBar_menuItem_foreground);

			UIManager.put("PopupMenu.border",PreferencesBoard.popUp_border); 
		

			//UIManager.put("TabbedPane.contentAreaColor", new ColorUIResource(new Color(158, 112, 93)));
			UIManager.put("TabbedPane.borderHightlightColor", new ColorUIResource( Color.RED ));
UIManager.put("TabbedPane.darkShadow", new ColorUIResource( Color.RED ));



		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}


}
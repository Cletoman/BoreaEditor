
package borea_editor.output.preferences;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Font;

import borea_editor.output.utilities.Metrics;

public class PreferencesBoard {


	public static int window_width = Metrics.DeviceWidth(), window_height = Metrics.DeviceHeight();



	public static int mainPanel_left = 0,
					mainPanel_top = 0,
					mainPanel_width = Metrics.PercentageOfValue(window_width,100),
					mainPanel_height = Metrics.PercentageOfValue(window_height,100);




	public static int titleBar_left = mainPanel_left,
					titleBar_top = mainPanel_top,
					titleBar_width = mainPanel_width,
					titleBar_height = 31;
					// Metrics.PercentageOfValue(window_height,4);

	public static int titleBar_shadow_left = titleBar_left,
					titleBar_shadow_top = Metrics.PercentageOfValue(titleBar_top,100) + (Metrics.PercentageOfValue(titleBar_height,88)),
					titleBar_shadow_width = titleBar_width,
					titleBar_shadow_height = Metrics.PercentageOfValue(mainPanel_height,12);




	public static int toolBar_left = mainPanel_left,
					toolBar_top = (mainPanel_top+titleBar_top+titleBar_height),
					toolBar_width = mainPanel_width,
					toolBar_height =61;
					// Metrics.PercentageOfValue(mainPanel_height,8);


	public static int toolBar_menuBar_left = 0,
					toolBar_menuBar_top = 0,
					toolBar_menuBar_width = toolBar_width,
					toolBar_menuBar_height = Metrics.PercentageOfValue(toolBar_height,50);


	public static int statusBar_left = 0,
					statusBar_width = mainPanel_width,
					statusBar_height = 31,
					statusBar_top = mainPanel_height- statusBar_height;
					//Metrics.PercentageOfValue(mainPanel_height,4);



	public static int editorArea_left = Metrics.PercentageOfValue(mainPanel_width,25),
					editorArea_width =  Metrics.PercentageOfValue(mainPanel_width,75),
					editorArea_height = (statusBar_top - (toolBar_top+toolBar_height) ),
					editorArea_top = (toolBar_top+toolBar_height)+1;

	public static int fileTreeArea_left = 0,
					fileTreeArea_width = editorArea_left,
					fileTreeArea_height = (statusBar_top - (toolBar_top+toolBar_height) ),
					fileTreeArea_top = (toolBar_top+toolBar_height)+1;



	public static float window_transparency = 0.90f;

	public static Color window_background = new Color(57,57,57);

	public static Color statusBar_background = new Color(89,93,216);

	public static Border statusBar_border = BorderFactory.createMatteBorder(2,0,0,0,new Color(122,126,236));


	public static Color titleBar_background = new Color(100,100,100);

	public static Color titleBar_shadow_background = new Color(90,90,90);


	public static Color toolBar_background = new Color(40,40,40);


	public static Color editorArea_background = new Color(30,30,30);


	public static Color toolBar_menu_foreground =Color.WHITE;
	// new Color(0,153,76);


	public static Font textArea_font = new Font("TimesRoman",Font.PLAIN,18);

	public static Font title_font = new Font("Arial",Font.BOLD,18);

	public static Color title_foreground = new Color(150,150,150);


	public static Color toolBar_menuItem_foreground = new Color(114,114,114);


	public static Border topAndBottom_border = BorderFactory.createMatteBorder(1,0,1,0,Color.BLACK);

	public static Border popUp_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);



	public static Font toolBar_menu_font = new Font("Arial",Font.BOLD,14);


}
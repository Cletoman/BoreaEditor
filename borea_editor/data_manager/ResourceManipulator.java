package borea_editor.data_manager;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.Image;

public class ResourceManipulator {

	private final static String IMAGE_DIR = "../res/img/";


	public static void LoadIcon(JLabel component,String path) {

		try {

			ImageIcon image;
			image = new ImageIcon(ResourceManipulator.class.getResource(IMAGE_DIR+path));
			Icon icon = new ImageIcon(image.getImage().getScaledInstance(component.getWidth(),component.getHeight(),Image.SCALE_DEFAULT));
			

			component.setIcon(icon);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
package borea_editor.output.utilities;

import javax.swing.JComponent;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Toolkit;

public class Metrics {


	private static final Dimension SCREEN_DIMENSIONS=Toolkit.getDefaultToolkit().getScreenSize();




	public static int DeviceWidth() {

		return SCREEN_DIMENSIONS.width;

	}

	public static int DeviceHeight() {

		return SCREEN_DIMENSIONS.height;

	}






	public static int PercentageOfDeviceWidth(double percentage) {

		return (int) Math.round( ( ( SCREEN_DIMENSIONS.width * percentage ) / 100 ) );

	}

	public static int PercentageOfDeviceHeight(double percentage) {

		return (int) Math.round( ( ( SCREEN_DIMENSIONS.height * percentage ) / 100 ) );

	}






	public static int PercentageOfWindowWidth(JFrame window, double percentage) {

		return (int) Math.round( ( ( window.getWidth() * percentage ) / 100 ) );

	}

	public static int PercentageOfWindowHeight(JFrame window, double percentage) {

		return (int) Math.round( ( ( window.getHeight() * percentage ) / 100 ) );

	}







	public static int PercentageOfComponentWidth(JComponent component, double percentage) {

		return (int) Math.round( ( ( component.getWidth() * percentage ) / 100 ) );

	}

	public static int PercentageOfComponentHeight(JComponent component, double percentage) {

		return (int) Math.round( ( ( component.getHeight() * percentage ) / 100 ) );
	}





	public static int PercentageOfValue(int value, double percentage) {

		return (int) Math.round( ( ( value * percentage ) / 100 ) );

	}






}
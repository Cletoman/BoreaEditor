package borea_editor.input;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import borea_editor.controller.RelatedToolBarController;
import borea_editor.controller.RelatedShortcutController;


public class KeyControl implements KeyListener{



	private HashMap<Integer,Boolean> pressedKeys = new HashMap<Integer,Boolean>();


	public KeyControl() {	

	}


	
	@Override
	public void keyPressed(KeyEvent e){

		pressedKeys.put(e.getKeyCode(),true);		


		if(pressedKeys.containsKey(KeyEvent.VK_O) && pressedKeys.containsKey(KeyEvent.VK_CONTROL)) {
		
			RelatedToolBarController.OnOpenFileItem();

		}

		if(pressedKeys.containsKey(KeyEvent.VK_S) && pressedKeys.containsKey(KeyEvent.VK_CONTROL)) {
		
			RelatedShortcutController.OnSaveFile();

		}

		if(pressedKeys.containsKey(KeyEvent.VK_N) && pressedKeys.containsKey(KeyEvent.VK_CONTROL)) {
		

		}



		if(pressedKeys.containsKey(KeyEvent.VK_R) && pressedKeys.containsKey(KeyEvent.VK_CONTROL)) {
		

			RelatedShortcutController.OnCallRename();

		}


	}


	


	@Override
	public void keyReleased(KeyEvent e){

		pressedKeys.remove(e.getKeyCode());

	}


	@Override
	public void keyTyped(KeyEvent e){
		
	}


}
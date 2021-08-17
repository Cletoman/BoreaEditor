package borea_editor.output.components;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JComponent;
import java.awt.Graphics;
import javax.swing.plaf.basic.BasicMenuBarUI;
import javax.swing.JMenuBar;

import borea_editor.output.preferences.PreferencesBoard;
import borea_editor.controller.RelatedToolBarController;

public class MenuBar extends JMenuBar implements ActionListener {



	private JMenuItem newFile;
	private JMenuItem openFile;
	private JMenuItem saveFile;
	private JMenuItem saveAs;
	private JMenuItem openFolder;
	private JMenuItem exitItem;

	public MenuBar() {

		Build();
		LoadComponents();

	}






	public void Build() {



		this.setBounds(
			PreferencesBoard.toolBar_menuBar_left,
			PreferencesBoard.toolBar_menuBar_top,
			PreferencesBoard.toolBar_menuBar_width,
			PreferencesBoard.toolBar_menuBar_height
		);
		
		this.setUI(new BasicMenuBarUI() {
		
			@Override
		    public void paint(Graphics g, JComponent c) {
		    	g.setColor(PreferencesBoard.toolBar_background);
		        g.fillRect(0, 0, c.getWidth(), c.getHeight());
		    }

		});

		this.setBorder(PreferencesBoard.topAndBottom_border);



	}






	public void LoadComponents() {




		JMenu fileMenu = new JMenu("  File  ");
		fileMenu.setForeground(PreferencesBoard.toolBar_menu_foreground);
		fileMenu.setFont(PreferencesBoard.toolBar_menu_font);
	

		newFile = new JMenuItem("New File");
		fileMenu.add(newFile);

		openFile = new JMenuItem("Open File");
		fileMenu.add(openFile);


		saveFile = new JMenuItem("Save File");
		fileMenu.add(saveFile);

		saveAs = new JMenuItem("Save As...");
		fileMenu.add(saveAs);


		openFolder = new JMenuItem("Open Folder");
		fileMenu.add(openFolder);

		exitItem = new JMenuItem("Exit");
		fileMenu.add(exitItem);

		this.add(fileMenu);




		JMenu toolMenu = new JMenu("  Tools  ");
		toolMenu.setForeground(PreferencesBoard.toolBar_menu_foreground);
		toolMenu.setFont(PreferencesBoard.toolBar_menu_font);




		newFile.addActionListener(this);
		openFile.addActionListener(this);
		saveFile.addActionListener(this);
		saveAs.addActionListener(this);
		openFolder.addActionListener(this);
		exitItem.addActionListener(this);




		this.add(toolMenu);





	}




	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==exitItem) {
			RelatedToolBarController.OnExitItem();
		}

		if(e.getSource()==openFile) {
			RelatedToolBarController.OnOpenFileItem();
		}


	}


}
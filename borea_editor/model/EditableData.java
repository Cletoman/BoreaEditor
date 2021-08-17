package borea_editor.model;


public class EditableData {

	private String filePath;
	private boolean isSaved;


	public EditableData() {


	}

	public String GetFilePath() {

		return this.filePath;

	}

	public boolean IsSaved() {

		return this.isSaved;

	}



	public void SetFilePath(String filePath) {

		this.filePath = filePath;

	}


	public void SetSaved(boolean isSaved) {

		this.isSaved = isSaved;

	}



}
import java.awt.*;

public class MyMenuBar extends MenuBar{
	
	Menu menuFile = new Menu("file");
	Menu menuModify = new Menu("modify");
	Menu menuEdit = new Menu("edit");
	MenuItem mNew = new MenuItem("new");
	MenuItem mOpen = new MenuItem("open");
	MenuItem mSave = new MenuItem("save");
	MenuItem mExit = new MenuItem("exit");
	MenuItem mFind = new MenuItem("find");
	MenuItem mReplace = new MenuItem("replace");
	MenuItem mFont = new MenuItem("change font");
	MenuItem mColor = new MenuItem("change Color");

	public MyMenuBar(){
		super();
		menuFile.add(mNew);
		menuFile.add(mOpen);
		menuFile.add(mSave);
		menuFile.add(mExit);
		menuModify.add(mFind);
		menuModify.add(mReplace);
		menuEdit.add(mFont);
		menuEdit.add(mColor);
		
		
		this.add(menuFile);
		this.add(menuModify);
		this.add(menuEdit);
	}
}
         
      
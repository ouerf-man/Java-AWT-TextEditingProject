import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;


public class MyActionListenerForFont implements ActionListener{
	public void actionPerformed(ActionEvent e ){
		if(MyMainFrame.fontFrame.dropListFontStyle.getSelectedIndex()== -1 || MyMainFrame.fontFrame.dropListFontName.getSelectedIndex() == -1 || MyMainFrame.fontFrame.dropListFontSize.getSelectedIndex() == -1)System.out.println("u have to choose one item from every option");
		else{
			Font font = new Font(MyMainFrame.fontFrame.dropListFontName.getSelectedItem(),MyMainFrame.fontFrame.dropListFontStyle.getSelectedIndex(),Integer.parseInt(MyMainFrame.fontFrame.dropListFontSize.getSelectedItem()));
		MyMainFrame.ta.setFont(font);
		MyMainFrame.fontFrame.setVisible(false);
		MyMainFrame.fontFrame=null;
		System.gc();
			}
		}
	
	
	
}
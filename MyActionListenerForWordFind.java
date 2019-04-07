import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;


public class MyActionListenerForWordFind implements ActionListener{
	
	public void actionPerformed(ActionEvent e ){
		
		StringBuffer sb =new StringBuffer( MyMainFrame.ta.getText());
		System.out.println("wanted word is in index : " + sb.indexOf(MyMainFrame.findFrame.ta.getText()));
		/*
		MyMainFrame.ta.setSelectionStart(sb.indexOf(MyMainFrame.findFrame.ta.getText()));
		MyMainFrame.ta.setSelectionEnd(sb.indexOf(MyMainFrame.findFrame.ta.getText()) + 						MyMainFrame.findFrame.ta.getText().length());
		*/
		MyMainFrame.findFrame.setVisible(false);
		MyMainFrame.findFrame=null;
		System.gc();
		
	}
}
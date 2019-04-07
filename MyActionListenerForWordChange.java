import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class MyActionListenerForWordChange implements ActionListener{
	public void actionPerformed(ActionEvent e ){
		StringBuffer sb = new StringBuffer(MyMainFrame.ta.getText());
		String oldWord = MyMainFrame.replaceFrame.oldWord.getText();
		String newWord = MyMainFrame.replaceFrame.newWord.getText();
		sb = replaceLogic(oldWord,newWord,sb);
		MyMainFrame.ta.setText(sb.toString());
		MyMainFrame.replaceFrame.setVisible(false);
		MyMainFrame.replaceFrame=null;
		System.gc();
		
		}
	
	private StringBuffer replaceLogic(String oldW , String newW , StringBuffer sb){
		
		int fromIndex = 0 ; //search will start from this index
		while(sb.indexOf(oldW,fromIndex)>= 0){
			System.out.println(sb.indexOf(oldW,fromIndex));
			sb=sb.replace(sb.indexOf(oldW,fromIndex),sb.indexOf(oldW,fromIndex)+oldW.length(),newW );
			
		}
		return sb;
	}
}
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;


public class MyActionListenerForColor implements ActionListener{
	public void actionPerformed(ActionEvent e ){
		switch(MyMainFrame.colorFrame.dropListColor.getSelectedIndex()) {
			case 0 : MyMainFrame.ta.setForeground(Color.black);break;
			case 1 : MyMainFrame.ta.setForeground(Color.blue);break;
			case 2 : MyMainFrame.ta.setForeground(Color.yellow);break;
			case 3 : MyMainFrame.ta.setForeground(Color.red);break;
			case 4 : MyMainFrame.ta.setForeground(Color.green);break;
			default : System.out.println("choose a color");
		}
		
		MyMainFrame.colorFrame.setVisible(false);
		MyMainFrame.colorFrame=null;
		System.gc();
			
	}
	
	
	
}
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ReplaceFrame extends Frame{
	Panel pNorth = new Panel();
	Panel pSouth = new Panel();
	Panel oldWordPan = new Panel();
	Panel newWordPan = new Panel();
	Button bSubmitReplace = new Button("Replace");
	TextField oldWord = new TextField("", 10);
	TextField newWord = new TextField("", 10);
	
	public ReplaceFrame(){
		this.setLayout(new GridLayout(2,2));
		this.add(pNorth);
		this.add(pSouth);
		this.setVisible(true);		
		oldWordPan.add(new Label("old word"));
		oldWordPan.add(oldWord);
		newWordPan.add(new Label("new word"));
		newWordPan.add(newWord);
		pNorth.add(oldWordPan);pNorth.add(newWordPan);
		pSouth.add(bSubmitReplace);
		this.setBounds(10,10,500,100);
		bSubmitReplace.addActionListener(new MyActionListenerForWordChange());

	this.addWindowListener(new WindowAdapter() {
       
      		  public void windowClosing(WindowEvent e) {
            			 
               		 	dispose();
      		  }
	});		
		
	}

	
}
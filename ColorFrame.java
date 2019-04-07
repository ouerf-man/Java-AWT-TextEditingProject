import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ColorFrame extends Frame{
	
	Panel pNorth = new Panel();
	Panel pSouth = new Panel();
	Button bSubmit = new Button("confirm");
	List dropListColor = new List(5,false) ;
	Label lbColor ;
	public ColorFrame(){
		dropListColor.add("Black");dropListColor.add("Blue");dropListColor.add("Yellow");dropListColor.add("Red");
		dropListColor.add("Green");
		
		lbColor = new Label("Color : ");

		pNorth.add(lbColor);
		  pNorth.add(dropListColor);
      		
   
		pSouth.add(bSubmit);
		this.add(pNorth);
		this.add(pSouth,BorderLayout.PAGE_END);
		this.setSize(300,200);
		this.setVisible(true);
		this.setResizable(false);
		bSubmit.addActionListener(new MyActionListenerForColor() );
	
		this.addWindowListener(new WindowAdapter() {
       
      		  public void windowClosing(WindowEvent e) {
            			 
               		 	dispose();
      		  }
});
	}

}
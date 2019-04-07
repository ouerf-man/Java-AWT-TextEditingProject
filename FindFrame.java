import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class FindFrame extends Frame{
	
	Panel pNorth = new Panel(new GridBagLayout());
	Panel pSouth = new Panel();
	Button bSubmit = new Button("Find");
	 TextField ta = new TextField("",10);
	Label lbSearch ;
	public FindFrame(){
		

		lbSearch = new Label("search : ");
        	  	pNorth.add(ta);
   
		pSouth.add(bSubmit);
		this.add(pNorth);
		this.add(pSouth,BorderLayout.PAGE_END);
		this.setSize(300,100);
		this.setVisible(true);
		bSubmit.addActionListener(new MyActionListenerForWordFind() );
	
		this.addWindowListener(new WindowAdapter() {
       
      		  public void windowClosing(WindowEvent e) {
            			 
               		 	dispose();
      		  }
});
	}

}